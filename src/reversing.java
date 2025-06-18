public class reversing {

    public static void main(String[] args) {
        int num = 11231;
        int result = 0;
        int original_num = num;
        while(num>0){
            int rem = num % 10;
            result = result * 10 + rem;
            num = num / 10;
        }
        System.out.println(result);

        if(result==original_num){
            System.out.println("It is a Palindrome Number");
        }
        else{
            System.out.println("it is not a palindrome Number");
        }
    }
}
