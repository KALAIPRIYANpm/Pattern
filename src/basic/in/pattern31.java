package basic.in;

public class pattern31 {

    public static void main(String[] args) {
pattern31(4);
    }
    public static void pattern31(int num){
        for(int row=0;row<=2*num;row++){

            for(int col=0;col<=2*num;col++){
                int atEveryIndex=num-Math.min(Math.min(row,col),Math.min(2*num-row,2*num-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();


        }
    }
}
