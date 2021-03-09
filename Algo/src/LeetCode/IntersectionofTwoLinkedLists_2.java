package LeetCode;

public class IntersectionofTwoLinkedLists_2 {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int lenA = 0;
		int lenB = 0;
		ListNode nodeA = headA;
		ListNode nodeB = headB;

		if (headA == null || headB == null)
			return null;

		while (nodeA.next != null) {
			nodeA = nodeA.next;
			lenA++;
		}
		while (nodeB.next != null) {
			nodeB = nodeB.next;
			lenB++;
		}
		if (nodeA != nodeB)
			return null;

		nodeA = headA;
		nodeB = headB;

		if (lenA > lenB) {
			int diff = lenA - lenB;
			while (diff > 0) {
				nodeA = nodeA.next;
				diff--;
			}
		} else if (lenA < lenB) {
			int diff = lenB - lenA;
			while (diff > 0) {
				nodeB = nodeB.next;
				diff--;
			}
		} // if~else if end

		while (nodeA != nodeB) {
			nodeA = nodeA.next;
			nodeB = nodeB.next;
		}

		return nodeA;
	}
}
