import java.util.*;
class str{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            String s1="0123456789";
            String a="No";
            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                if(s1.contains(ch+"")){
                    a="Yes";
                    break;
                }
            }
            System.out.println(a);
            //System.out.println(s);
        }
    }
}