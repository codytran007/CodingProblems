package Problems;

import Utils.BTNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Cody on 2016-07-17.
 */
public class GetNthNodeTest {

    private BTNode root;
    private int n;

    @Before
    public void setUp() throws Exception {
        root = new BTNode(50);
        root.setLeft(new BTNode(25));
        root.getLeft().setLeft(new BTNode(15));
        root.getLeft().setRight(new BTNode(40));
        root.setRight(new BTNode(75));
        root.getRight().setRight(new BTNode(100));
    }

    @Test
    public void testGetNthNode() throws Exception {
        assertNull(GetNthNode.getNthNode(root, -1));
        assertNull(GetNthNode.getNthNode(root, 0));
        assertEquals(15, GetNthNode.getNthNode(root, 1).getValue());
        assertEquals(25, GetNthNode.getNthNode(root, 2).getValue());
        assertEquals(40, GetNthNode.getNthNode(root, 3).getValue());
        assertEquals(50, GetNthNode.getNthNode(root, 4).getValue());
        assertEquals(75, GetNthNode.getNthNode(root, 5).getValue());
        assertEquals(100, GetNthNode.getNthNode(root, 6).getValue());
    }

}