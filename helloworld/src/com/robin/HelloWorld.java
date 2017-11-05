package com.robin;

public class HelloWorld {

	public static void main(String[] args) {

		doSolution2();
	}


	private static void doSolution83() {
		Solution83 solution = new Solution83();

		ListNode head = new ListNode(5);
		head.append(1).append(1).append(3).append(3).append(4).append(5);

		System.out.println(head.toString());

		solution.deleteDuplicates(head);
		System.out.println(head.toString());
	}

	private static void doSolution3() {
		Solution_3 solution = new Solution_3();

		int[] array = {2,3,5,7,9};
        System.out.println(array.toString());

		int[] result = solution.twoSum(array, 16);

		System.out.println(String.format("[%d, %d]", result[0], result[1]));
	}

	private static void doSolution2() {
		Solution2 solution = new Solution2();
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(8);
		ListNode l2 = new ListNode(0);

		ListNode result = solution.addTwoNumbers(l1, l2);
		System.out.print(result.val);
		while (result.next != null) {
			result = result.next;
			System.out.print(" -> " + result.val);

		}
	}
}



