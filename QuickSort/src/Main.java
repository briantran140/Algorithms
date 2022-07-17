public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        quickSort(intArray, 0, 7);

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void quickSort(int[] input, int start, int end) {
        if(end - start < 2) {
            return;
        }

        int pivot = partition(input, start, end);
        quickSort(input, start, pivot);
        quickSort(input, pivot + 1, end);
    }

    // {20, 35, -15, 7, 55, 1, -22}
    public static int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int i = start;
        int j = end;

        while(i < j) {

            //Empty loop body
            while(i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            //Empty loop body
            while(i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }

        }
        input[i] = pivot;
        return i;
    }
}
