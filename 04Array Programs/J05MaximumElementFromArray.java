public class J05MaximumElementFromArray {
    public static void main(String[]args){
        int i,max=0;
        int a[]={10,60,30,40,50};
        for(i=0;i<5;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maximum :"+max);
    }
    
}
