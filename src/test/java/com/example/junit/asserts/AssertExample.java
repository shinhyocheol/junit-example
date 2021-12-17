package com.example.junit.asserts;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AssertExample {

    @Test
    public void assertEquals_case () {

        String str = new String("TEXT");

        assertEquals("TEST", str);
    }

}
