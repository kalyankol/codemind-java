import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int r,rem=0,n=a;
            while(n>0){
                r=n%10;
                rem=(rem*10)+r;
                n=n/10;
            }
            if(rem==a){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
}