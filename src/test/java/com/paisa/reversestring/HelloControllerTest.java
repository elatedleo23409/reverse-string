
package com.paisa.reversestring;

import org.junit.jupiter.api.Test;

public class HelloControllerTest {
    @Test
    public void testReverse() {
        HelloController helloController = new HelloController();
        String result = helloController.reverse("paisa");
        assert result.equals("asiap");
    }
}