public class Node {
    private int value;
    private Node left = null;
    private Node right = null;


    public int getValue() {
        return this.value;
    }

    public void setValue(final int value) {
        this.value = value;
    }

    public Node getLeft() {
        return this.left;
    }

    public void setLeft(final Node left) {
        this.left = left;
    }

    public Node getRight() {
        return this.right;
    }

    public void setRight(final Node right) {
        this.right = right;
    }

    public void printNode() {
        System.out.println("Значение узла: " + value);
    }
}
