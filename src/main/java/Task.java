import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.addNode(4);
        tree.addNode(5);
        tree.addNode(7);
        tree.addNode(2);
        tree.addNode(3);
        tree.addNode(6);
        tree.addNode(1);

          /*   4
              / \
             2   5
           /  \   \
          1    3   7
                  /
                 6    */


        System.out.println("Результат прямого обхода дерева: " + tree.preorderTraversal());
        System.out.println("Результат симметричного обхода дерева: " + tree.inorderTraversal());
        System.out.println("Результат обратного обхода дерева: " + tree.postorderTraversal());

    }
}
