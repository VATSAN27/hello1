import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=80;
        int min=0;
        if (a<b && a<c)
        {
            System.out.println("a is smallest");
        }
        else if (b<a && b<c)
        {
            System.out.println("b is smallest");
        }
        else
        {
            System.out.println("c is smallest");
        }
    }
}