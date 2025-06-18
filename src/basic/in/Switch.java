package basic.in;
import java.util.Scanner;
public class Switch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Employee ID:");
        int empId = in.nextInt();
        System.out.println("Enter the Department");
        String dept = in.next().trim();

        switch (empId) {
            case 1 -> System.out.println("Kalaipriyan");
            case 2 -> System.out.println("Vidhushna");
            case 3 -> {
                System.out.println("Thiru");
                switch (dept) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "CSE":
                        System.out.println("CSE department");
                        break;
                    case "ECE":
                        System.out.println("ECE Department");
                        break;
                }
            }
        }
    }
}