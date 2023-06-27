public class BmiService {
    public int calculate(int kilograms, double growthSquared) {
        double result;
        result = kilograms / (growthSquared * growthSquared);
        return (int) result;
    }
}
