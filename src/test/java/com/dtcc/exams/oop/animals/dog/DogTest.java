package com.dtcc.exams.oop.animals.dog;

import com.dtcc.exams.oop.animals.Animal;
import com.dtcc.exams.oop.animals.Dog;
import com.dtcc.exams.oop.animals.Woofer;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void testInheritance() {
        Animal dog = (Animal)(Object)new Dog();

        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void testImplementation() {
        Woofer dog = (Woofer)(Object)new Dog();

        Assert.assertTrue(dog instanceof Woofer);
    }

    @Test
    public void testSpeak() {
        // given
        Dog dog = new Dog();
        String expected = "Woof!\nWoof!";

        // when
        String actual = dog.speak();

        // then
        Assert.assertEquals(expected, actual);
    }
}
