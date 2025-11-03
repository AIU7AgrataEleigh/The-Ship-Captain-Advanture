import java.util.Scanner;
public class ExLoop5While {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();
        int max = n;
        int min = n;
        if (n>=0){
            while(true){
                n = input.nextInt();

                if(n < 0){
                    break;
                }

                //CARA 1
                // if(n > max){
                //     max = n;
                // }

                // if (n < min){
                //     min = n;
                // }

                max = n > max? n : max;
                min = n < min? n : min;
            }

            System.out.println("min = " + min + "max : " + max);
        }
        else{
            System.out.println("not valid");
        }
        
        input.close();
    }
    
}
