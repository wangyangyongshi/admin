package lambda;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author 王二小
 * @date 2018/12/9 21:29
 *
 * //在这里可能会抛出一个异常：
 * //Exception in thread "main" java.lang.UnsupportedOperationException：原因解释
 * //            首先这个异常表示请求的方法不被支持，在arrays.asList()转化过来的list不支持add()和remove()方法，这是由于
 * //    arrays.aslist()返回的是arrays$arraylist();
 * //      array$arraylist,和arraylist都是继承自abstractlist,在AbstractList中add(),和remove()方法都默认抛出异常，但是arraylist
 * //    对这两个方法进行了重写，所以不会抛出异常
 *
 * //    解决办法：转化成arraylist;
 */
public class DeleteByLambda {
    //删除容器中数据
    public static void main(String[] args) {
        String [] ars = {"player12","player13","player13","player14"};
//        List<String> strList = Arrays.asList(ars);
        List<String> strList = new ArrayList<>();
        for(String player:ars){
            strList.add(player);
        }


//        Iterator it = strList.iterator();
//        while (it.hasNext()){
//            String playler = (String) it.next();
//            if("player13".equals(playler)){
//                it.remove();
//            }
//
//        }
//
//        //new way
//        strList.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                if("player13".equals(s)){
//                    return true;
//                }
//                return false;
//            }
//        });
//
//        Iterator<String> iterator = strList.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        //new way 2
        strList.removeIf((playerLa)->"player13".equals(playerLa));
        strList.forEach((x)-> System.out.println(x));//----->思想要转变

    }




}
