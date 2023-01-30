/**
 * Analysis
 */
public class Analysis {

    public static void main(String[] args) {


        int comparisons = 0;
        int exchanges  = 0;
        int[] input = new int[10];
        for (int i = 0; i < input.length; i++) {
            int r = 3;
            r = r + ((r + 1) * i);
            input[i] = r;
        }

        System.out.println("For Selection Sort");
        System.out.println("Best Case");
        System.out.print("Input :- ");
        for (int j = 0; j < input.length; j++) {
            System.out.print(input[j] + " ");
        }

        
        System.out.println();
        System.out.print("Output :- ");
        for (int j = 0; j < input.length; j++) {
            System.out.print(input[j] + " ");
        }

        System.out.println();
        System.out.println("Number of Comparisons :- " + comparisons);
        System.out.println("Number of Exchanges :- " + exchanges);
        System.out.println();

        System.out.println("Worst Case");
        

        
    }


    static void selection(int input[]) {
        int comparisons = 0;
        int exchanges = 0;
        System.out.print("Input :- ");
        for (int j = 0; j < input.length; j++) {
            System.out.print(input[j] + " ");
        }
        for(int i = 1 ; i < input.length - 1 ; i++) {
            int min  = i;
            for(int j = i + 1; j < input.length ; j++) {
                comparisons++;
                if(input[j] < input[min]) {
                    min = j;
                }
            }
            int temp = input[i];
            input[i]  = input[min];
            input[min] = temp;
            exchanges++;
            
            
            
        }
     
    }
}
