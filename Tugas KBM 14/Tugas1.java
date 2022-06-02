import java.util.Scanner;
public class Tugas1{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nama : ");
        String nama = input.nextLine();
        System.out.println("Masukan Kelas :");
        String kelas = input.nextLine();

        
        System.out.println("Pilihan :");
        System.out.println("1. Volume Tabung :");
        System.out.println("2. Volume Kerucut :");
        int angka = input.nextInt();
        //jika saya memasukan angka 1 maka Program akan menghitung volume tabung
        //jika saya memasukan angka 2 maka Program akan menghitung volume kerucut

        if (angka == 1){
            double phi =  3.14;
            System.out.println("Masukan Jari-Jari :");
            int jari = input.nextInt();
            System.out.println("Masukan Tinggi :");
            int tinggi = input.nextInt();
            Double hasil = phi*jari*jari*tinggi;
            System.out.println("------------------------------");
            System.out.println("Nama : " +nama );
            System.out.println("Nama : " +kelas );
            System.out.println("------------------------------");
            System.out.println("Volume Tabung :" +hasil +" cm3");
            System.out.println("------------------------------");
            System.out.println("Program Selesai !");

        }
        else if (angka == 2){
            double phi = 3.14;
            System.out.println("Masukan Jari-Jari :");
            int jari = input.nextInt();
            System.out.println("Masukan Tinggi :");
            int tinggi = input.nextInt();
            Double volume = (1.0/3.0) * (phi * jari * jari) * tinggi;
            System.out.println("------------------------------");
            System.out.println("Nama : " +nama );
            System.out.println("Nama : " +kelas );
            System.out.println("------------------------------");
            System.out.println("Volume Kerucut : " +volume +" cm3");
            System.out.println("Program Selesai !");
        }
    }
}