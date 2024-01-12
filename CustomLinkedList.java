public class CustomLinkedList {
    public Node head;

    public void displayContents() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }

    public void deleteBackHalf() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
    }
}
