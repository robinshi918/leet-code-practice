package com.robin;

public class HelloWorld {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		
		ListNode head = new ListNode(5);
		head.append(1).append(1).append(3).append(3).append(4).append(5);
		
		System.out.println(head.toString());
		
		solution.deleteDuplicates2(head);
		System.out.println(head.toString());
	}
}



