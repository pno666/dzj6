package ru.netology.sqr;

public class SqrServices {
    public int calcSqr(int bottom, int top) {
        int sqrQuantity = 0;
        for (int i = 10;i <= 99; i++) {
            if (bottom <= i * i) {
                if (i * i <= top) {
                    sqrQuantity = sqrQuantity + 1;
                } else {
                    break;
                }
            } else {
                continue;
            }
        }
        return sqrQuantity;
    }

}
