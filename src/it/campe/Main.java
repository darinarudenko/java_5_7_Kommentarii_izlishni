package it.campe;

public class Main {

    public static void main(String[] args) {
        int x = 2;
        int y = 14;

        // y = x * y;
        // y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(y);
        System.out.println(x);
    }
}
