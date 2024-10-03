package basic.in;

public class pattern28 {

    public static void main(String[] args) {

        pattern(5);

    }

    public static void pattern(int num){

        for(int row=0;row<=2*num;row++){

            int columspace=row>num ? 2* num-row:row;
            int spaceoff=num-columspace;

            for(int space=0;space<=spaceoff;space++){
                System.out.print(" ");

            }

            for(int col=0;col<columspace;col++){

                System.out.print("* ");

            }
            System.out.println();

        }

    }
}
