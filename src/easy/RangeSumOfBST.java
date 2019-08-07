package easy;

public class RangeSumOfBST {

//    Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
//    Output: 32

    /*
                 10
               /   \
              /     \
             5      15
           /  \   /   \
          3   7  null 18

     */


    public int rangeSumBST(TreeNode root, int L, int R) {

        if(root == null)
            return 0;

        int result = 0;

        if (root.val >= L && root.val <= R)
            result += root.val;

        result += rangeSumBST(root.right, L, R);
        result += rangeSumBST(root.left, L, R);

        return result;
    }


}

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

}