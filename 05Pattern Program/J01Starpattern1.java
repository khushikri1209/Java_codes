import java.util.*;
public class J02Starpattern1 {
    public static void main(String[]args){
        int rows=5;
        for(int i=0;i<=rows;++i){
            for(int j=1;j<=i;++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
