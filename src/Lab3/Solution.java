package Lab3;

import java.util.function.Function;
import java.util.stream.IntStream;

public class Solution {

    public static long superDigit(long number) throws Exception {
        if (number < 0) {
            throw new Exception("Number must be positive or zero");
        } else if (number < 10) {
            return number;
        } else {
            return superDigit(superDigit(number / 10) + number % 10);
        }
    }

    private static int powerSumHelper(int number, int power, int start)
    {
        if (number == 0) {
            return 1;
        } else {
            final int root = (int) Math.ceil(Math.pow(number, 1.0 / power));
            final Function<Integer, Integer> subtractPowerOf = i -> number - (int) Math.pow(i, power);

            return IntStream.rangeClosed(start, root)
                    .filter(i -> subtractPowerOf.apply(i) >= 0)
                    .map(i -> powerSumHelper(subtractPowerOf.apply(i), power, i + 1))
                    .sum();
        }
    }

    public static int powerSum(int number, int power) throws Exception {
        if (number < 1) {
            throw new Exception("Number must be 1 or greater");
        } else if (power < 2) {
            throw new Exception("Power must be 2 or greater");
        } else {
            return powerSumHelper(number, power, 1);
        }
    }
}
