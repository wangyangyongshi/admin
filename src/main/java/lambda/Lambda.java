package lambda;

//import java.util.IntSummaryStatistics;

//import java.util.IntSummaryStatistics;

/**
 * Created by wangyang on 2018/12/5.
 */
public class Lambda {

    //@functionalInterface是java8加入的一种接口，用于指明该接口类型声明是根据java语言规范定义的函数式接口；
    //函数式接口:指是只包含一个抽象方法声明的接口;比如：Runnable;ActionListener 也是一种函数式接口
    //直接匿名函数
    public Runnable run2 = () -> {
        System.out.println("run2======================");
    };

//    public add(int a,int b)->{return a+b;};

//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        IntSummaryStatistics intSummaryStatistics = numbers.stream().mapToInt((x)->x).summaryStatistics();
//        System.out.println("List中最大的数字 : "+intSummaryStatistics.getMax());
//        System.out.println("List中最小的数字 :"+intSummaryStatistics.getMin());
//    }

    public static void main(String[] args) {
        //java中使用匿名方法必须要对应接口中的一个抽象方法
        //必须是一个接口
        Lambda lambda = new Lambda();
        lambda.run2.run();//
    }
}
