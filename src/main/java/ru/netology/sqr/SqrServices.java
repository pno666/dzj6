package ru.netology.sqr;

public class SqrServices {
    public int calcSqr(int b, int t) {
        int x = 0;
        for (int i = 10;i <= 99; i++) {
            if (b <= i * i) {
                if (i * i <= t) {
                    x = x + 1;
                } else {
                    break;
                }
            } else {
                continue;
            }
        }
        return x;
    }

}
