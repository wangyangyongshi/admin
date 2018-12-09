package lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wangyang on 2018/12/7.
 * java8中增加了一些超级棒的流apis
 */
//需求1：求和
//需求:使用 Lambda 表达式打印数值中每个元素的平方;
public class Streams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, null, 5, 6, 7, 8, 9);

        list.stream().filter(x->x!=null).map((x) -> x * x).forEach(System.out::println);
//
//        Runnable runnable = () ->{
//            System.out.println("=====");
//        };

        Integer integer = list.stream().filter(x -> x != null).reduce((s, y) -> s+ y).get();
        System.out.println(integer);

    }
}
