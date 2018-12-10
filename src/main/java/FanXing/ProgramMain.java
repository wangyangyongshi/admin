package FanXing;

/**
 * Created by wangyang on 2018/12/10.
 * <p>
 * //自定义泛型
 */
public class ProgramMain<T>  implements  Interface<T>{

    public T height;

    public String name;

    public ProgramMain(T height, String name) {
        this.height = height;
        this.name = name;
    }


    public static void main(String[] args) {
        ProgramMain<Double>p = new ProgramMain<Double>(1.0,"wangyang");

    }

    @Override
    public void say(T age) {
        System.out.println(age);
    }
}
