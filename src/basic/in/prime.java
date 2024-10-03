package basic.in;
import java.util.Scanner;

public class prime {

    public static void main(String[] args) {

        System.out.println("Enter the Number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();

        if(primeNum(num)){

            System.out.println(num+" it is a Prime Number");
        }        else{

            System.out.println(num+ " It is not a Prime Number");

        }


    }

    public static boolean primeNum(int number) {

        if(number<=1){
            return false;
        }
        if(number%2==0||number%3==0){
            return false;
        }
        if(number==2||number==3){
            return true;
        }

        for(int i=5;i*i<=number;i+=6){
            if(number%i==0||number%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}
