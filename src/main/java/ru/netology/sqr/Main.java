package ru.netology.sqr;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        int result = service.countSqrNumbersInRange(300,600);
        System.out.println(result);
    }
}
