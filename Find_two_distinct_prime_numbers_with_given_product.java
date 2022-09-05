import java.util.Scanner;
class HelloWorld {
    static boolean prime(int n){
        boolean isprime=true;
        if(n<=1){
            isprime=false;
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    isprime=false;
                    break;
                }
            }
        }
        return isprime;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int c=0;
       boolean p1,p2;
       int I=0,J=0;
       for(int i=1;i<n;i++){
           for(int j=1;j<n;j++){
               if(i*j==n){
                   p1=prime(i);
                   p2=prime(j);
                   if(p1 && p2){
                      I=i;
                      J=j;
                      break;
                   }
               }
           }
       }
       if(I==0 && J==0){
           System.out.print("-1");
       }
       else{
           if(I<J){
               System.out.printf("%d %d",I,J);
           }
           else{
               System.out.printf("%d %d",J,I);
           }
       }
    }
}