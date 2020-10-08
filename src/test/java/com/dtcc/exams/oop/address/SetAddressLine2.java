package com.dtcc.exams.oop.address;

import com.dtcc.exams.oop.Address;
import org.junit.Assert;
import org.junit.Test;

public class SetAddressLine2 {
    @Test
    public void test1() {
        // Given
        Address address = new Address();
        String expected = "123 Cool Street";

        // when
        address.setAddressLine2(expected);
        String actual = address.getAddressLine2();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // Given
        Address address = new Address();
        String expected = "587 The Lane";

        // when
        address.setAddressLine2(expected);
        String actual = address.getAddressLine2();

        // then
        Assert.assertEquals(expected, actual);
    }
}
