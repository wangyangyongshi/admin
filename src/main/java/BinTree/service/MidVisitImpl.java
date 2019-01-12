package BinTree.service;

import BinTree.MyNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author 王二小
 * @date 2019/1/12 20:53
 * 中序遍历
 */
public class MidVisitImpl implements VisitAll {

    @Override
    public void visitTree(MyNode myNode) {
        Deque<MyNode> deque = new ArrayDeque<>();
        //如果当前节点不为空，或者当前栈中有东西
        while (myNode != null || deque.size() > 0) {
            while (myNode != null) {
                deque.push(myNode);
                myNode = myNode.getLeft();

                if (deque.size() > 0) {
                    myNode = deque.pop();
                    myNode.visit();
                    myNode = myNode.getRight();
                }
            }

        }
    }
}
