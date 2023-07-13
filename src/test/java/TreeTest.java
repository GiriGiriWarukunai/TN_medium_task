import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeTest {

    private static Tree treeCase1 = new Tree();
    private static Tree treeCase2 = new Tree();
    private static Tree treeCase3 = new Tree();
    private static Tree treeCaseAddNode = new Tree();

    @BeforeAll
    public static void init(){
        treeCase1.addNode(4);
        treeCase1.addNode(5);
        treeCase1.addNode(7);
        treeCase1.addNode(2);
        treeCase1.addNode(3);
        treeCase1.addNode(6);
        treeCase1.addNode(1);

        /*     4
              / \
             2   5
           /  \   \
          1    3   7
                  /
                 6    */

        treeCase2.addNode(1);
        treeCase2.addNode(4);
        treeCase2.addNode(2);
        treeCase2.addNode(3);
        treeCase2.addNode(5);

        /*  1
             \
              4
             / \
            2   5
             \
              3    */

        treeCase3.addNode(6);
        treeCase3.addNode(8);
        treeCase3.addNode(4);
        treeCase3.addNode(7);
        treeCase3.addNode(9);
        treeCase3.addNode(2);
        treeCase3.addNode(5);
        treeCase3.addNode(1);
        treeCase3.addNode(3);

        /*      6
              /  \
            4     8
           / \   / \
          2   5 7   9
         / \
        1   3          */

    }

    @Test
    void addNodeTest() {
        int case1 = 1;
        int case2 = 2;
        int case3 = 3;
        int case4 = 4;

        assertEquals(1, treeCaseAddNode.addNode(case1));
        assertEquals(0, treeCaseAddNode.addNode(case2));
        assertEquals(-1, treeCaseAddNode.addNode(case2));
        assertEquals(0, treeCaseAddNode.addNode(case3));
        assertEquals(0, treeCaseAddNode.addNode(case4));

    }

    @Test
    void preorderTraversal() {
        assertEquals(List.of(4, 2, 1, 3, 5, 7, 6), treeCase1.preorderTraversal());
        assertEquals(List.of(1, 4, 2, 3, 5), treeCase2.preorderTraversal());
        assertEquals(List.of(6, 4, 2, 1, 3, 5, 8, 7, 9), treeCase3.preorderTraversal());
    }

    @Test
    void inorderTraversal() {
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7), treeCase1.inorderTraversal());
        assertEquals(List.of(1, 2, 3, 4, 5), treeCase2.inorderTraversal());
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9), treeCase3.inorderTraversal());
    }

    @Test
    void postorderTraversal() {
        assertEquals(List.of(1, 3, 2, 6, 7, 5, 4), treeCase1.postorderTraversal());
        assertEquals(List.of(3, 2, 5, 4, 1), treeCase2.postorderTraversal());
        assertEquals(List.of(1, 3, 2, 5, 4, 7, 9, 8, 6), treeCase3.postorderTraversal());
    }
}