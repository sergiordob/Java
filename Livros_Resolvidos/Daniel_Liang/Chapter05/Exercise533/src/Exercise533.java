public class Exercise533 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 10000; i++)
        {
            for (int j = i-1; j >= 1; j--)
            {
                if (i % j == 0)
                {
                    sum += j;
                }
            }

            if (sum == i)
            {
                System.out.printf("Perfect number found: %d%n", i);
            }

            sum = 0;
        }
    }
}
