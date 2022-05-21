package day14_forLoop;

public class Shape {

    public static void main(String[] args) {
        String str = "";
        char ch = '*';

        for (int i = 1; i <= 8; i++) {

            str += ch + " ";

        }
        System.out.println((str + "\n").repeat(8));
    }
}

