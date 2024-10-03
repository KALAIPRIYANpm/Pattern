import java.util.Arrays;

public class mul {

    public static void main(String[] args){

        int age[]={1,2,3,4,5,6,7,8,9};

        int arrayLength=age.length;

        int lowestAge=age[0];

        for(int valu:age){

            if(lowestAge > valu){
//                System.out.println(Arrays.toString(valu));
                lowestAge=valu;
                System.out.println(lowestAge);
            }

        }





        }
    }

