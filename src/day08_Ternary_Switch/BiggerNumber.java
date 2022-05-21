package day08_Ternary_Switch;

public class BiggerNumber {

    public static void main(String[] args) {

        int n1 = 4;
        int n2 = 5;
        int n3 = 6;

        String result = //(n1==4 && n2==5 && n3==6)?
                (n1 > n2 && n1 > n3) ? "n1 is bigger"
                        : (n2 > n1 && n2 > n3) ? "n2 is bigger"
                        : "n3 is bigger";
        System.out.println(result);
    }
}