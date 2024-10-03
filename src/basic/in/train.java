package basic.in;

public class train {
    public static void main(String[] args) {
        pattern(5);

    }
    public static void pattern(int num){

        for(int row=0;row<=2*num;row++){

            int spaceoff=row>num ? 2*num-row:row;
            int cols=num-spaceoff;



            for(int space=0;space<=cols;space++){
                System.out.print("  ");
            }

            for(int col=spaceoff;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=spaceoff;col++){

                System.out.print(col+" ");

            }
            System.out.println();

        }

    }
}
