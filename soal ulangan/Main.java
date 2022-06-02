import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        //deklarasi variabel
        int JawabanBenar, JawabanSalah, Nilai, Hasil;
        Nilai = 0;
        String [] Soal1 = {"1. Dibawah ini unsur-unsur drama yang tepat adalah...","A. Tema,amanat,alur","B. Orientasi,komplikasi,resolusi","C. Prolog,epilog"};
        String [] Soal2 = {"2. Dibawah ini pengertian Alur yang tepat adalah..","A. Pesan moral yang ingin disampaikan penulis kepada pembaca","B. Rangkaian peristiwa yang membentuk suatu kesatuan cerita","C. Pikiran pokok moral yang mendasari lakon drama"};
        String [] Soal3 = {"3. Latar/setting tidak hanyak merujuk kepada tempat,tetapi juga merujuk.","A. Bahasa,tatarias dan dialog","B. Tema,alur dan orientasi","C. Ruang,waktu dan alat-alat"};
        String [] Soal4 = {"4. Apa saja teknik-teknik dalam bermain drama","A. Teknik berperan,teknik hadir,teknik penutup","B. Teknik muncul,teknik memberi isi,teknik pengembangan","C. Teknik pembuka,teknik tengah,teknik penutup"};
        String [] Soal5 = {"5. Tokoh yang memiliki sifat jahat disebut...","A. antagonis","B. Protagonis","C. Tirtagonis"};
        String [] Soal6 = {"6. Salah satu tujuan dari pembuatan teks negosiasi adalah….","A. mengurangi atau menghilangkan perbedaan dan pertentangan antar pihak.","B. menghindari pertikaian antar perorangan.","C. melawan pihak yang kalah."};
        String [] Soal7 = {"7. Salah satu yang harus ada dalam teks negosiasi adalah bagian….","A. pembuka","B. alamat","C. nama lengkap"};
        String [] Soal8 = {"8. Berikut ini termasuk sturktur teks negosiasi secara kompleks, kecuali….","A. penwaran","B. pemanfaatan","C. permintaan"};
        String [] Soal9 = {"9. Dalam kegiatan debat, kita diberi kesepakatan untuk menyampaikan pendapat atau snggahan yang ditujukan pada….","A. narasumber","B. lawan debat","C. moderator"};
        String [] Soal10 = {"10. Kegiatan debat yang dilakukan oleh anggota parlemen termasuk jenis debat….","A. formal","B. terencana","C. informal"};
        System.out.println("-----|UJIAN KENAIKAN KELAS|-----");
        //soal 1
        for (int i = 0; i < Soal1.length;i++){
            System.out.println(Soal1[i]);
        }
        String jawaban1 = input.next();
        if (jawaban1.equals("A")){
            Nilai = Nilai+10;
        }
        //soal 2
        for (int i = 0; i < Soal2.length;i++){
            System.out.println(Soal2[i]);
        }
        String jawaban2 = input.next();
        if (jawaban2.equals("B")){
            Nilai = Nilai+10;
        }
        //soal 3
        for (int i = 0; i < Soal3.length;i++){
            System.out.println(Soal3[i]);
        }
        String jawaban3 = input.next();
        if (jawaban3.equals("C")){
            Nilai = Nilai+10;
        }
        //soal 4
        for (int i = 0; i < Soal4.length;i++){
            System.out.println(Soal4[i]);
        }
        String jawaban4 = input.next();
        if (jawaban4.equals("B")){
            Nilai = Nilai+10;
        }
        //soal 5
        for (int i = 0; i < Soal5.length;i++){
            System.out.println(Soal5[i]);
        }
        String jawaban5 = input.next();
        if (jawaban5.equals("A")){
            Nilai = Nilai+10;
        }
        //soal 6
        for (int i = 0; i < Soal6.length;i++){
            System.out.println(Soal6[i]);
        }
        String jawaban6 = input.next();
        if (jawaban6.equals("A")){
            Nilai = Nilai+10;
        }
        //soal 7
        for (int i = 0; i < Soal7.length;i++){
            System.out.println(Soal7[i]);
        }
        String jawaban7 = input.next();
        if (jawaban7.equals("A")){
            Nilai = Nilai+10;
        }
        //soal 8
        for (int i = 0; i < Soal8.length;i++){
            System.out.println(Soal8[i]);
        }
        String jawaban8 = input.next();
        if (jawaban8.equals("B")){
            Nilai = Nilai+10;
        }
        //soal 9
        for (int i = 0; i < Soal9.length;i++){
            System.out.println(Soal9[i]);
        }
        String jawaban9 = input.next();
        if (jawaban9.equals("B")){
            Nilai = Nilai+10;
        }
        //soal 10
        for (int i = 0; i < Soal10.length;i++){
            System.out.println(Soal10[i]);
        }
        String jawaban10 = input.next();
        if (jawaban10.equals("A")){
            Nilai = Nilai+10;
        }
        System.out.println(Nilai);
        
    }
}


