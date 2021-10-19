public class BmiService {
    public double calculate(int mass, double height) {

        double bmi = mass / (height * height);
        return bmi;
    }

}
