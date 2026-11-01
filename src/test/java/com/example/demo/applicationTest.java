
package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class applicationTest {

    @Test
    void homeReturnsPipelineSuccessMessage() {
        application app = new application();
        String result = app.home();

        assertTrue(result.contains("Cloud CI/CD Pipeline Successful!"));
        assertTrue(result.contains("Version: v1"));
    }

    @Test
    void healthReturnsUp() {
        application app = new application();

        assertEquals("UP", app.health());
    }
}
