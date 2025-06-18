import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int count = 2;
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        while(number >= count){
            int temp = b;
            b = b+a;
            a = temp;
            count++;


        }

        System.out.println(b);


    }

}
