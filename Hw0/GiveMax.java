public class GiveMax {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int len = m.length;
        int x = m[0];
        int ind = 0;
        while (ind < len){
            if (m[ind] > x) {
                x = m[ind];
            }
            ind = ind + 1;
        }
        return x;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
       System.out.println(max(numbers));      
    }
}