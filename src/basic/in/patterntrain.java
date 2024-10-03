package basic.in;

public class patterntrain
{

    public static void main(String[] args) {

        pattern(5);

    }
    public static void pattern(int number){

        for(int row=0;row<=2*number;row++){

            int totalColumn=row>number?2*number-row:row;

            int spaceoff=number-totalColumn;
            for(int space=0;space<spaceoff;space++){
                System.out.print(" ");
            }

                for(int col=0;col<=totalColumn;col++){

                    System.out.print("* ");

                }
            System.out.println( );

        }

    }
}
