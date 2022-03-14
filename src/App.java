import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int rep;
        do{
            Scanner input =  new Scanner(System.in);
            System.out.println(" ========== ");
            System.out.println(" Menu Utama ");
            System.out.println(" ========== ");
            System.out.println(" 1. Hitung Balok ");
            System.out.println(" 2. Hitung Tabung ");
            System.out.println(" 0. exit");
            System.out.print(" Pilih ");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print(" Input Panjang : ");
                    int panjang = input.nextInt();
                    System.out.print(" Input Lebar : ");
                    int lebar = input.nextInt();
                    System.out.print(" Input Tinggi : ");
                    int tinggi = input.nextInt();
                    Balok bidang = new Balok(panjang, lebar, tinggi);
                    bidang.luas();
                    bidang.keliling();
                    bidang.volume();
                    bidang.luasPermukaan();
                    break;
                case 2: System.out.print(" Input Jari - Jari : ");
                        double r = input.nextDouble();
                        System.out.print(" Input Tinggi : ");
                        double tinggi2 = input.nextDouble();
                        Tabung Ruang = new Tabung(r, tinggi2);
                        Ruang.luas();
                        Ruang.keliling();
                        Ruang.volume();
                        Ruang.luasPermukaan();
                    break;
                case 0: System.exit(0);
                    break;
                default: System.out.println("Opsi tidak ada, Mohon masukkan opsi dengan benar");
                    break;
            }
            System.out.print(" Hitung Lagi ? [iya:1 | tidak:0] : " );
            rep = input.nextInt();
        }while(rep == 1);
        
    }
}
