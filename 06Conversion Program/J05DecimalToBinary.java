public class J05DecimalToBinary {

    // Method to convert decimal to binary
    static void decToBinary(int n) {
        // Array to store binary number
        int[] binaryNum = new int[1000];
        
        // Counter for binary array
        int i = 0;
        while (n > 0) {
            // Storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        // Printing binary number in reverse order
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryNum[j]);
        }
    }

    // Main method
    public static void main(String[] args) {
        int n = 17;
        System.out.println("Decimal - " + n);
        System.out.print("Binary - ");
        decToBinary(n);
    }
}

    
