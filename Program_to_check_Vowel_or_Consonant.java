import java.util.Scanner;
import java.lang.*;
class vowel{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        char ch=sc.nextLine().charAt(0);
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I'){
            System.out.print("Vowel");
        }
        else if(ch=='o' || ch=='O' || ch=='u' || ch=='U'){
            System.out.print("Vowel");
        }
        else{
            System.out.print("Consonant");
        }
    }
}