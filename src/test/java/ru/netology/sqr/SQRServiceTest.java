package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void souldSelectSqrNumberInGivenRange() {
        SQRService service = new SQRService();

        int actual = service.countSqrNumbersInRange(300,600);
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }
}
