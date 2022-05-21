package day08_Ternary_Switch;

public class OxygenTank {

    public static void main(String[] args) {

        int level = 40;

        String num = (level == 90) ? "Tank is full"
                : (level == 80) ? "Still Ok"
                : (level == 70) ? "Don not go far"
                : (level == 60) ? "Start to head back"
                : (level == 50) ? "Be careful now you at 50%"
                : "Get a charge";

        System.out.println(num);
        // Solution 2

        String result;
        switch (level) {
            case 90:
                result = "Tank is full";
                break;
            case 80:
                result = "Still Ok";
                break;
            case 70:
                result = "Don't go far";
                break;
            case 60:
                result = "Start to head back";
                break;
            case 50:
                result = "Be careful no you at 50%";
                break;
            default:
                result = "Find to place to charge";
        }

        System.out.println(result);
    }
}

