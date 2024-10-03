package basic.in;

public class triangle {

    public static void main(String[] args) {
        triangle(10);
    }

    public static void triangle(int num){

        for(int i=1;i<=num;i++){

            for(int spaceoff=1;spaceoff<=num-i;spaceoff++){
                System.out.print(" ");

            }

            for(int j=1;j<=i;j++){

                System.out.print("* ");

            }
            System.out.println();

        }

    }
}
