public class Functions {
    public static void main(String[] args) {
        String columns = String.format("| %3s | %22s | %22s | %22s | %22s" +
                "| %22s | %22s | %22s |",
                "n", "2^n", "n ^ 3",
                "n . 2 ^ n", " ln n", "(3/2) ^ n",
                " n log n", " 2 ^ log n");
        System.out.println(columns);
        for (int i = 0; i < 101; i++) {
            String output = String.format("| %3s | %22s | %22s | %22s" +
                    "| %22s | %22s | %22s | %22s |", i, Math.pow(2, i),
                    Math.pow(3, i),
                    i * (Math.pow(2, i)), Math.log(i),
                    Math.pow(1.5, i), i * (Math.log(i) / Math.log(2)),
                    Math.pow(2, Math.log(Math.log(i) / Math.log(2))));
            System.out.println(output);
        }
        System.out.println();
        columns = String.format("| %22s | %22s |",
                "ln ln n", "log n");
        System.out.println(columns);
        for (int i = 0; i < 101; i++) {
            String output = String.format("| %22s | %22s |",
                    Math.log(Math.log(i)), Math.log(i) / Math.log(2));
            System.out.println(output);
        }

        columns = String.format("| %3s | %22s | %22s | %22s |" +
                "%22s | %22s | %22s | %22s |", "n", "2^n", "n ^ 3",
                "n . 2 ^ n", " ln n", "(3/2) ^ n",
                " n log n", " 2 ^ log n");
        System.out.println(columns);
        for (int i = 0; i < 21; i++) {
            String output = String.format("| %3s | %22s | %22s | %22s " +
                    "| %22s | %22s | %22s | %22s |",
                    i, Math.pow(2, i),
                    Math.pow(3, i),
                    i * (Math.pow(2, i)), Math.log(i),
                    Math.pow(1.5, i), i * (Math.log(i) / Math.log(2)),
                    Math.pow(2, Math.log(Math.log(i) / Math.log(2))));
            System.out.println(output);
        }
        System.out.println();
        columns = String.format("| %22s | %22s | %22s |", 
        "ln ln n", "log n", "n!");
        System.out.println(columns);
        for (int i = 0; i < 21; i++) {
            String output = String.format("| %22s | %22s | %22s |",
                    Math.log(Math.log(i)), Math.log(i) / Math.log(2),
                    factorial(i));
            System.out.println(output);
        }

    }

    static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
