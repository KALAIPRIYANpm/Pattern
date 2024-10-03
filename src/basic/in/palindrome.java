package basic.in;
import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        System.out.println("Enter the Number:");
        Scanner input=new Scanner(System.in);
        int pNum= input.nextInt();

        if(isPalindrome(pNum)){
            System.out.println("it is a palindrome");

        }
        else{
            System.out.println("it is not a palindrome");
        }

    }
    public static boolean isPalindrome(int num){

        int originalNumbre=num;

        int reversedNumber=0;

        while(num!=0){

            int digit=num%10;
            reversedNumber=reversedNumber*10+digit;
            num/=10;
            System.out.println(num);
//            System.out.println(digit);
            System.out.println(reversedNumber);

        }
        return originalNumbre==reversedNumber;
    }
}

// algorithm
/*
*  palidrome number= 10
* store that original number in an variable;
* create an reversed number as static 0;
* store the remainder of number % 10 in a variable
* reversed number= reversed number * number + (remainder by numbre);
* numbre/=10;
* */