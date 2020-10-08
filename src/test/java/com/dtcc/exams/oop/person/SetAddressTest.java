package com.dtcc.exams.oop.person;

import com.dtcc.exams.oop.Address;
import com.dtcc.exams.oop.Person;
import org.junit.Assert;
import org.junit.Test;

public class SetAddressTest {
    @Test
    public void test1() {
        // given
        Person person = new Person();
        Address expected = new Address();
        
        // when
        person.setAddress(expected);
        Address actual = person.getAddress(); 
        
        // then
        Assert.assertEquals(expected, actual);
    }
}
