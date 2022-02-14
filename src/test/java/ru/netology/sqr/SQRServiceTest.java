package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void SquareNumberFrom200To300() {
        SQRService service = new SQRService();
        int num1 = 200;
        int num2 = 300;
        int expected = 3;

        int actual = service.squareNumber(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    void SquareNumberFrom500To800() {
        SQRService service = new SQRService();
        int num1 = 500;
        int num2 = 800;
        int expected = 6;

        int actual = service.squareNumber(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    void SquareNumberFrom600To900() {
        SQRService service = new SQRService();
        int num1 = 600;
        int num2 = 900;
        int expected = 6;

        int actual = service.squareNumber(num1, num2);
        assertEquals(expected, actual);
    }


}