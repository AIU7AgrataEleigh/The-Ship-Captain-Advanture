import java.util.Scanner;

public class ExArrayC {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //Write a program to print the following numbers in reverse 
        //-ordee 
        //34 56 54 32 67 89 90 32 21
        //Assume that all these numbers are stored in an array

        int number[] = {34,56,54,32,67,89,90,32,21};

        for (int i = 8; i >= 0; i--){
            System.out.print(number[i] + " ");
        }

        input.close();
    }
}