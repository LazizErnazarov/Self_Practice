package day08_Ternary_Switch;

public class Loans {

    public static void main(String[] args) {

        int Salary = 59000,
                creditScore = 650;

        String loanRequest = (Salary >= 60000 && creditScore >= 650)
                ? "Loan Approved" : "Loan Denied";

        System.out.println("loanRequest = " + loanRequest);


    }
}
