

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

        String interpretacja = "Nieprawidłowy wynik.";
        int bmi = (int)(calculate() * 100);

       if(bmi < 1600){
           interpretacja = "Wygłodzenie!";}

           else if (bmi >1600 || bmi <= 1699){
               interpretacja = "Wychudzenie!";
           }

           else if (bmi > 1699 || bmi <=1849 ){
               interpretacja = "Niedowaga";
       }
           else if (bmi > 1850 || bmi <= 2499){
               interpretacja = "Wartość prawidlowa";
       }
           else if (bmi > 2500 || bmi <= 2999){
               interpretacja = "Nadwaga";
       }
           else if (bmi > 3000 || bmi <= 3499){
               interpretacja = "I stopień otyłości";
       }
           else if (bmi > 3500 || bmi <= 3999){
               interpretacja = "II stopień otyłości (otyłość kliniczna";
       }
           else if (bmi >= 4000){
               interpretacja = "III stopień otyłości (otyłośc skrajna)";
       }

           return interpretacja;
       }

    }

