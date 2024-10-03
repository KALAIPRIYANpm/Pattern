package basic.in;

public class chat {
    public static void main(String[] args) {
        pat(5);
    }

    static void pat(int num) {
        for (int row = 0; row <= 2 * num; row++) {
            // Determine the number of columns (stars) in the current row
            int totalCol = row > num ? 2 * num - row : row;

            // Calculate the number of leading spaces
            int space = num - totalCol;

            // Print the leading spaces
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }

            // Print the stars with a space in between
            for (int col = 0; col < totalCol; col++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
