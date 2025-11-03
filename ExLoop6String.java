import java.util.Scanner;
public class ExLoop6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //The program displays the sum of digits 
        //of an interger read from the user.
       
        String digit = input.nextLine();
        int sum = 0;

        for (int i = 0; i < digit.length(); i++ ){
            char digitChar = digit.charAt(i);

            int nilaiDigit = Character.getNumericValue (digitChar);

            sum += nilaiDigit;
        }

        System.out.print( "sum = " + sum );

        input.close();
    }
}
