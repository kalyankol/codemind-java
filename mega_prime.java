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
        boolean prime=prime(n);
        if(!prime){
            System.out.print("Not Mega Prime");
        }
        else{
            int r;
            boolean p;
            String s="Mega Prime";
            while(n>0){
                r=n%10;
                p=prime(r);
                //System.out.println(p);
                //System.out.println(r);
                if(!p){
                    s="Not Mega Prime";
                    break;
                }
                n=n/10;
            }
            System.out.print(s);
        }
    }
}