package lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wangyang on 2018/12/7.
 * <p>
 * 循环使用lambda
 */
public class ForEach {

    public static void main(String[] args) {
        //old way
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//        for (Integer n : list) {
//            System.out.println(n);
//        }

        //new way
//        list.forEach((x)->{
//            System.out.println(x);
//        });

        //或则we  can  use ::
        list.forEach(System.out::println);
    }
}
