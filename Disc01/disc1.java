import org.graalvm.compiler.hotspot.replacements.PluginFactory_CipherBlockChainingSubstitutions;

public class disc1 {
    public static int mystery(int[] inputArray, int k) {
        int x = inputArray[k];
        int answer = k;
        int index = k + 1;
        while (index < inputArray.length) {
            if (inputArray[index] < x) {
                x = inputArray[index];
                answer = index;
            }
            index = index + 1;
        }
        return answer;
    }

    public static void mystery2(int[] inputArray) {
        // Selection sort. Each time select the smallest value from the following array.
        int index = 0;
        while (index < inputArray.length) {
            int targetIndex = mystery(inputArray, index);
            int temp = inputArray[targetIndex];
            inputArray[targetIndex] = inputArray[index];
            inputArray[index] = temp;
            index = index + 1;
        }
    }
    
    public static void main(String[] args) {
        int[] inputArray = {3, 0, 4, 6, 3};
        System.out.println(java.util.Arrays.toString(inputArray));
        mystery2(inputArray);
        System.out.println(java.util.Arrays.toString(inputArray));
    }
}


