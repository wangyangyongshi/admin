import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

//import java.util.IntSummaryStatistics;

//import java.util.IntSummaryStatistics;

/**
 * Created by wangyang on 2018/12/5.
 */
public class Lambda {

    //@functionalInterface是java8加入的一种接口，用于指明该接口类型声明是根据java语言规范定义的函数式接口；
    //函数式接口是只包含一个抽象方法声明的接口;

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        IntSummaryStatistics intSummaryStatistics = numbers.stream().mapToInt((x)->x).summaryStatistics();
        System.out.println("List中最大的数字 : "+intSummaryStatistics.getMax());
        System.out.println("List中最小的数字 :"+intSummaryStatistics.getMin());
    }


}
