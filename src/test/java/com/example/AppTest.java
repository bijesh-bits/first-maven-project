
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void greetShouldHandleNull() {
        assertEquals("Hello, World!", App.greet(null));
    }

    @Test
    void greetShouldTrimName() {
        assertEquals("Hello, SonarQube!", App.greet(" SonarQube "));
    }
}
