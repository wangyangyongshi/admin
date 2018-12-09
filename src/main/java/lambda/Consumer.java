package lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author 王二小
 * @date 2018/12/9 23:21
 */
public class Consumer {

    public static void main(String[] args) {
        String [] list = {"a1","a2","a3","a4"};
        List<String> strings = Arrays.asList(list);
        strings.forEach(new java.util.function.Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.err.println("=====================");
        //使用lambda表达式
        strings.forEach(x-> System.out.println(x));

    }
}
