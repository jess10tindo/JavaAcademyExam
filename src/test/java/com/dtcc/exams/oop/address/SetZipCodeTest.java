package com.dtcc.exams.oop.address;

import com.dtcc.exams.oop.Address;
import org.junit.Assert;
import org.junit.Test;

public class SetZipCodeTest {
    @Test
    public void test1() {
        // Given
        Address address = new Address();
        String expected = "19720";

        // when
        address.setZipcode(expected);
        String actual = address.getZipcode();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // Given
        Address address = new Address();
        String expected = "18713";

        // when
        address.setZipcode(expected);
        String actual = address.getZipcode();

        // then
        Assert.assertEquals(expected, actual);
    }
}
