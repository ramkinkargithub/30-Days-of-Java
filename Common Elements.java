
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        // Example test cases
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] result1 = commonElements(array1, array2);
        printArray(result1); // Expected: []

        int[] array3 = {1, 2, 3, 4};
        int[] array4 = {3, 4, 5, 6};
        int[] result2 = commonElements(array3, array4);
        printArray(result2); // Expected: [3, 4]
    }

    // Utility method to print arrays for testing
    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Create the "commonElements" method here
    public static int[] commonElements(int[] array1,int[] array2){
      HashMap<Integer, Integer> map = new HashMap<>();        
      for(int i=0;i<array1.length;i++){
            if(map.get(array1[i])!=null)
                map.put(array1[i],map.get(array1[i])+1);
            else
                map.put(array1[i],1);
        }
        for(int i=0;i<array2.length;i++){
            if(map.get(array2[i])!=null)
                map.put(array2[i],map.get(array2[i])+1);
            else
                map.put(array2[i],1);
        }
        ArrayList<Integer> commonList = new ArrayList<>();
        map.forEach((key, value) -> {
            if(value>1)
                commonList.add(key);
            }
        );
        return commonList.stream().mapToInt(Integer::intValue).toArray();
    }
}
