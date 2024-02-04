import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number =876,reverse=0;
        for(;number!=0;number=number/10)
        {
            int remainder=number%10;
            reverse=reverse*10+remainder;
        }

        System.out.println("the reverse of given number is:"+reverse);
    }
}