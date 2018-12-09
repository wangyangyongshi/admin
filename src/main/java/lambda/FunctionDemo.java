package lambda;

import java.util.function.Function;

/**
 * @author 王二小
 * @date 2018/12/9 23:04
 * //输入一个整数，返回他的字符串
 */
public class FunctionDemo {

    public static void main(String[] args) {
        Function<Integer,String>functions = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return String.valueOf(integer);
            }
        };

        System.out.println(functions.apply(100));

        Function function = (x)->String.valueOf(x);
        System.out.println(function.apply(101));

        //输入一个数字，返回一个5倍的 字符串展示
        Function<Integer,String> function2 = ( x)->String.valueOf(x * 5);
        System.out.println(function2.apply(100));
    }


}
