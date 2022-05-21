package day14_forLoop;

public class FIN {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIN");

            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
    }
}
