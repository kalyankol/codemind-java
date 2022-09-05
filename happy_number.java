import java.util.Scanner;
class HelloWorld {
    static int sos(int n){
        int sum=0;
        int r;
        while(n>0){
            r=n%10;
            sum+=(r*r);
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int sos=0;
       int c=0;;
       while(true){
           sos=sos(n);
           if(sos<9){
               if(sos==1 || sos==7){
                   c=1;
                   break;
               }
               else{
                   c=0;
                   break;
               }
           }
           n=sos;
       }
       if(c==0){
           System.out.print("False");
       }
       else{
           System.out.print("True");
       }
    }
}