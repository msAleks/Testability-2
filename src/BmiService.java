public class BmiService {
    public int calculate(int weight, double height) {
        double indexMyBmi = weight / (height+height);
        return (int) indexMyBmi;
    }
}
