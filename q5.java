import java.util.*;

public class Main {
    public static void main(String[] args) {
      // swaping without using 3rd variable
      int a=10;
      int b=15;
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("A is :"+a+" B is :"+b);
    }
}