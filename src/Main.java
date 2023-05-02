public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int indexMyBmi = service.calculate(50, 1.66);
        System.out.println(indexMyBmi);
    }
}