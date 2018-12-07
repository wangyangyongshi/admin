package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by wangyang on 2018/12/7.
 * <p>
 * java7和java8的排序
 */
public class Sort {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Google ");
        names.add("Runoob ");
        names.add("Taobao ");
        names.add("Baidu ");
        names.add("Sina ");
        sortUsingJava7(names);
        System.out.println(names);
        System.err.println("================");
        sortUsingJava8(names);
        System.out.println(names);
    }

    private static void sortUsingJava7(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    private static void sortUsingJava8(List<String> names) {
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }

}
