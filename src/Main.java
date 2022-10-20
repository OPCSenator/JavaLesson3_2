public class Main {
    public static void main(String[] args) {
        float bodyweight = 100; // вес человека
        float bodyhigh = 190; // рост человека в сантиметрах

        BmiService service = new BmiService();

        float bmi = service.calculate(bodyweight, bodyhigh / 100);

        System.out.println("индекс массы тела человека:" + bmi);
    }
}