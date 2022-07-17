public class Main {

    public static void main(String[] args) {
//        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};

//        System.out.println(iterativeBinarySearch(intArray, 20));
//        System.out.println(iterativeBinarySearch(intArray, 888));
//        System.out.println(iterativeBinarySearch(intArray, 1));
//        System.out.println(iterativeBinarySearch(intArray, -22));

        System.out.println(recursiveBinarySearch(intArray, 35));
        System.out.println(recursiveBinarySearch(intArray, 888));
        System.out.println(recursiveBinarySearch(intArray, 1));
        System.out.println(recursiveBinarySearch(intArray, -22));
    }

    public static int iterativeBinarySearch(int[] input, int value){
        if(input.length == 0) {
            return -1;
        }

        int start = 0;
        int end = input.length;

        while(start < end) {
            int mid = (end + start) / 2;
            if(input[mid] == value) {
                return mid;
            } else if(input[mid] < value) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] input, int value) {
        return recursiveBinarySearch(input, 0 , input.length, value);
    }

    // {-22, -15, 1, 7, 20, 35, 55};
    public static int recursiveBinarySearch(int[] input, int start, int end, int searchValue) {
        // when there is no value left (start >= end), when there is one value in the array (end - start < 2)
        if(start >= end) {
            return -1;
        }

        int mid = (end + start) / 2;
        if(input[mid] == searchValue) {
            return mid;
        } else if (input[mid] < searchValue) {
            return recursiveBinarySearch(input, mid + 1, end, searchValue);
        } else {
            return recursiveBinarySearch(input, start, mid, searchValue);
        }
    }

}
