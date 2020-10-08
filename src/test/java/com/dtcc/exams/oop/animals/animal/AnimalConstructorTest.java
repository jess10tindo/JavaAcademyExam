package com.dtcc.exams.oop.animals.animal;

import com.dtcc.exams.oop.Address;
import com.dtcc.exams.oop.Person;
import com.dtcc.exams.oop.animals.Animal;
import org.junit.Assert;
import org.junit.Test;

public class AnimalConstructorTest {

    @Test
    public void nullaryConstructor() {
        // Given
        Person expectedOwner = new Person();
        Address expectedAddress = expectedOwner.getAddress();
        Long expectedId = null;

        // when
        Animal animal = new Animal();
        Person actualOwner = animal.getOwner();
        Address actualAddress = animal.getAddress();
        Long actualId = animal.getId();

        // then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedOwner, actualOwner);
        Assert.assertEquals(expectedAddress, actualAddress);
    }

    @Test
    public void nonNullaryConstructor() {
        // Given
        Person expectedOwner = new Person(null, null, new Address());
        Address expectedAddress = expectedOwner.getAddress();
        Long expectedId = null;

        // when
        Animal animal = new Animal(expectedId, expectedOwner);
        Person actualOwner = animal.getOwner();
        Address actualAddress = animal.getAddress();
        Long actualId = animal.getId();

        // then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedOwner, actualOwner);
        Assert.assertEquals(expectedAddress, actualAddress);
    }
}
