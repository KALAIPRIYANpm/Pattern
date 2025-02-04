package basic.in;

public class pattern30 {

    public static void main(String[] args) {
        pattern30(5);
    }
//tratergy
    public static void pattern30(int num){
        for(int row=0;row<=num;row++){
            for(int spaceoff=0;spaceoff<=num-row;spaceoff++){
                System.out.print("  ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col + " ");

            }
            for(int col=2;col<=row;col++){
                System.out.print(col +" ");

            }
            System.out.println();
        }

    }
}
