import java.util.Scanner;
public class ExLoop5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //The program needs to reads a sequence of positive intergers. 
        //The program stops when the user fills a negative value
        //-and shows the maximum and the minimum of these numbers

        int angka;
        int max = -1 , min = -1;

        //Penggunaan nilai -1 untuk menginisialisasi max dan min pada kasus ini.
        // adalah sebuah trik logika untuk menandai bahwa belum ada angka positif yang valid 
        // yang dimasukkan oleh pengguna.Ini adalah cara sederhana untuk menggantikan 
        // penggunaan konstanta sistem seperti Integer.MIN_VALUE dan Integer.MAX_VALUE.

        do {
            angka = input.nextInt();

            // if (angka < 0){
            //     continue;
            // }

        if (angka>=0){

            if ( max == -1){
                max = angka;
                min = angka;
            }
            else{

                 if (angka > max){
                    max = angka;
                 }
      
                if(angka < min){
                    min = angka;
                }

            }
        }
        
        }
        while (angka >= 0);
        
        if(max != -1){
        System.out.println( "Max : " + max +" and min : " + min);
        }

        input.close();
        
    }
    
}
