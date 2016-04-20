package com.robin;


public class Solution83 {
	/**
	 * 83. Remove Duplicates from Sorted List 
	 * Robin: remove duplicated elements from unsorted linked list
	 * @param head
	 * @return
	 */
    public ListNode deleteDuplicates(ListNode head) {

    	ListNode current = head;
        
        while (current != null && current.next != null) {
        	ListNode pointer = current.next;
        	ListNode prev = current;
        	while (pointer != null) {
        		if (pointer.val == current.val) {
        			prev.next = pointer.next;
        			System.out.println("[" + current.val + "]" + head.toString());
        			pointer = pointer.next;
        		}else {
					prev = pointer;
					pointer = pointer.next;
        		}
        	}
        	current = current.next;
        }
    	return head;
    }
    
    /**
     * 83. Remove Duplicates from Sorted List 
     * Robin: remove duplicate elements from sorted linked list
     * @param head
     * @return
     */
    public ListNode deleteDuplicates2(ListNode head) {
    	
    	ListNode current = head;
		while (current != null && current.next != null) {

			ListNode pointer = current.next;
			while (current.val == pointer.val) {
				pointer = pointer.next;
				if (pointer == null) {
					break;
				}
			}
			
			current.next = pointer;
			current = current.next;
		}
    	
    	return head;
    }
}

class ListNode {
    int val;
     ListNode next;
     ListNode(int x) { val = x; }
     
     public ListNode append(ListNode node) {
    	 next = node;
    	 return next; 
     }
     
     public ListNode append(int value) {
    	 return append(new ListNode(value));
     }
     
     public String toString() {
    	StringBuilder sb = new StringBuilder();
    	sb.append(val);
    	ListNode p = this.next;
    	while(p != null) {
    		sb.append("->").append(p.val);
    		p = p.next;
    	}
    	
    	return sb.toString();
     }
}
