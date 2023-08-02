import java.util.Scanner;
public class DiziElemanlarininHarmonikOrtalamasiniBulma {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz : ");
        int n = imp.nextInt();

        double[] arr = new double[n];
        System.out.println("Dizi elemanlarını giriniz : ");
        for (int i = 0; i < n; i++){
            arr[i] = imp.nextDouble();
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / arr[i];
        }

        double harmonicMean = n / sum;
        System.out.println("Dizinin harmonik ortalaması :" + harmonicMean);
    }
}
