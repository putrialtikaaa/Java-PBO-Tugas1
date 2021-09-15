import java.util.Scanner;

public class BebekUntukTeman {
    public static void main(String[] args){
        int a, b, hasilpembagianbebek, sisabebek; //deklarasi 
    
        Scanner input = new Scanner(System.in); 
        a = input.nextInt();
        b = input.nextInt();
        
        hasilpembagianbebek = a/b; //operator pembagian bebeknya
        sisabebek = a%b; // sisa bebeknya pak dengklek
        
        System.out.println("masing-masing "+hasilpembagianbebek); //cetak jumlah bebek/orang
        System.out.println("bersisa "+sisabebek); //sisa bebek pak dengklek
    }
}
