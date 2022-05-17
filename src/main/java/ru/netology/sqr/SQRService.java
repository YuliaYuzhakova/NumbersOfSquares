package ru.netology.sqr;

public class SQRService {
    public int countSqrNumbersInRange(int range1, int range2) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if ((x >= range1) && (x <= range2)) {
                count++;
            }
        }
        return count;
    }
}
