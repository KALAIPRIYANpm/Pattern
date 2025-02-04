package basic.in;

public class pattern {

    public static void main(String[] args) {

   pattern4(5);
    }

    static void patterns(int num) {

        for (int row = 1; row <= num; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int val) {
        for (int row = 1; row <= val; row++) {
            for (int col = 1; col <= val - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int val) {
        for (int row = 1; row <= val; row++) {
            for (int col = 1; col <= val; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern4(int number) {

        for (int row = 1; row <= number; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
                if (row == number) {
                    for (int iter = number; iter <= number + col; iter++) {

                        System.out.print("* ");

                    }
                    System.out.println();

                }

            }
            System.out.println();

        }
    }

    public static void patternnum(int num) {

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");

            }
            System.out.println("");
        }

    }

    public static void patternusb(int num) {
        int x = 0;
        for (int row = 0; row < 2 * num; row++) {

            int iteration = row > num ? 2 * num - row : row;
            for (int col = 1; col <= iteration; col++) {
                System.out.print("* ");

            }
            System.out.println("");
        }

    }

     static void pat(int num) {

        for(int row=0;row<=2 * num;row++){
            int totalcol=row>num ? 2 * num-row:row;

            int space=num-totalcol;
            for(int s=0;s<space;s++){
                System.out.print("");
            }
            for(int col=0;col<totalcol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
