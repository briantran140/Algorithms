public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println(linearSearch(intArray, 20));
        System.out.println(linearSearch(intArray, 888));
        System.out.println(linearSearch(intArray, 1));
        System.out.println(linearSearch(intArray, -22));

//        for(int i = 0; i < intArray.length; i++) {
//            System.out.println(intArray[i]);
//        }
    }

    public static int linearSearch(int[] input, int searchValue) {
        for(int i = 0; i < input.length; i++) {
            if(input[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }
}
