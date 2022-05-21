package day08_Ternary_Switch;

public class ChooseLanguage {

    public static void main(String[] args) {

        int number = 5;
        String num = (number == 1) ? "Hello, Thank you for your call"
                : (number == 2) ? "Hola,garcias para llamar"
                : (number == 3) ? "Marhaba,aradinigizicin tasekkurle"
                : (number == 4) ? "Privet,spasibo za vash zvonok"
                : (number == 5) ? "Assalomu alaykum, qo'ng'irog'ingiz uchun rahmat"
                : "Invalid number";
        System.out.println(num);
        // Solution 2 - Switch

        String result;

        switch (number) {
            case 1:
                result = "Hello, Thank you for your  call.";
                break;
            case 2:
                result = "Hola,garcias para llamar";
                break;
            case 3:
                result = "Marhaba,aradinigizicin tasekkurle";
                break;
            case 4:
                result = "Privet,spasibo za vash zvonok";
                break;
            case 5:
                result = "Assalomu alaykum, qo'ng'irog'ingiz uchun rahmat";
                break;
            default:
                result = "Invalid";
        }
        System.out.println(result);

    }
}



