import java.text.DecimalFormat;

public class Main {
    public static void tinhLaiKep(int p ,int t, double r, int n){
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("Lãi kép sau " + t + " năm là : "+decimalFormat.format(cinterest));
        System.out.println("Số tiền có được sau " + t + " năm là: "+decimalFormat.format(amount));
    }
    public static void main(String[] args) {
        tinhLaiKep(2000, 5, .08, 12);
    }
}
