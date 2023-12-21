package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoyTest {
    @Test
    public void bmiTest(){
        Boy boy = new Boy(60,1.7f);
        Assertions.assertEquals(60/(1.7f*1.7f),boy.bmi());

    }
}
