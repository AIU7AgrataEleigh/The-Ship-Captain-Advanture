import java.util.Scanner;
public class ExLoop3 {
    //Display the sum of the strict divisors of 
    //an int given by the user

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();
        //int pembagi = 0;
        int total = 0;
        
        System.out.print("Pembagi : ");
        for ( int i = 1; i<n; i++){
            if (n % i == 0){
                //pembagi = i;
                System.out.print(i + " ");
            }
            else{
                continue;
            }

            total += i;
        }
        
        System.out.println("\nSum : " + total);
        
        input.close();

    }
}
