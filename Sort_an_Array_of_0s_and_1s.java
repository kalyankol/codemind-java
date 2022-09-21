import java.util.Scanner;
class sort {

	public static int fuck(int n,int [] a){
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                c+=1;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=fuck(n,a);
        int c1=0;
        for(int i=0;i<n;i++){
            c1+=1;
            if(c1>c){
                a[i]=1;
            }
            else{
                a[i]=0;
            }
        }
        for(int i=0;i<n;i++){
            System.out.printf("%d ",a[i]);
        }
    }

}