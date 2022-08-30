import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String rd="";
        if (n%3==0){
            rd+="Pling";
        }
        if(n%5==0){
            rd+="Plang";
        }
        if(n%7==0){
            rd+="Plong";
        }
        if(n%3!=0 && n%5!=0 && n%7!=0){
            System.out.print(n);
        }
        else{
            System.out.print(rd);
        }
    }
}