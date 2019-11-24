public class Triangle {
    public static void main(String[] args) {
        int size = 5;
        int row = 1;
        int col = 1;
        while (row <= size) {
            while (col <= row) {
                System.out.print('*');
                col = col + 1;
            }
            System.out.println(' ');
            col = 1;
            row = row + 1;
        }
    }
}

