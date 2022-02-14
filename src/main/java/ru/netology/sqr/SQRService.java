package ru.netology.sqr;

public class SQRService {
    public int squareNumber(int num1, int num2) {
        int sum = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= num1) {
                if (i * i <= num2) {
                    sum = sum + 1;
                    if (i * i > num2) {
                        return sum;
                    }
                }
            }
        }
        return sum;
    }
}