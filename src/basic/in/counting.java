package basic.in;

public class counting {

    public static void main(String[] args) {
        int num = 155333;
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 5) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}

