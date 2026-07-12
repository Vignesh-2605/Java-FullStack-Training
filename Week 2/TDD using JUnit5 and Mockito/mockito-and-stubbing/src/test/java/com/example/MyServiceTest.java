package com.example;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class MyServiceTest {

    @Test
    public void testExternalApi() {

        // Create a mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub the method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject the mock into the service
        MyService service = new MyService(mockApi);

        // Call the service
        String result = service.fetchData();

        // Verify the result
        assertEquals("Mock Data", result);
    }
}