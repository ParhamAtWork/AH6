import java.util.List;
import java.util.ArrayList;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Solution {
  public static List<String> linkedListValues(Node<String> head) {
    List<String> valuesList = new ArrayList<String>();

    while (head != null) {
      valuesList.add(head.val);
      head = head.next;
    }

    return valuesList;
  }

  public static void main(String[] args) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;

    // a -> b -> c -> d

    Solution.linkedListValues(a);
    // -> [ "a", "b", "c", "d" ]
    System.out.println("linkedListValues " + Solution.linkedListValues(a));
  }
}
