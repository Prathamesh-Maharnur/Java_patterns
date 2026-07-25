class Pattern15 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < 2 * n - 1; i++) {

            int spaces = (i < n) ? (n - 1 - i) : (i - (n - 1));
            int stars = (i < n) ? (2 * i + 1) : (2 * (2 * n - 2 - i) + 1);

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < stars; j++) {
                if (j == 0 || j == stars - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}

/*
1
3
5
7
*/