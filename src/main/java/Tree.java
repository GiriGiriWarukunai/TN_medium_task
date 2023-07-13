import java.util.ArrayList;

class Tree {
    private Node rootNode;

    public Tree() {
        rootNode = null;
    }

    public Tree(int value) {
        Node newNode = new Node();
        newNode.setValue(value);
        rootNode = newNode;
    }

//    public Node findNode(int value) {
//        Node curNode = rootNode;
//        while (curNode.getValue() != value) {
//            if (value < curNode.getValue()) {
//                curNode = curNode.getLeft();
//            } else {
//                curNode = curNode.getRight();
//            }
//            if (curNode == null) {
//                return null;
//            }
//        }
//        return curNode;
//    }

    public int addNode(int value) {
        Node newNode = new Node();
        newNode.setValue(value);
        if (rootNode == null) {
            rootNode = newNode;
            return 1;
        }
        else {
            Node curNode = rootNode;
            Node parentNode;
            while (true)
            {
                parentNode = curNode;
                if(value == curNode.getValue()) {
                    return -1;
                }
                else if (value < curNode.getValue()) {
                    curNode = curNode.getLeft();
                    if (curNode == null){
                        parentNode.setLeft(newNode);
                        return 0;
                    }
                }
                else {
                    curNode = curNode.getRight();
                    if (curNode == null) {
                        parentNode.setRight(newNode);
                        return 0;
                    }
                }
            }
        }
    }

    public ArrayList<Integer> preorderTraversal(){
        return preorderTraversalInner(rootNode, new ArrayList<Integer>());
    }

    public ArrayList<Integer> preorderTraversalInner(Node node, ArrayList<Integer> res) {
        res.add(node.getValue());
        if (node.getLeft() != null) {
            preorderTraversalInner(node.getLeft(), res);
        }
        if (node.getRight() != null) {
            preorderTraversalInner(node.getRight(), res);
        }
        return res;
    }

    public ArrayList<Integer> inorderTraversal(){
        return inorderTraversalInner(rootNode, new ArrayList<Integer>());
    }

    public ArrayList<Integer> inorderTraversalInner(Node node, ArrayList<Integer> res){
        if (node.getLeft() != null) {
            inorderTraversalInner(node.getLeft(), res);
        }
        res.add(node.getValue());
        if (node.getRight() != null) {
            inorderTraversalInner(node.getRight(), res);
        }
        return res;
    }

    public ArrayList<Integer> postorderTraversal(){
        return postorderTraversalInner(rootNode, new ArrayList<Integer>());
    }

    public ArrayList<Integer> postorderTraversalInner(Node node, ArrayList<Integer> res) {
        if (node.getLeft() != null) {
            postorderTraversalInner(node.getLeft(), res);
        }
        if (node.getRight() != null) {
            postorderTraversalInner(node.getRight(), res);
        }
        res.add(node.getValue());
        return res;
    }
}