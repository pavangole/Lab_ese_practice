import java.util.Arrays;

/**
 * Analysis
 */
public class Analysis {

    public static void main(String[] args) {

        int[] input = new int[10];
        for (int i = 0; i < input.length; i++) {
            int r = 3;
            r = r + ((r + 1) * i);
            input[i] = r;
        }
        System.out.println("For Selection Sort");
        System.out.println("Best Case");
        selection(input.clone());
        System.out.println("Worst Case");
        int[] temp = new int[10];
        for (int i = 0, j = 9; i < 10 && j >= 0; i++, j--) {
            temp[i] = input[j];
        }
        selection(temp.clone());
        System.out.println("Average Case");
        int average[] = { 3, 39, 7, 35, 11, 31, 15, 27, 19, 23 };
        selection(average.clone());

        System.out.println("For Insertion Sort");
        System.out.println("Best Case");
        insertion(input.clone());
        System.out.println("Worst Case");
        insertion(temp);
        System.out.println("Average Case");
        insertion(average);

    }

    static void selection(int input[]) {
        int comparisons = 0;
        int swaps = 0;
        System.out.print("Input :- ");
        System.out.println(Arrays.toString(input));
        for (int i = 0; i < input.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < input.length; j++) {
                comparisons++;
                if (input[j] < input[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = input[i];
                input[i] = input[min];
                input[min] = temp;
                swaps++;
            }

        }
        System.out.print("Output :- ");
        System.out.println(Arrays.toString(input));
        System.out.println("Number of Comparisons :- " + comparisons);
        System.out.println("Number of Swaps :- " + swaps);
        System.out.println();
    }

    static void insertion(int input[]) {
        int comparisons = 0;
        int swaps = 0;
        System.out.print("Input :- ");
        System.out.println(Arrays.toString(input));
        // insertion sort
        for (int i = 0; i <= input.length - 2; i++) {
            int j = i + 1;
            comparisons++;
            while (j > 0 && input[j] < input[j - 1]) {
                comparisons++;
                int temp = input[j];
                input[j] = input[j - 1];
                input[j - 1] = temp;
                swaps++;
                j--;
            }
        }
        System.out.print("Output :- ");
        System.out.println(Arrays.toString(input));
        System.out.println("Number of Comparisons :- " + comparisons);
        System.out.println("Number of Swaps :- " + swaps);
        System.out.println();
    }

}
