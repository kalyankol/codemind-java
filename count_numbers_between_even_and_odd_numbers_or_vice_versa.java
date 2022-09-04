import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(i+1<n && i-1>=0){
                if(a[i-1]%2==0 && a[i+1]%2!=0){
                    c+=1;
                }
                if(a[i-1]%2!=0 && a[i+1]%2==0){
                    c+=1;
                }
            }
        }
        System.out.print(c);
    }
}