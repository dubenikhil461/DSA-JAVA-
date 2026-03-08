public class IntersectionLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node findIntersection(Node head1, Node head2) {
        int len1 = getLength(head1);
        int len2 = getLength(head2);

        int diff = Math.abs(len1 - len2);

        Node temp1 = head1;
        Node temp2 = head2;

        if (len1 > len2) {
            for (int i = 0; i < diff; i++)
                temp1 = temp1.next;
        } else {
            for (int i = 0; i < diff; i++)
                temp2 = temp2.next;
        }

        while (temp1 != null && temp2 != null) {
            if (temp1 == temp2) {
                return temp1; // intersection node found
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }

    public static int getLength(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {
        // Common intersection part: 30 -> 40 -> 50
        Node common = new Node(30);
        common.next = new Node(40);
        common.next.next = new Node(50);

        // First Linked List (length 7): 3 -> 6 -> 9 -> 12 -> 15 -> 30 -> 40 -> 50
        Node head1 = new Node(3);
        head1.next = new Node(6);
        head1.next.next = new Node(9);
        head1.next.next.next = new Node(12);
        head1.next.next.next.next = new Node(15);
        head1.next.next.next.next.next = common; // intersection starts here

        // Second Linked List (length 4): 10 -> 15 -> 30 -> 40 -> 50
        Node head2 = new Node(10);
        head2.next = new Node(15);
        head2.next.next = common; // intersection starts here

        // 🧠 Your Task: Implement and call findIntersection(head1, head2)
        // Example:
        Node intersection = findIntersection(head1, head2);
        System.out.println("Intersection Node: " + intersection.data);
    }
}
