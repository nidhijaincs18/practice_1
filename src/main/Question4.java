package main;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        Ques4 q = new Ques4(str);
        System.out.println(q.vowels());
    }
}

class Ques4 {
    private String str;

    public Ques4(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String vowels() {
        StringBuilder sb = new StringBuilder();
        String s2 = "*^!";
        int temp = 0;
        for (int i = 0; i < getStr().length(); i++) {
            char c = getStr().charAt(i);
            if (temp < 3) {
                if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'O' || c == 'o' || c == 'U' || c == 'u') {
                    sb.append(s2.charAt(temp));
                    temp += 1;
                } else {
                    sb.append(c);
                }
            } else {
                temp = 0;
                i--;
            }

        }
        return sb.toString();
    }


}