// 2021/1/9=============================================================================
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         int temp_val = 0, jinwei_val = 0;
//         ListNode head_node = null, cur_node = null;
//         while(null != l1 && null != l2)
//         {
//             temp_val = l1.val + l2.val + jinwei_val;
//             if (null == head_node)
//             {
//                 head_node = new ListNode(temp_val);
//                 cur_node = head_node;
//             }
//             else
//             {
//                 cur_node.next = new ListNode(temp_val);
//                 cur_node = cur_node.next;
//             }
//             jinwei_val = temp_val/10;
//             temp_val = temp_val%10;
//             cur_node.val = temp_val;
            
//             l1 = l1.next;
//             l2 = l2.next;
//         }
//         if (null == l1 && null != l2)
//         {
//             while (null != l2)
//             {
//                 temp_val = l2.val + jinwei_val;
//                 jinwei_val = temp_val/10;
//                 temp_val = temp_val % 10;

//                 cur_node.next = new ListNode(temp_val);
//                 cur_node = cur_node.next;
//                 l2 = l2.next;
//             }
//         }
//         if (null == l2 && null != l1)
//         {
//             while (null != l1)
//             {
//                 temp_val = l1.val + jinwei_val;
//                 jinwei_val = temp_val/10;
//                 temp_val = temp_val % 10;

//                 cur_node.next = new ListNode(temp_val);
//                 cur_node = cur_node.next;
//                 l1 = l1.next;
//             }
//         }
//         if (0 != jinwei_val)
//         {
//             cur_node.next = new ListNode(jinwei_val);
//         }
//         return head_node;
//     }
// }

//version 2.0

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int n1 = 0, n2 = 0;
        int temp_val = 0, jinwei_val = 0;
        ListNode head = null, tail = null;
        while (null != l1 || null != l2)
        {
            n1 = null != l1? l1.val: 0;
            n2 = null != l2? l2.val: 0;
            temp_val = n1 + n2 + jinwei_val;
            jinwei_val = temp_val / 10;

            if (null == head)
            {
                head = new ListNode(temp_val % 10);
                tail = head;
            }
            else
            {
                tail.next = new ListNode(temp_val % 10);
                tail = tail.next;
            }

            if (null != l1)
            {
                l1 = l1.next;
            }
            if (null != l2)
            {
                l2 = l2.next;
            }
        }

        if (0 != jinwei_val)
        {
            tail.next = new ListNode(jinwei_val);
            tail = tail.next;
        }
        return head;
    }
}