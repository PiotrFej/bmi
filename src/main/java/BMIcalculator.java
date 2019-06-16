

public class BMIcalculator implements Calculator{

    double weight;
    double height;

    public BMIcalculator(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public double calculate() {
        return weight/Math.pow(height, 2);
    }

    @Override
    public String interpret() {

        String interpretacja = "Nieprawidlowy wynik.";
        double bmi = calculate();

       if(bmi < 16.00){
           interpretacja = "Wyglodzenie!"; }

           else if (bmi >16.00 && bmi <= 16.99){
               interpretacja = "Wychudzenie!";
           }

           else if (bmi > 16.99 && bmi <=18.49 ){
               interpretacja = "Niedowaga";
       }
           else if (bmi > 18.50 && bmi <= 24.99){
               interpretacja = "Wartosc prawidlowa";
       }
           else if (bmi > 25.00 && bmi <= 29.99){
               interpretacja = "Nadwaga";
       }
           else if (bmi > 30.00 && bmi <= 34.99){
               interpretacja = "I stopien otylosci";
       }
           else if (bmi > 35.00 && bmi <= 39.99){
               interpretacja = "II stopień otyłości (otyłość kliniczna";
       }
           else if (bmi >= 40.00){
               interpretacja = "III stopień otyłości (otyłośc skrajna)";
       }

           return interpretacja;
       }

    }

