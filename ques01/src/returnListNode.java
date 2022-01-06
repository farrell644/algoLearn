import org.junit.Test;

import java.util.Stack;

public class returnListNode {
    //给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。

    //  Definition for singly-linked list.
      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public static void main(String[] args) {
//        ListNode h = new ListNode(1);
//        h.next = new ListNode(2);
        int arr[] = {1,2,2,1};
        ListNode listNode = convertToListNode(arr);
        System.out.println(isPalindrome(listNode));

    }
        public static boolean isPalindrome(ListNode head) {
            Stack<Integer> stack = new Stack<>();
            int halflength = lengthOfListNode(head)/2;
            for (int i = 0; i < halflength; i++) {
                stack.push((Integer) head.val);
                head = head.next;
            }
            for (int i = 0; i < halflength; i++) {
                boolean b = head.val!= (Integer)stack.pop();
                if( b) return false;
            }
            return  true;
        }
    public static int lengthOfListNode(ListNode listNode){
        if(listNode ==null)
            return 0;
          int res = 1;
          while(listNode.next!=null){
              res++;
              listNode =listNode.next;
          }
          return res;
    }
    public static ListNode convertToListNode(int[] arr){
        ListNode res = new ListNode();
        if(arr==null){
            res =null;
            return res;
        }else{
            res.val = arr[0];
            for (int i = 1; i < arr.length; i++) {
                res.next = new ListNode(arr[i]);
            }
        }
        return res;
    }
}
