# Algo Hour 6

Linked List Values - Java

# Objective

1. Fork and clone this repo.

2. Write a method, linkedListValues, that takes in the head of a linked list as an argument. The method should return an List containing all values of the nodes in the linked list.

3. Push up your work to YOUR fork.

# Test Case

```java
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
```

# Extra Credit

Come up with another test case.

```java
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
```
