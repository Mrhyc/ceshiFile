/**
 * @author huangyuchen
 * @version 1.0
 * @date 2021/6/25 9:40
 */
public class 合并两个有序链表21 {
    public static void main(String[] args) {

    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = null;
        while(l1.next!=null||l2.next!=null){
            if(l1.val>l2.val){
                listNode.next = l2;
                listNode.next.val = l2.val;
                l2 = l2.next;
                listNode = listNode.next;
            }
            if(l1.val<l2.val){
                listNode.next = l1;
                listNode.next.val = l1.val;

                listNode = listNode.next;
            }
            if(l1.val == l2.val){
                listNode.next = l1;
                listNode.next.val = l1.val;
                listNode.next.next = l2;
                listNode.next.next.val = l2.val;
                listNode = listNode.next.next;
            }

        }
        return listNode;
    }
}
