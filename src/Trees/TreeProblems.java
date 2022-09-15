package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeProblems {
    public static void InOrderRecursion(BNode root){
        if (root == null) return;
        InOrderRecursion(root.left);
        System.out.print(root.data + " ");
        InOrderRecursion(root.right);
    }

    public static void InOrder(BNode root){
        if (root == null) return;
        Stack<BNode> treeStack = new Stack<>();
        BNode curr = root;


        while (curr != null || !treeStack.empty()){
            if (curr != null){
                treeStack.push(curr);
                curr = curr.left;
            }
            else{
                curr = treeStack.peek();
                treeStack.pop();
                System.out.print(curr.data + " ");
                curr = curr.right;
            }
        }
    }
}
