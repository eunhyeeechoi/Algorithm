package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoLinkedLists {
//	https://velog.io/@madpotato1713/Leet-Code-160.-Intersection-of-Two-Linked-ListsC
// 두개의 linkedlist 가 만나는 노드가 있다면 해당 주소값을 return 
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		Set<ListNode> set = new HashSet<>();

		while (headA != null) {
			set.add(headA);
			headA = headA.next;
		}

		while (headB != null) {
			if (set.contains(headB))
				return headB;
			headB = headB.next;
		}

		return null;
	}

	public static void main(String[] args) {
//		ListNode headA = ListNode(4, ListNode);
	}
}
