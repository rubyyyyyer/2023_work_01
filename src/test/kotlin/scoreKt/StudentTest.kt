package scoreKt

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {
    val student = Student("Ruby","1024",60,100)
    @Test
    fun getAverageTest(){
        Assertions.assertEquals(((60+100)/2),student.getAverage())
    }
    @Test
    fun highestTest(){
        Assertions.assertEquals(100,student.highest())
    }
    @Test
    fun gradingTest(){
        Assertions.assertEquals('B',student.grading())
    }
    @Test
    fun passOrFailedTest(){
        Assertions.assertEquals("PASS",student.passOrFailed())
    }
}