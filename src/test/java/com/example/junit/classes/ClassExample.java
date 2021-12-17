package com.example.junit.classes;

import com.example.junit.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Field;

@SpringBootTest
public class ClassExample {

    @Test
    public void classPrintTest () throws Exception {

        //given
        String name = "shin";
        int age = 28;
        String phone = "01077309975";
        String favoriteFood = "pizza";

        //when
        Person person = new Person(name, age, phone, favoriteFood);

        //then
        Field[] fields = person.getClass().getDeclaredFields();
        for (Field field : fields) {

            Class<?> targetType = field.getType();
            System.out.println(field.getName() + " : " + field.get(this));
        }

    }

}
