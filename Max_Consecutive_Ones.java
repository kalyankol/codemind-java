import java.util.Scanner;
class max{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
        int[] b=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                b[j]=c;
                c=0;
                j+=1;
            }
            else{
                c+=1;
                if(i==n-1){
                    b[j]=c;
                }
            }
        }
        int max=b[0];
        for(int i=0;i<n;i++){
            if(max<b[i]){
                max=b[i];
            }
        }
        System.out.printf("%d ",max);   
    }
}