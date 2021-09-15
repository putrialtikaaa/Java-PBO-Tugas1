import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args){
    
    float alas, tinggi, luassegitiga; //deklarasikan
    Scanner input = new Scanner(System.in);
    alas = input.nextFloat();
    tinggi = input.nextFloat();
    
    luassegitiga = alas*tinggi/2; //operator luas segitiga
    
    System.out.printf("%.2f\n", luassegitiga); //cetak luas segitiga
    }
            
}
