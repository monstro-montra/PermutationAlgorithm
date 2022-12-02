public class Main {
    public static void main(String[] args) {
        Main run = new Main();
        int[] values = {7, 4, 54, 3, 6}; //5 elements in this array.
        int[] values2 = {3, 7, 2}; //3 elements in array
        run.printAllPermutations(values.length, values, values.length);
    }

    //heap's algorithm
    public void printAllPermutations(int n, int[] array, int size) {
        if (size == 1){ // if the size is 1
            printArray(array, n); //print permutation
        }

        for (int i = 0; i < size; i++){
            printAllPermutations(n, array, size - 1); //call function itself

            if(size % 2 == 1){ //if the size is odd
                //swap first and last element.
                int temp = array[0];
                array[0] = array[size -1];
                array[size - 1] = temp;
            }
            else { //if the size is even
                //swap element at i and the last element.
                int temp = array[i];
                array[i] = array[size - 1];
                array[size - 1] = temp;
            }
        }
    }

    public void printArray(int[] input, int n){
        for (int i = 0; i < n; i ++){
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }
}