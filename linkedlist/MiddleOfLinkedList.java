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
    public ListNode middleNode(ListNode head) {
        
        
        int leng = 0 , i = 0 , j = 0  ; 
    
        ListNode temp = head ; 
        if( temp == null || temp.next == null){
            return null ;
        }
        
        
        
        while ( temp != null){
            temp = temp.next ; 
            leng++; 
        }
        
        if( leng == 1 ){

            return head ; 
        }
        // REINTIALSE THE pointer
        temp = head; 
        j = leng ;
       
            
          for ( i = 0 ; i < j/2  ; i++ ){
               temp = temp.next ;  
            }
            return temp ; 
        
        
    }
}