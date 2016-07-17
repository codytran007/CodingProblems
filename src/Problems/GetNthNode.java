package Problems;

import Utils.BTNode;
import Utils.Counter;

/**
 * Created by Cody on 2016-07-17.
 */
public class GetNthNode {
    public static BTNode getNthNode(BTNode root, int n) {
        return getNthNode(root, n, new Counter());
    }

    private static BTNode getNthNode(BTNode root, int n, Counter counter) {
        if (root == null) return null;
        else if (n < 0) return null;
        else {
            if (root.getLeft() != null) {
                BTNode nthNode = getNthNode(root.getLeft(), n, counter);
                if (nthNode != null) {
                    return nthNode;
                }
            }

            counter.increment();
            if (counter.getCount() == n) {
                return root;
            }

            if (root.getRight() != null) {
                return getNthNode(root.getRight(), n, counter);
            }
            return null;
        }
    }
}
