import java.util.*;
class game{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x=0,y=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                x+=a[i];
            }
            else{
                y+=a[i];
            }
        }
        if(Math.abs(x-y)%4==0){
            System.out.print("X");
        }
        else{
            System.out.print("Y");
        }
    }
}