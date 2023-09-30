package test;

import info.nahid.MyMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    private MyMath math = new MyMath();

    @Test
    void calculateSum_ThreeMemberArray() {
        assertEquals(6, math.calculateSum(new int[]{1,2,3}));
    }

    @Test
    void calculateSum_ZeroLengthArray() {
         //include four line in one code using refector inline method
         //int[] numbers = {1,2,3};
         //int result = math.calculateSum(numbers);
         //int expectedResult = 6;
         //assertEquals(expectedResult, result);
        assertEquals(0, math.calculateSum(new int[] {}));
    }

}