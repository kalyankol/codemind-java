import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        int avg=sum/n;
        String exist="False";
        for(int i=0;i<n;i++){
            if(avg==a[i]){
                exist="True";
            }
        }
        System.out.print(exist);
        //System.out.print(avg);
    }
}