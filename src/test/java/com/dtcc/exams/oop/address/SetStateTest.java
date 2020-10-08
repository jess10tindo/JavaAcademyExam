package com.dtcc.exams.oop.address;

import com.dtcc.exams.oop.Address;
import org.junit.Assert;
import org.junit.Test;

public class SetStateTest {
    @Test
    public void test1() {
        // Given
        Address address = new Address();
        String expected = "Pennsylvania";

        // when
        address.setState(expected);
        String actual = address.getState();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // Given
        Address address = new Address();
        String expected = "Maryland";

        // when
        address.setState(expected);
        String actual = address.getState();

        // then
        Assert.assertEquals(expected, actual);
    }
}
