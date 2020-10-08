package com.dtcc.exams.oop.person;

import com.dtcc.exams.oop.Person;
import org.junit.Assert;
import org.junit.Test;

public class SetIdTest {
    @Test
    public void test1() {
        // given
        Person person = new Person();
        Long expected = Long.MAX_VALUE;

        // when
        person.setId(expected);
        Long actual = person.getId();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        Person person = new Person();
        Long expected = Long.MIN_VALUE;

        // when
        person.setId(expected);
        Long actual = person.getId();

        // then
        Assert.assertEquals(expected, actual);
    }
}
