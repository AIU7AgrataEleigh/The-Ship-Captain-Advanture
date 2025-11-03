import java.util.Scanner;
public class ExLoop4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Reads a positive number N from the user
        // then indicates if N is prime or not

        int n = input.nextInt();
        // int sum = 1;
        // for (int i = 2; i <= n/2; i ++){
        //     if(n % i == 0){
        //         sum += i;
        //     }
            
            
        // }
        // System.out.println(sum == 1? "prime" : "not prime");
        // input.close();

        //Cara lain
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                isPrime = false;
                break;
            }
           //output diletakkan di dalam, maka akan masalaaaaaaaaaaaaaaj
        }
         System.out.println(isPrime? "prime" : "not prime");

        input.close();
    }
}
