package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by wangyang on 2018/12/7.
 * predicate----------->lambda表达式
 */
public class PredicateTest {

    public static void main(String[] args) {
        List list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("print all numbers:");
        evaluate(list, (n) -> false);

    }

    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer n : list) {
            if (predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }
}
