package main;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

    }
}

class Ques9 {
    private String str;

    public Ques9(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int upperWeight() {
        int sum = 0;
        for (int i = 0; i < getStr().length(); i++) {
            if (getStr().charAt(i) >= 65 && getStr().charAt(i) <= 90) {
                sum += (int) getStr().charAt(i);
            }
        }
        return sum;
    }

}