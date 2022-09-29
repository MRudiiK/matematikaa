package percabangan;
import java.util.Scanner;
public class Matematika {

    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int a;
        double b, c, d = 0;

        System.out.println("Menu Aplikasi Matematika :\n1. Penambaha  2. Pengurangan 3. Perkalian 4. Pembagian");
        System.out.print("pilih menu= ");
        a = prompt.nextInt();

        if (a > 0 && a < 5) {
            System.out.println("Masukan Angka Pertama");
            b = prompt.nextDouble();
            System.out.println("Masukan Angka kedua");
            c = prompt.nextDouble();
            if (a == 1) {
                d = b + c;
            } else if (a == 2) {
                d = b - c;
            } else if (a == 3) {
                d = b * c;
            } else if (a == 4) {
                d = b / c;
            }
            System.out.println("Hasil pembagian antara " + b + " dan " + c + " adalah " + d);
        } else {
            System.out.println("Pilihan Tidak Tersedia");
        }
    }
}
