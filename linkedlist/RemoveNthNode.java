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

    ListNode removeNthFromEnd(ListNode head, int n) {
        
         if (head == null ) return null ;         

        // count the length of the list
        ListNode temp = head ; 
        int leng = 0 ;
        while (temp != null){

             leng++ ;
            temp = temp.next ;  
        }

        temp = head; 
        ListNode curr = null ;
        // if the node is the head remove it directly
        if(leng == n){
            return head.next ; 
        }
            
        // if the node isn't the head continue seaching on the node that we want to delete    
        int i = 0 ; 
        temp = head ; 
        for(i = 0 ; i < leng - n -1  ; i++){
            temp = temp.next; 
        }
        temp.next = temp.next.next ; 
        
return head ; 

    }
};