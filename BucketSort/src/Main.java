import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] intArray = { 54, 46, 83, 66, 95, 92, 43 };

        bucketSort(intArray);

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void bucketSort(int[] array) {
        List<Integer>[] buckets = new List[10];
        for(int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for(int i = 0; i < array.length; i++) {
            buckets[hash(array[i])].add(array[i]);
        }

        for(int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }

        int j = 0;
        for(int i = 0; i < buckets.length; i++) {
            for(int value: buckets[i]) {
                array[j++] = value;
            }
        }

    }

    private static int hash(int value) {
        return value / 10;
    }

}
