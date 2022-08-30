import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      int track=scanner.nextInt();
      int sector=scanner.nextInt();
      int block=scanner.nextInt();
      int capacity;
      capacity=track*block*sector*512*2;
      System.out.print(capacity);
    }
}