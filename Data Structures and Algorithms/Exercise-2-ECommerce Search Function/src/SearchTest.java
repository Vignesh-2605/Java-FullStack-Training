public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Headphones", "Accessories"),
            new Product(104, "Keyboard", "Accessories"),
            new Product(105, "Mouse", "Accessories")
        };

        int searchId = 104;

        Product linearResult =
                SearchAlgorithms.linearSearch(products, searchId);

        System.out.println("Linear Search Result:");
        System.out.println(linearResult);

        Product binaryResult =
                SearchAlgorithms.binarySearch(products, searchId);

        System.out.println("\nBinary Search Result:");
        System.out.println(binaryResult);
    }
}