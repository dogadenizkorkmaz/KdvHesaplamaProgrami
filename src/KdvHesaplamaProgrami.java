import java.sql.SQLOutput;
import java.util.Scanner;

public class KdvHesaplamaProgrami {
    public static void main(String[] args) {
        // KDV'siz tutar girişi tanımla
        double i;
        //scanner sınıfı tanımla
        Scanner inp=new Scanner(System.in);
        //kullanıcıdan değeri al
        System.out.print("Ücret Tutarını Giriniz : ");
        i=inp.nextDouble();

        //KDVsiz tutara %18 lik KDV eklenir.
        double a=0.18;
        double x=a*i;
        double kdv = x + i;

        System.out.println("KDV'siz Tutar : " + i);
        System.out.println("KDV Oranı : " + a);
        System.out.println("KDV Tutarı : " + x);
        System.out.println("KDV'li Fiyat : " + kdv);
    }
}
