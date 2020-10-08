package com.dtcc.exams.oop.person;

import com.dtcc.exams.oop.Person;
import org.junit.Assert;
import org.junit.Test;

public class SetNameTest {
    @Test
    public void test1() {
        // given
        Person person = new Person();
        String expected = "My Person Name";

        // when
        person.setName(expected);
        String actual = person.getName();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        Person person = new Person();
        String expected = "My Person Namee";

        // when
        person.setName(expected);
        String actual = person.getName();

        // then
        Assert.assertEquals(expected, actual);
    }
}