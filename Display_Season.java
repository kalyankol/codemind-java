import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      int month=scanner.nextInt();
      if (month>=1 && month<=12){
          if (month==4 || month==5 || month==6){
              System.out.print("Summer");
          }
          else if(month==7 || month==8 || month==9 || month==10){
              System.out.print("Rainy");
          }
          else if(month==11 || month==12 || month==1){
              System.out.print("Winter");
          }
          else
          {
              System.out.print("Spring");
          }
      }
      else{
          System.out.print("-1");
      }
   }
}   