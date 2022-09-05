import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] a=new int[4];
       int r,i=0;
       while(n>0){
           r=n%10;
           a[i]=r;
           i+=1;
           n=n/10;
       }
       int max=a[0];
       for(int j=0;j<4;j++){
           if(a[j]>max){
               max=a[j];
           }
       }
       System.out.print(max);
    }
}