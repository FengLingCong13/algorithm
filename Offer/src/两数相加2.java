/**
 * 两数相加2 class
 *
 * @author Flc
 * @date 2019/7/22
 */
public class 两数相加2 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode answer = new ListNode(-1);
            ListNode x3 = answer;
            boolean flag = false;
            while(l1 != null && l2!=null ) {
                if(flag == true) {
                    if(l1.val + l2.val + 1 < 10) {
                        ListNode newNode = new ListNode(l1.val + l2.val + 1);
                        flag = false;
                        x3.next = newNode;
                    }else {
                        ListNode newNode = new ListNode(l1.val + l2.val + 1 - 10);
                        x3.next = newNode;
                        flag = true;
                    }
                } else {
                    if(l1.val + l2.val < 10) {
                        ListNode newNode = new ListNode(l1.val + l2.val);
                        flag = false;
                        x3.next = newNode;
                    }else {
                        ListNode newNode = new ListNode(l1.val + l2.val - 10);
                        x3.next = newNode;
                        flag = true;
                    }
                }
                l1 = l1.next;
                l2 = l2.next;
                x3 = x3.next;
                if(l1 == null && l2 !=null) {
                    if(flag == true) {
                        l2.val = l2.val+1;
                    }
                    break;
                }else if(l2 == null && l1!=null) {
                    if(flag == true) {
                        l1.val = l1.val+1;
                    }
                    break;
                }
            }
            if(l1==null && l2 ==null && flag == true) {
                ListNode newNode = new ListNode(1);
                x3.next = newNode;
            }
            while(l1 != null) {
                if(l1.val < 10) {
                    ListNode newNode = new ListNode(l1.val);
                    x3.next = newNode;
                }else {
                    ListNode newNode = new ListNode(l1.val - 10);
                    x3.next = newNode;
                    if(l1.next == null) {
                        ListNode newNode2 = new ListNode(1);
                        x3.next.next = newNode2;
                        break;
                    }else {
                        l1.next.val=l1.next.val+1;
                    }
                }
                l1=l1.next;
                x3 = x3.next;
            }
            while(l2 != null) {
                if(l2.val < 10) {
                    ListNode newNode = new ListNode(l2.val);
                    x3.next = newNode;
                }else {
                    ListNode newNode = new ListNode(l2.val - 10);
                    x3.next = newNode;
                    if(l2.next == null) {
                        ListNode newNode2 = new ListNode(1);
                        x3.next.next = newNode2;
                        break;
                    }else {
                        l2.next.val=l2.next.val+1;
                    }
                }
                l2=l2.next;
                x3 = x3.next;
            }
            answer=answer.next;
            return answer;
        }
    }
}
class ListNode {
          int val;
          ListNode next;
         ListNode(int x) { val = x; }
}
