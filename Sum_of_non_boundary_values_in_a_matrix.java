import java.util.*;
class Multiarray{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int s=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i!=0 && j!=0 && i!=n-1 && j!=m-1){
                    s+=a[i][j];
                }
            }
        }
        System.out.print(s);
    }    
}