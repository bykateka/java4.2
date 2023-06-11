public class BmiService {
    public int calculate(int kilograms, double squaremeter) {
        double result;
        result = kilograms / (squaremeter * squaremeter);
        return (int) result;
    }
}
