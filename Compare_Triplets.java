import java.util.*;
class compare{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[3];
        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
        }
        int[] b=new int[3];
        for(int i=0;i<3;i++){
            b[i]=sc.nextInt();
        }
        int A=0,B=0;
        for(int i=0;i<3;i++){
            if(a[i]>b[i]){
                A+=1;
            }
            if(b[i]>a[i]){
                B+=1;
            }
        }
        System.out.print(A+" "+B);
    }
}