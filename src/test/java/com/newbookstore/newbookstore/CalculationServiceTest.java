package com.newbookstore.newbookstore;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculationServiceTest {

    @Autowired
    private CalculationService calculationService;
    @Test
    public void calculateValue() {
        int result = calculationService.calculateValue(2);
        Assert.assertEquals(9, result);
//vxc asdfsdf wfewr
    }
}