import java.util.Arrays;
public class QuickSort {
    static int comparisons = 0;
    static int swaps = 0;
    public static void main(String[] args) {
        int[] input = new int[10];
        for (int i = 0; i < input.length; i++) {
            int r = 3;
            r = r + ((r + 1) * i);
            input[i] = r;
        }
        System.out.println("For Quick Sort");
        System.out.println("Best Case");
        quick(input.clone());
        swaps = 0;
        comparisons = 0;
        System.out.println("Worst Case");
        int[] temp = new int[10];
        for (int i = 0, j = 9; i < 10 && j >= 0; i++, j--) {
            temp[i] = input[j];
        }
        quick(temp.clone());
        swaps = 0;
        comparisons = 0;
        System.out.println("Average Case");
        int average[] = { 3, 39, 7, 35, 11, 31, 15, 27, 19, 23 };
        quick(average.clone());
    }

    static void quick(int input[]) {
        System.out.print("Input :- ");
        System.out.println(Arrays.toString(input));
        quickSort(input, 0, input.length - 1);
        System.out.print("Output :- ");
        System.out.println(Arrays.toString(input));
        System.out.println("Comparisons :- " + comparisons);
        System.out.println("Swaps :- " + swaps);
    }

    static void quickSort(int input[], int low, int high) {
        comparisons++;
        if (low < high) {
            int pivot = partition(input, low, high);
            quickSort(input, low, pivot - 1);
            quickSort(input, pivot + 1, high);
        }
    }

    static int partition(int input[], int low, int high) {
        int pivot = input[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            comparisons++;
            if (input[j] < pivot) {
                i++;
                swaps++;
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }
        swaps++;
        int temp = input[i + 1];
        input[i + 1] = input[high];
        input[high] = temp;
        return i + 1;
    }


}
