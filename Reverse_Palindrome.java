import java.util.Scanner;
class HelloWorld {
    static int rev(int n){
        int rem=0;
        int a=n;
        int r;
        while(n>0){
            r=n%10;
            rem=(rem*10)+r;
            n=n/10;
        }
        return rem;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=0;
        while(true){
           y=x+rev(x);
           if(y==rev(y)){
               System.out.print(y);
               break;
           }
           else{
               x=y;
           }
        }
    }
}