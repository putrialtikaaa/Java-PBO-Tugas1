import java.util.Scanner;

public class TransposMatriks {
    public static void main(String[] args){
        int c,d;
        int a = 3, b = 3;
        
        int matriks[][] = new int[3][3];
        int transpos[][] = new int[3][3];
        
        Scanner input = new Scanner(System.in);
        // untuk matriks input
        for(c=0; c<a; c++){
            for(d=0; d<b; d++){
                matriks[c][d] = input.nextInt(); 
            }
        }
        
        // untuk transpos
        for(c=0; c<a; c++){
            for(d=0; d<b; d++){
                transpos[d][c] = matriks[c][d];
            }
        }
        
        for(c=0; c<b; c++){
            for(d=0; d<a; d++){
                System.out.print(transpos[c][d] +" "); // cetak transpos matrik
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
