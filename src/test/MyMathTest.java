package test;

import info.nahid.MyMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @Test
    void test() {

        int[] numbers = {1,2,3};
        MyMath math = new MyMath();
        int result = math.calculateSum(numbers);
        System.out.println(result);
        int expectedResult = 6;
        assertEquals(expectedResult, result);
    }
}