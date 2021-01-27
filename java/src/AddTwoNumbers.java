
class ListNode{
    int num;
    ListNode next;

    public ListNode(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "num=" + num +
                ", next=" + next +
                '}';
    }
}

public class AddTwoNumbers {


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode point1=l1,point2=l2;

        ListNode res = null;
        ListNode pointRes = null;
        int carry = 0;
        while (point1!=null || point2!=null){
            int n1 = point1!=null ? point1.num : 0;
            int n2 = point2!=null ? point2.num : 0;
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            if (res == null){
                pointRes = res = new ListNode(sum % 10);
            }else{
                pointRes.next = new ListNode(sum % 10);
                pointRes = pointRes.next;
            }
            point1 = point1!=null ? point1.next : null;
            point2 = point2!=null ? point2.next : null;
        }
        if (carry > 0){
            pointRes.next = new ListNode(carry);
        }
        return res;
    }

    public static void main(String[] args) {
        // l1 = [2,4,3], l2 = [5,6,4]
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode res = addTwoNumbers(l1, l2);
        System.out.println(res);
    }
}


