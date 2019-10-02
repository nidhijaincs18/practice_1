package main;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        Ques8 q = new Ques8(str);


    }
}

class Ques8 {
    private String str;

    public Ques8(String str) {
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
