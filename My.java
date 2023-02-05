public class My {
    //create a program to find number of comparisons and swaps in 

    public static void main(String[] args) {
        int[] input = new int[10];
        for (int i = 0; i < input.length; i++) {
            int r = 3;
            r = r + ((r + 1) * i);
            input[i] = r;
        }
        selection(input);
        insertion(input);
    }
    static void selection(int input[]) {
        int comparisons = 0;
        int swaps = 0;
        System.out.print("Input :- ");
        for (int j = 0; j < input.length; j++) {
            System.out.print(input[j] + " ");
        }
        for(int i = 0; i < input.length - 1 ; i++) {
            int min  = i;
            for(int j = i + 1; j < input.length ; j++) {
                comparisons++;
                if(input[j] < input[min]) {
                    min = j;
                }
            }
            if(min != i) {
                int temp = input[i];
                input[i]  = input[min];
                input[min] = temp;
                swaps++;
            }
            
            
        }
        System.out.println();
        System.out.print("Output :- ");
        for (int j = 0; j < input.length; j++) {
            System.out.print(input[j] + " ");
        }
        System.out.println();
        System.out.println("Number of Comparisons :- " + comparisons);
        System.out.println("Number of Swaps :- " + swaps);
        System.out.println();
    }
    static void insertion(int input[]) {
        int comparisons = 0;
        int swaps = 0;
        System.out.print("Input :- ");
        for (int j = 0; j < input.length; j++) {
            System.out.print(input[j] + " ");
        }
        for (int i = 1; i < input.length; i++) {
            int key = input[i];
            int j = i - 1;
            comparisons++;
            while (j >= 0 && input[j] > key) {
                comparisons++;
                input[j + 1] = input[j];
                swaps++;
                j--;
            }
            input[j + 1] = key;
        }
        System.out.println();
        System.out.print("Output :- ");
        for (int j = 0; j < input.length; j++) {
            System.out.print(input[j] + " ");
        }
        System.out.println();
        System.out.println("Number of Comparisons :- " + comparisons);
        System.out.println("Number of Swaps :- " + swaps);
        System.out.println();
    }
}
