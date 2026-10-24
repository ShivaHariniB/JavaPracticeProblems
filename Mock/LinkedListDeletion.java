package Mock;

import static java.lang.foreign.MemorySegment.NULL;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListDeletion {

    public static Node deleteHead(Node head) {
        if (head == null) return head;
        head = head.next;
        return head;
    }

    public static Node deleteTail(Node head) {
        if (head == null) return head;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node deleteK(Node head, int k) {
        if (head == null) return head;
        if (k == 1) {
            head = head.next;
            return head;
        }
        int count = 0;
        Node temp = head;
        Node prev = null;
        while (temp.next != null) {
            count++;
            if (count == k) {
                prev.next = prev.next.next;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static Node deleteMiddle(Node head) {
        if (head == null) return head;
        Node fast = head;
        Node slow = new Node(0);
        slow.next = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static Node insertAtBeginning(Node head, int val) {
        Node temp = new Node(val);
        if (head == null) return temp;
        temp.next = head;
        return temp;
    }

    public static Node insertAtEnd(Node head, int val) {
        if (head == null) return new Node(val);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    public static Node insertAtK(Node head, int val, int k) {
        Node newNode = new Node(val);

        if (head == null) return newNode;

        if (k == 1) {
            newNode.next = head;
            head = newNode;
        }
        Node temp = head;
        int count = 0;
        while (temp.next != null) {
            count++;
            if (count == k - 1) {
                newNode.next = temp.next;
                temp.next = newNode;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node reverseList(Node head) {
        if (head == null) return head;
        Node prev = null;
        while (head != null) {
            Node temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    // Create Linked List from Array
    public static Node createLinkedList(int[] arr) {
        if (arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Print Linked List
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 1, 2, 6};
        Node head = createLinkedList(arr);
        head = reverseList(head);

        System.out.print("After Deleting Head: ");
        printList(head);
    }
}
