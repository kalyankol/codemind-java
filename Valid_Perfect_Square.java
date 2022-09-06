import java.util.Scanner;
class Main
{
    static String sqrt(int n){
        String s="False";
        for(int i=0;i<n;i++){
            if(i*i==n){
                s="True";
                break;
            }
        }
        return s;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    String str=sqrt(n);
		    System.out.println(str);
		}
	}
}
