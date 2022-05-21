package day07_ifStatements;

public class WeekDaysTask4 {

    public static void main(String[] args) {

        int number = 5;
        String weekDay = "";

        if (number ==  1) {
            weekDay ="Monday";
        }
        else if (number == 2) {
            weekDay = "Tuesday";
        }
        else if (number == 3) {
            weekDay = "Wednesday";
        }
        else if( number == 4) {
            weekDay = "Thursday";
        }
        else if ( number == 5) {
            weekDay = "Friday";
        }
        else if ( number == 6) {
            weekDay = "Saturday";
        }
        else if ( number == 7){
            weekDay = "Sunday";
        }

        System.out.println(weekDay);

    }
}
