class ListNode {
  int val;
  ListNode next;

  ListNode(int val) {
    this.val = val;
    this.next = null;
  }
}

public class ReverseLinkedList {

  public static ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode current = head;
    ListNode next = null;

    while (current != null) {
      // Guarda el siguiente nodo
      next = current.next;

      // Invierte el enlace
      current.next = prev;

      // Avanza los punteros
      prev = current;
      current = next;
    }

    // El nuevo head es prev
    return prev;
  }

  public static void printList(ListNode head) {
    ListNode temp = head;
    while (temp != null) {
      System.out.print(temp.val + " -> ");
      temp = temp.next;
    }
    System.out.println("NULL");
  }

  public static void main(String[] args) {
    // Crear la lista enlazada: 1 -> 2 -> 3 -> 4 -> NULL
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);

    System.out.println("Lista original:");
    printList(head);

    // Invertir la lista
    ListNode reversedHead = reverseList(head);

    System.out.println("Lista invertida:");
    printList(reversedHead);
  }
}
