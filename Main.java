import com.stewie.Console;
import com.stewie.MortgageCalc;
import com.stewie.MortgageReport;

public class Main {
    public static void main(String[] args) {
        int principle = (int) Console.readNumber("Enter a number between 1,000 and 1,000,000: ", 1_000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Enter a number between 1 and 30: ", 1, 30);
        byte years = (byte) Console.readNumber("Enter a numbe 1 and 30: ", 1, 30);

        var calc = new MortgageCalc(principle, annualInterest, years);
        var report = new MortgageReport(calc);

        report.printMortgage();
        report.printPaymentSchedule();
    }
}