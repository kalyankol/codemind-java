import java.util.*;
class array{
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
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                c+=a[i][j];
            }
        }
        System.out.print(c);
    }
}