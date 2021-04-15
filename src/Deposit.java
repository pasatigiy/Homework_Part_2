public class Deposit {
    public static void main(String[] args) {
        float sum = 100;
        int period = 2;
        int i = 1;
        for (; i<=period; i++){
           float sum2 = (float) (sum + sum*0.07);
           sum = sum2;
        } System.out.println(sum);
    }
}
