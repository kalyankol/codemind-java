import java.util.Scanner;
class HelloWorld {
    static int sod(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
             sum+=i;   
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s1=sod(a);
        int s2=sod(b);
        if(a==s2 && b==s1){
            System.out.print("Amicable");
        }
        else{
            System.out.print("Not Amicable");
        }
    }
}