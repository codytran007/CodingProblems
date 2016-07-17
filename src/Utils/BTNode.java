package Utils;

/**
 * Created by Cody on 2016-07-17.
 */
public class BTNode {
    private Object value;
    private BTNode left, right;

    public BTNode(Object value) {
        this.value = value;
        left = null;
        right = null;
    }

    public Object getValue() {
        return this.value;
    }

    public BTNode getLeft() {
        return this.left;
    }

    public void setLeft(BTNode node) {
        this.left = node;
    }

    public BTNode getRight() {
        return this.right;
    }

    public void setRight(BTNode node) {
        this.right = node;
    }

    public boolean equals(BTNode other) {
        return this.value.equals(other.getValue());
    }

    public String toString() {
        return this.value.toString();
    }
}
