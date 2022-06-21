import java.util.Scanner;

public class CevreveAlanHesaplama {
    public static void main(String[] args) {

        int y;

        double pi = 3.14, alan, cevre,merkezAlan, sonuc;

        Scanner imp = new Scanner(System.in);


        System.out.print("Yarı Çapı Giriniz: " );
        y = imp.nextInt();

        alan = pi * y*y;
        cevre = 2 * pi * y;

        System.out.print("Merkez Açısı Ölçüsü Giriniz: ");
        merkezAlan = imp.nextDouble();

        sonuc = (pi*(y*y) * merkezAlan ) / 360;


        System.out.println("Alan Ölçüsü: " + alan);
        System.out.println("Çevre Ölçüsü: " + cevre);
        System.out.println("Daire Diliminin Alanı: "+ sonuc);


    }
}
