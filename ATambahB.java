import java.util.Scanner;

public class ATambahB {
    public static void main(String[] args){
       
        int A, B, jumlahseluruhnya; //deklarasi
        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        B = input.nextInt();
        jumlahseluruhnya = A + B; //operator yang digunakan
        
        System.out.println(jumlahseluruhnya); //cetak jumlah bebek 
    }
}
