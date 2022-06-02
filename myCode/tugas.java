import java.util.Scanner;
public class tugas {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Angka");
        int nilai = input.nextInt();
        

        if (nilai < 70 ){
            System.out.println("D");
        }
        else if (nilai < 80){
            System.out.println("C");
        }
        else if (nilai < 90){
            System.out.println("B");
        }
        else (nilai < 100){
            System.out.println("A");
        }
    }
}
