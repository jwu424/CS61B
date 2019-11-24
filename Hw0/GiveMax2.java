public class GiveMax2 {
    /** Returns the maximum value from m using a for loop. */
    public static int forMax(int[] m) {
        int x = m[0];
        for (int i = 0; i < m.length; i = i + 1) {
            if (m[i] > x) {
                x = m[i];
            } 
        }
        return x;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
       System.out.println(forMax(numbers));      
    }
}