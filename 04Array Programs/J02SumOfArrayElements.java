public class J02SumOfArrayElements {
    public static void main(String[]args){
        int a[]=new int[5];
        int i,sum=0;
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        for(i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.print("sum is :"+sum);

    }
    
}
