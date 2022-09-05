import java.util.Scanner;
import java.lang.Math;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="NO";
        for(int i=0;i<n;i++){
            if(i*(i+1)==n){
                s="YES";
            }
        }
        System.out.print(s);
    }
}