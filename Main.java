import com.stewie.MortgageCalc;

public class Main {
    public static void main(String[] args) {
        int principle = (int)MortgageCalc.readNumber("Enter a number between 1,000 and 1,000,000: ", 1_000, 1_000_000);
        float annualInterest = (float)MortgageCalc.readNumber("Enter a number between 1 and 30: ", 1, 30);
        byte years = (byte)MortgageCalc.readNumber("Enter a numbe 1 and 30: ", 1, 30);

        MortgageCalc.printMortgage(principle, annualInterest, years);
        MortgageCalc.printPaymentSchedule(principle, annualInterest, years);

    }
}