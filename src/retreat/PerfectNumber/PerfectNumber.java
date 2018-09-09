package retreat.PerfectNumber;

import java.util.Set;
import java.util.HashSet;


public class PerfectNumber {
    public static Set<Integer> divisors(int number) {
        Set<Integer> divisors = new HashSet<>();
        for (int i = 1; i <= Math.ceil(Math.sqrt(number)); i++) {
            if (number % i == 0) {
                divisors.add(i);
                divisors.add(number / i);
            }
        }
        return divisors;
    }

    public static STATE process(int number) {
        Set<Integer> divisors = PerfectNumber.divisors(number);
        int divisorSum = 0;
        for (Integer divisor : divisors) {
            if (divisor != number) {
                divisorSum += divisor;
            }
        }
        if (divisorSum > number) {
            return STATE.ABUNDANT;
        } else if (divisorSum < number) {
            return STATE.DEFICIENT;
        } else {
            return STATE.PERFECT;
        }
    }
}