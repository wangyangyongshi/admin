package ZhengZe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 王二小
 * @date 2018/12/9 23:35
 */
public class Qie {

    public static void main(String[] args) {
        String ss  = "abc123";
//        String result = ss.replace("abc", "123");
//        System.out.println(result);

        System.err.println("=============");
        Pattern p = Pattern.compile("[0-9]");
        Matcher matcher = p.matcher(ss);
        String a1 = matcher.replaceAll("A");
        System.out.println(a1);
        String a = ss.replaceAll("[0-9]", "A");
        System.out.println(a);


    }
}
