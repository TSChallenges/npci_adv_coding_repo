public class GenericExample {

    public static void main(String[] args) {
        Integer[] someArray = {2,3,5,6,8,5,3,1};
        printArray(someArray, 4);
        System.out.println("--------------------");

        Integer[] arr2 = {10,20,110,4,55,55,20};
        printArray(arr2,3);
        System.out.println("--------------------");

        String[] strarray = {"apple","orange","banana","chikoo"};
        printArray(strarray,4);
    }




    // write a method to print first n values the value of an any type of array
    public static <T> void printArray(T[] arr, int n){
        for (int i = 0; i<n; i++){
            System.out.println("Value at index " + i + " = " +arr[i]);
        }
    }


}
