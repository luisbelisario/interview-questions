package DataStructures.arrays;

public class mergeSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {0, 3, 4, 31};
        int[] arr2 = {4, 6, 30};

        int[] mergeSorted = mergeSorted(arr1, arr2);

        for (int j : mergeSorted) {
            System.out.println(j);
        }
    }

    public static int[] mergeSorted(int[] arr1, int[] arr2) {

        int arr1Size = arr1.length;
        int arr2Size = arr2.length;
        int[] mergedArray = new int[arr1Size+arr2Size];
        int i = 0, j = 0, k = 0;

        while (i < arr1Size && j < arr2Size) {
            if(arr1[i] < arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
                k++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < arr1Size) {
            mergedArray[k] = arr1[i];
            i++;
        }

        while (j < arr2Size) {
            mergedArray[k] = arr2[j];
            j++;
        }

        // Complexidade O(n+m+p) -> O(n)

        return mergedArray;

    }
}
