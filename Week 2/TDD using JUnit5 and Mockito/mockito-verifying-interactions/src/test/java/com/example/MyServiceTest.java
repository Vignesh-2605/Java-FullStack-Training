package com.example;

import static org.mockito.Mockito.*;

import org.junit.Test;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {

        // Create a mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Create the service using the mock
        MyService service = new MyService(mockApi);

        // Call the method
        service.fetchData();

        // Verify the interaction
        verify(mockApi).getData();
    }
}