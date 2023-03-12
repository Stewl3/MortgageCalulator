import com.stewie.Console;
import com.stewie.MortgageCalc;
import com.stewie.MortgageReport;

public class Main {
    public static void main(String[] args) {
        int principle = (int) Console.readNumber("Enter the Principle (1,000 - 1,000,000): ", 1_000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Enter the Interest rate (1% - 10%): ", 1, 10);
        byte years = (byte) Console.readNumber("Enter the length of loan (1 - 30 years): ", 1, 30);

        var calc = new MortgageCalc(principle, annualInterest, years);
        var report = new MortgageReport(calc);

        report.printMortgage();
        report.printPaymentSchedule();
    }
}