package main;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

    }
}

class Ques1 {
    private String str;

    public Ques1(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String index() {
        StringBuilder sb = new StringBuilder();
        sb.append("index: ");
        for (int i = 0; i < getStr().length(); i++) {
            sb.append(i + "\t");

        }
        return sb.toString();
    }

    public String chars() {

    }

}
