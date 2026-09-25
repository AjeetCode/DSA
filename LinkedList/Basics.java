public class Basics {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Print a linked list.
    static void printList(Node head) {
        for (Node current = head; current != null; current = current.next) {
            System.out.print(current.data + (current.next == null ? "" : " -> "));
        }
        System.out.println();
    }

    static Node insertAtHead(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    static Node insertAtTail(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    // Deletes the first node that contains data.
    static Node deleteNode(Node head, int data) {
        if (head == null) {
            return null;
        }
        if (head.data == data) {
            return head.next;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
        return head;
    }

    // Compares data and order; nodes do not need to be the same objects.
    static boolean areEqual(Node first, Node second) {
        while (first != null && second != null) {
            if (first.data != second.data) {
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return first == null && second == null;
    }

    static Node reverse(Node head) {
        Node previous = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        return previous;
    }

    // For an even-sized list, this returns the second middle node.
    static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merges two already sorted linked lists in ascending order.
    static Node mergeSortedLists(Node first, Node second) {
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (first != null && second != null) {
            if (first.data <= second.data) {
                tail.next = first;
                first = first.next;
            } else {
                tail.next = second;
                second = second.next;
            }
            tail = tail.next;
        }
        tail.next = (first != null) ? first : second;
        return dummy.next;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertAtHead(head, 20);
        head = insertAtHead(head, 10);
        head = insertAtTail(head, 30);
        System.out.print("List: ");
        printList(head);

        head = deleteNode(head, 20);
        System.out.print("After deleting 20: ");
        printList(head);

        Node other = insertAtTail(insertAtTail(null, 10), 30);
        System.out.println("Lists are equal: " + areEqual(head, other));

        System.out.println("Middle: " + findMiddle(head).data);
        head = reverse(head);
        System.out.print("Reversed: ");
        printList(head);

        Node first = insertAtTail(insertAtTail(null, 1), 3);
        Node second = insertAtTail(insertAtTail(null, 2), 4);
        System.out.print("Merged: ");
        printList(mergeSortedLists(first, second));
    }
}
