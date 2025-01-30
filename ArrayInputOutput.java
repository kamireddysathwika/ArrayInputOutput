public class ArrayInputOutput {

    public static void main(String[] args) {
        // Hardcoding the size of the array
        int size = 5; // Example: Array size of 5 elements

        // Initialize the array with the given size
        int[] array = new int[size];

        // Hardcoding values for the array elements
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        // Print the elements of the array
        System.out.println("Elements of the 1D Array:");
        for (int i = 0; i< array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
