public class number {
    public static void main(String[] args) {

        int i = 1;
        int j = 1;

        for (i = 1; i <= 100; i++) {

            for (j = 2; j < i; j++) {
                if (i % j == 0)
                    break;
            }
            if (j >= i)
                System.out.println(j);

        }

    }

}
