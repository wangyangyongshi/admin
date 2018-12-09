package ZhengZe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 王二小
 * @date 2018/12/9 23:44
 * 验证11位的电话号码
 */
public class verifyPhoneNumber {
    public static void main(String[] args) {
        String str = "18822223333";
        //电话号码必须是11位，必须是1开头，第二位必须是3,5，7,8，第三位必须是0~9的任何一位数值，后面的同理0~~9

//        String regx = "^[1][3|5|7|8][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]$";
        String regx = "^[1][3|5|7|8][0-9]{9}$";//表示重复9次
        Pattern p = Pattern.compile(regx);
        Matcher matcher = p.matcher(str);
        boolean b = matcher.find();
        System.out.println(b);


    }
}
