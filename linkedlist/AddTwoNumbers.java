/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1 ; 
        ListNode temp2 = l2 ; 
        ListNode summ = new ListNode(0);
         ListNode tail= summ  ; 
         
    int carry = 0 ; 
     while(temp1 != null  || temp2 != null || carry != 0 ){

       // ternary operator
       int x = (temp1 != null) ? temp1.val : 0 ;
       int y = (temp2 != null) ? temp2.val : 0 ; 

       int sum = x + y + carry ; 
       carry = sum / 10 ; 
       int digit = sum % 10 ; 
       tail.next = new ListNode(digit);
        tail = tail.next ; 
        if(temp1 != null) temp1 = temp1.next ; 
        if(temp2 != null) temp2 = temp2.next ; 
      
     }

    return summ.next ; 
    }
}