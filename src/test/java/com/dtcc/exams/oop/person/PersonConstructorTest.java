package com.dtcc.exams.oop.person;

import com.dtcc.exams.oop.Address;
import com.dtcc.exams.oop.Person;
import org.junit.Assert;
import org.junit.Test;

public class PersonConstructorTest {
    @Test
    public void testNullaryConstructor() {
        // given
        Person person = new Person();
        Long expectedId = Long.MIN_VALUE;
        String expectedName = "";
        Address expectedAddress = new Address();

        // when
        Long actualId = person.getId();
        String actualName = person.getName();
        Address actualAddress = person.getAddress();

        // then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAddress, actualAddress);
    }


    @Test
    public void testConstructor() {
        // given
        Long expectedId = Long.MAX_VALUE;
        String expectedName = "PersonName";
        Address expectedAddress = new Address("line1","line2", "city","state","99999");
        Person person = new Person(expectedId, expectedName, expectedAddress);

        // when
        Long actualId = person.getId();
        String actualName = person.getName();
        Address actualAddress = person.getAddress();

        // then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAddress, actualAddress);
    }
}
