import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       int n=scanner.nextInt();
       for(int i=0;i<n;i++){
           int n1=scanner.nextInt();
           int[] arr=new int[n1];
           for(int j=0;j<n1;j++){
            arr[j]=scanner.nextInt();
           }
           int a=arr[0];
           int b=arr[0];
           for(int num:arr){
               if(num>a){
                   a=num;
               }
           }
           for(int num:arr){
               if(num<b){
                   b=num;
               }
           }
           int c=a-b;
           if (arr[n1-1]-arr[0]==c){
               System.out.println("0");
           }
           else{
               System.out.println(c);
           }
       }
    }
}