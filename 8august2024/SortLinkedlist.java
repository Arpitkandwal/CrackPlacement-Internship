
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SortLinkedlist {
    public static void main(String[] args) {
        int[] array1 = {3, 3, 5, 4};
        int[] array2 = {3, 3, 7, 4};
        int[] array3 = {3, 3, 8, 4};
        
        int[] uniqueArray = unique(array1, array2, array3);
        System.out.println("Unique elements: " + Arrays.toString(uniqueArray));
    }

    public static int[] unique(int[] array1, int[] array2, int[] array3) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : array1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : array2) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : array3) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                uniqueList.add(key);
            }
        }

        int[] uniqueArray = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArray[i] = uniqueList.get(i);
        }

        return uniqueArray;
    }
}

