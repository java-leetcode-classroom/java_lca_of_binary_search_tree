import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void lowestCommonAncestorExample1() {
    TreeNode[] nodes = sol.createBinaryTree(new String[]{
        "6", "2", "8", "0", "4", "7", "9", "null", "null", "3", "5"
    }, 6);
    TreeNode root = nodes[0], expectNode = nodes[1];
    assertEquals(expectNode, sol.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(8)));
  }
  @Test
  void lowestCommonAncestorExample2() {
    TreeNode[] nodes = sol.createBinaryTree(new String[]{
        "6", "2", "8", "0", "4", "7", "9", "null", "null", "3", "5"
    }, 2);
    TreeNode root = nodes[0], expectNode = nodes[1];
    assertEquals(expectNode, sol.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(4)));
  }
  @Test
  void lowestCommonAncestorExample3() {
    TreeNode[] nodes = sol.createBinaryTree(new String[]{
        "2", "1"
    }, 2);
    TreeNode root = nodes[0], expectNode = nodes[1];
    assertEquals(expectNode, sol.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(1)));
  }
}