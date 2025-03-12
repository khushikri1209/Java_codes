class Number {
    int value;  // Acts like a pointer to an integer

    Number(int value) {
        this.value = value;
    }
}

public class J21AddTwoNumber {
    public static void main(String[] args) {
        Number num1 = new Number(10);  // Creating object with value 10
        Number num2 = new Number(20);  // Creating object with value 20

        int sum = num1.value + num2.value;  // Access values through references
        System.out.println("Sum: " + sum);
    }
}
