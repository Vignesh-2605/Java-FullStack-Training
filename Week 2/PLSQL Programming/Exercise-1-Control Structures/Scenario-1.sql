DECLARE
    CURSOR customer_cursor IS
        SELECT CustomerID, Age, InterestRate
        FROM Customers;

BEGIN
    FOR customer_rec IN customer_cursor LOOP

        IF customer_rec.Age > 60 THEN

            UPDATE Customers
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = customer_rec.CustomerID;

        END IF;

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Interest rate discount applied.');

END;
/