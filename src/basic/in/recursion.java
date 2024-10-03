package basic.in;

public class recursion {

    public static void main(String[] args) {

        //recursion
        int result=val(10);
        System.out.println(result);


    }

    public static int val(int num){

        if (num > 0) {
            return num + val(num-1);
        }
        return num;

    }
}
