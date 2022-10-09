import java.util.*;
class trip{
    public static boolean count(int a[],int k){
        boolean p=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==k){
                p=true;
            }
        }
        return p;
    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int c=0,add=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i!=j){
                        add=a[i]+a[j];
                        if(count(a,add)){
                            c+=1;
                        }
                    }
                }
            }
            if(c==0){
                System.out.println("-1");
            }
            else{
                System.out.println(c/2);
            }
            /*System.out.println("arr ");
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }*/
        }
    }
}