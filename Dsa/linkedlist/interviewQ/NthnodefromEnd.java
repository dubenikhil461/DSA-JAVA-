public class NthnodefromEnd {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node nthNode(Node head, int n) {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int s = (size - n) + 1;
        temp = head;
        for (int i = 1; i <= s - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // very imp method;
    public static Node nthNode2(Node head, int n) {
        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static Node remnthNode2(Node head, int n) {
        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;

        // Node q = nthNode(a, 3);
        // System.out.println(q.data);
        // Node s = nthNode2(a, 3);
        // System.out.println(s.data);
        a = remnthNode2(a, 6);
        Node temp = a;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}
