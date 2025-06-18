package basic.in;
import java.util.Scanner;
public class count {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Value:");
        int num = input.nextInt();
        int count = 0;
        System.out.println("Enter the value to count:");
        int inputvalue = input.nextInt();

        while(num>0){

            int rem = num%10;
            if(rem == inputvalue){
                count++;
            }
//            System.out.println(count);
            num = num / 10;
        }
        System.out.println(count);


    }
}
