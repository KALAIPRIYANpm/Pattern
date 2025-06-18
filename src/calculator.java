import java.util.Scanner;


public class calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enetr the operator:");
//        char op  = input.next().trim().charAt(0);
        //progrsm
        int result = 0;
        while(true){

            System.out.println("Enter the operator:");
            char op  = input.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){

                System.out.println("Enter the Value of two Numbers:");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if(op == '+'){
                    result = num1+num2;
                }
                if(op == '-'){
                    result = num1-num2;

                }
                if(op == '*'){
                    result = num1*num2;
                }
                if(op == '/'  && num2>0){
                    result = num1/num2;

                }
                if(op == '%'){
                    result = num1%num2;

                }



            }
            else if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid operator");
            }
            System.out.println(result);

        }
    }

}
