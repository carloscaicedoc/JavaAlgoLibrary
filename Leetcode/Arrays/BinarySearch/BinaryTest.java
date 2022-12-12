public class BinaryTest {
    public static void main(String[] args) {
        Solution binary = new Solution();

        int arr[] = {-1,0,3,5,9,12};
        int x = 9;
        System.out.println(binary.binarySearch(arr, x));
        System.out.println(binary.search(arr, x));
    }
}