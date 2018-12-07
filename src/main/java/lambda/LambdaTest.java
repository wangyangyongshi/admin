package lambda;

/**
 * Created by wangyang on 2018/12/7.
 */
public class LambdaTest {

    public static void main(String[] args) {
        //函数式接口
        CalDemo f1 = (x, y) -> {
            return x + y;
        };
        System.out.println(f1.cal(1, 2));
    }


}
