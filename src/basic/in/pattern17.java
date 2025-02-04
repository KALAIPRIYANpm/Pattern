package basic.in;

public class pattern17{

    public static void main(String[] args) {
        pattern17(5);

    }

    public static void pattern17(int num){
        for(int row=0;row<=2*num;row++){

            int c=row>num ? 2*num-row:row;
            for(int spaceoff=0;spaceoff<num-c;spaceoff++){
                System.out.print("  ");
            }

            for(int col=c;col>=1;col--){
                System.out.print(col + " ");

            }
            for(int col=2;col<=c;col++){
                System.out.print(col +" ");

            }
            System.out.println();
        }

    }
}

//public static void pattern(int n){
//    for(int i =1;i<=n;i++){
//        for(int j = i;j<=n;j++){
//            System.out.print(" * ");
//        }
//        System.out.println("");
//    }
//}

