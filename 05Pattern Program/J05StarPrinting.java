public class J05StarPrinting {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int j = i;
            while (j <= 5) {
                System.out.print(j);
                j++;
            }
            System.out.println(" ");
        }
    }

}
