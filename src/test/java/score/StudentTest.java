package score;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void highestTest(){
        Student student = new Student("Ruby","048",60,100);
        Assertions.assertEquals(100,student.highest());
    }
    @Test
    public void  getAverageTest(){
        Student student = new Student("Ruby","048",60,100);
        Assertions.assertEquals((60+100)/2,student.getAverage());
    }
}
