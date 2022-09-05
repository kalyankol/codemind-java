import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int s=0;
       for(int i=1;i<n;i++){
           if(n%i==0){
               s+=i;
           }
       }
       if(s>n){
           System.out.print("True");
       }
       else{
           System.out.print("False");
       }
    }
}