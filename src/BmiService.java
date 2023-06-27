public class BmiService {
    public int calculate(int kilograms, double height) {
        double result;
        result = kilograms / (height * height);
        return (int) result;
    }
}
