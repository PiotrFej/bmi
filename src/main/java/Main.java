import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
       System.out.println("Podaj swoja wage w kg: ");
    int weight = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Podaj swoj wzrost w metrach: ");
        int height = scanner2.nextInt();
        scanner.close();

    BMIcalculator bmIcalculator = new BMIcalculator(weight, height);
        System.out.println("Twoje BMI wynosi: " + bmIcalculator.calculate());
        System.out.println(bmIcalculator.interpret());


}
}