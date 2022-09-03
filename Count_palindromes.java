import java.util.Scanner;
class HelloWorld {
    static boolean pal(int n){
        int a=n;
        int rem=0;
        int r;
        while(n>0){
            r=n%10;
            rem=(rem*10)+r;
            n=n/10;
        }
        if(rem==a){
            return true;
        }
        else{
            return false;
        }
    } 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=scan.nextInt(); 
        }
        int c=0;
        for(int i=0;i<n;i++){
            boolean ispal=pal(arr[i]);
            if(ispal){
                c+=1;
            }
        }
        System.out.print(c);
    }
}