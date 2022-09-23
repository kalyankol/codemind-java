import java.util.*;
class arr{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] b=new int[m];
        for(int j=0;j<m;j++){
            b[j]=sc.nextInt();
        }
        int c1=0,c2=0;
        for(int i=0;i<n;i++){
            c1+=a[i];
            c2+=b[i];
        }
        if(c1==c2){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}