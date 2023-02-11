import java.util.Arrays;
/**
 * MergeSort
 */
public class MergeSort {
    static int comparisons = 0;
    
    public static void main(String[] args) {
        int[] input = new int[10];
        for (int i = 0; i < input.length; i++) {
            int r = 3;
            r = r + ((r + 1) * i);
            input[i] = r;
        }
        System.out.println("For Merge Sort");
        System.out.println("Best Case");
        merge(input.clone());
        comparisons= 0;
        System.out.println("Worst Case");
        int[] temp = new int[10];
        for (int i = 0, j = 9; i < 10 && j >= 0; i++, j--) {
            temp[i] = input[j];
        }
        merge(temp.clone());
        comparisons= 0;
        System.out.println("Average Case");
        int average[] = { 3, 39, 7, 35, 11, 31, 15, 27, 19, 23 };
        merge(average.clone());
    }

    static void merge(int input[]) {
       
        System.out.print("Input :- ");
        System.out.println(Arrays.toString(input));
        int[] temp = new int[input.length];
        mergeSort(input, temp, 0, input.length - 1);
        System.out.print("Output :- ");
        System.out.println(Arrays.toString(input));
        System.out.println("Comparisons :- " + comparisons);
    }

    static void mergeSort(int input[], int temp[], int left, int right) {
        comparisons++;
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(input, temp, left, center);
            mergeSort(input, temp, center + 1, right);
            merge(input, temp, left, center + 1, right);
        }
    }

    static void merge(int input[], int temp[], int left, int right, int rightEnd) {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;
        while (left <= leftEnd && right <= rightEnd) {
            if (input[left] <= input[right]) {
                temp[k++] = input[left++];
            } else {
                temp[k++] = input[right++];
            }
        }
        while (left <= leftEnd) {
            temp[k++] = input[left++];
        }
        while (right <= rightEnd) {
            temp[k++] = input[right++];
        }
        for (int i = 0; i < num; i++, rightEnd--) {
            input[rightEnd] = temp[rightEnd];
        }
    }
}