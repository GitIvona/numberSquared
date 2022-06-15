package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void zeroRange() {
        SQRService service = new SQRService();

        int actual = service.Squared(0, 0);

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void invalidRange() {
        SQRService service = new SQRService();

        int actual = service.Squared(300, 200);

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countZero() {
        SQRService service = new SQRService();

        int actual = service.Squared(10, 99);

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void count() {
        SQRService service = new SQRService();

        int actual = service.Squared(200, 300);

        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }


}