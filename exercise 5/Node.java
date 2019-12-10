public class Node {
    private Node leftNode, rightNode;
    private int value;

    public Node(int i) {
        leftNode = null;
        rightNode = null;
        value = i;
    }

    public boolean contains(int v) {
        if (v == value) {
            return true;
        }
        if (v < value) {
            if (leftNode == null) {
                return false;
            } else {
                return leftNode.contains(v);
            }
        } else {
            if (rightNode == null) {
                return false;
            } else {
                return rightNode.contains(v);
            }
        }
    }


    public void insert(int v) {
        if (v == value) {
            return;
        } //
        else if (v < value) {
            if (leftNode == null) {
                Node leftNode = new Node(v);
            } else {
                leftNode.insert(v);
            }
        } else if (v > value) {
            if (rightNode == null) {
                Node rightNode = new Node(v);
            } else {
                rightNode.insert(v);
            }
        }
    }

    public void showAllElements() {
        if (leftNode != null)
            leftNode.showAllElements();
        System.out.println(value);
        if (rightNode != null)
            rightNode.showAllElements();
    }
}