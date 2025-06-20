import java.io.*;

public class J03DecimalToOctal {
    static void decToOctal(int n) {
        // Creating an Integer array of
        // array to store octal number
        int[] octalNum = new int[100];

        // counter for octal number array
        int i = 0;
        while (n != 0) {

            // Storing remainder in octal array
            octalNum[i] = n % 8;
            n = n / 8;
            i++;
        }

        // Printing octal number array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(octalNum[j]);
    }

    // Method 2
    // Main driver method
    public static void main(String[] args) {
        // Custom input Integer number
        int n = 33;

        // Calling the above method to convert
        // Decimal to Octal number
        decToOctal(n);
    }
}
