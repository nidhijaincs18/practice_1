package main;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
    }
}

class Ques7 {
    private String str;

    public Ques7(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int totalWeight() {
        int sum = 0;
        for (int i = 0; i < getStr().length(); i++) {
            sum += (int) str.charAt(i);
        }
        return sum;
    }
}
