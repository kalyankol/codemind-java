import java.util.Scanner;
class hello{
    static boolean pn(int n){
        boolean ispn=false;
        if(n%10==2 || n%10==3 || n%10==9){
            ispn=true;
        }
        return ispn;
    }
    public static void main(String[] agrs){
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for(int i=0;i<t;i++){
            int l=scanner.nextInt();
            int r=scanner.nextInt();
            boolean ispn;
            int c=0;
            for(int j=l;j<=r;j++){
                ispn=pn(j);
                if(ispn){
                    c+=1;
                    //System.out.println(j);
                }
            }
            System.out.println(c);
            //System.out.println(l);
            //System.out.println(r);
        }
    }
}