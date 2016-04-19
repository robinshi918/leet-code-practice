package com.robin;

public class HelloWorld {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		
		ListNode head = new ListNode(1);
		head.append(1).append(1).append(3).append(1).append(2).append(3).append(4).append(4);
		System.out.println(head.toString());
		
		solution.deleteDuplicates(head);
		System.out.println(head.toString());
	}
}



