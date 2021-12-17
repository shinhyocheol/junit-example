package com.example.junit.asserts;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AssertExample {
    
    @Test
    public void assertEqualsExample () {

        //given
        String str = new String("TEXT");

        //when

        //then
        assertEquals("TEST", str);
    }

    @Test
    public void assertArrayEqualsExample () {

        //given
        String[] firstArr = new String[] {"1", "2"};
        String[] secondArr = new String[] {"1", "2"};

        //when

        //then
        assertArrayEquals(firstArr, secondArr);

    }



}
