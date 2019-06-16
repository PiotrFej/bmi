import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Podaj swoja wage w kg: ");
       double weight = scanner.nextDouble();

        System.out.println("Podaj swoj wzrost w metrach: ");
        double height = scanner.nextDouble();
        scanner.close();

    BMIcalculator bmIcalculator = new BMIcalculator(weight, height);
        System.out.println("Twoje BMI wynosi: " + bmIcalculator.calculate());
        System.out.println(bmIcalculator.interpret());


}
}