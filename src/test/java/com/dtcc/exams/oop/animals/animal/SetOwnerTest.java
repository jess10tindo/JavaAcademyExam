package com.dtcc.exams.oop.animals.animal;

import com.dtcc.exams.oop.Address;
import com.dtcc.exams.oop.Person;
import com.dtcc.exams.oop.animals.Animal;
import org.junit.Assert;
import org.junit.Test;

public class SetOwnerTest {
    @Test
    public void setOwnerTest1() {
        // given
        Animal animal = new Animal();
        Address expectedAddress = new Address("123 MyAddress", "", "", "DE", "");
        Person expectedOwner = new Person(0L, "", expectedAddress);

        // when
        animal.setOwner(expectedOwner);
        Person actualOwner = animal.getOwner();
        Address actualAddress = animal.getAddress();

        // then
        Assert.assertEquals(expectedAddress, actualAddress);
        Assert.assertEquals(expectedOwner, actualOwner);
    }

    @Test
    public void setOwnerTest2() {
        // given
        Animal animal = new Animal();
        Address expectedAddress = new Address("789 MyAddress", "", "", "AZ", "");
        Person expectedOwner = new Person(10L, "", expectedAddress);

        // when
        animal.setOwner(expectedOwner);
        Person actualOwner = animal.getOwner();
        Address actualAddress = animal.getAddress();

        // then
        Assert.assertEquals(expectedAddress, actualAddress);
        Assert.assertEquals(expectedOwner, actualOwner);
    }
}
