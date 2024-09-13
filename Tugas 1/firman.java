import java.util.Scanner;
import java.lang.String;

public class firman {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM   : ");
        int nim = sc.nextInt();

        System.out.println("NAMA "+ nama +"\nNIM "+ nim);

    }
}