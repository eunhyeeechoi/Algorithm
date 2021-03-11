package LeetCode;

public class AddOneRowToTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public TreeNode addOneRow(TreeNode root, int v, int d) {
		if (d == 1) {
			TreeNode t = new TreeNode(v);
			t.left = root;
			return t;
		}
		helper(root, v, d, 1);
		return root;
	}

	private void helper(TreeNode root, int v, int d, int currLevl) {
		if (currLevl == d - 1) {
			TreeNode t1 = new TreeNode(v);
			TreeNode t2 = new TreeNode(v);

			t1.left = root.left;
			t2.right = root.right;
			root.left = t1;
			root.right = t2;
			return;
		}
		if (root.left != null) {
			helper(root.left, v, d, currLevl + 1);
		}
		if (root.right != null) {
			helper(root.right, v, d, currLevl + 1);
		}
	}

	public static void main(String[] args) {
		AddOneRowToTree aa = new AddOneRowToTree();
//		TreeNode root = {4,2,6,3,1,5};
		int v = 1;
		int d = 2;
//		aa.addOneRow(root, v, d);
	}
}
