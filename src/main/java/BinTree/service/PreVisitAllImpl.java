package BinTree.service;

import BinTree.MyNode;

/**
 * @author 王二小
 * @date 2019/1/12 20:31
 * 实现先序遍历
 */
public class PreVisitAllImpl implements VisitAll {
    @Override
    public void visitTree(MyNode myNode) {
        if(myNode == null){
            return;
        }
        myNode.visit();
        visitTree(myNode.getLeft());
        visitTree(myNode.getRight());

    }
}
