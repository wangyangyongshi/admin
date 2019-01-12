package BinTree;

/**
 * @author 王二小
 * @date 2019/1/12 20:30
 */
public class MyNode {
    private String value;//节点的业务数据
    private MyNode left;//左子树
    private MyNode right;//右子树

    public MyNode(String value, MyNode left, MyNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    //访问当前节点
    public void visit() {
        System.out.println(value + " ");
    }

    public MyNode getLeft() {
        return left;
    }

    public MyNode getRight() {
        return right;
    }


}
