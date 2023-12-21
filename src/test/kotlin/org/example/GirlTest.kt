package org.example

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class GirlTest {
    //kotlinTest
    @Test
    fun girlBmiTest(){
        val girl = Girl("Ruby",50f,1.8f)
        Assertions.assertEquals((50f/(1.8f*1.8f)),girl.bmi())
    }
    //javaTest
    @Test
    fun boyBmiTest(){
        val boy = Boy("Eric",80f,2f)
        Assertions.assertEquals((80f/(2f*2f)),boy.bmi())
    }


}