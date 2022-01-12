package kyu4;

import java.util.*;

public class SortBinaryTreeByLevels {
    public static void main(String[] args) {


        treeByLevels((new Node
                (new Node(null,
                        new Node(null, null, 4), 2),
                        new Node(new Node(null, null, 5),
                                new Node(null, null, 6), 3), 1)));
    }

    public static List<Integer> treeByLevels(Node node) {

        if (node == null) return new ArrayList<>();

        List<Integer> outputList = new ArrayList();

        LinkedList<Node> nodeLinkedList = new LinkedList<>();
        nodeLinkedList.add(node);

        while (!nodeLinkedList.isEmpty()) {
            Node node1 = nodeLinkedList.poll();
            outputList.add(node1.value);
            if (node1.left != null)
                nodeLinkedList.add(node1.left);
            if (node1.right != null)
                nodeLinkedList.add(node1.right);
        }

        return outputList;
    }
}


class Node {
    public Node left;
    public Node right;
    public int value;

    public Node(Node l, Node r, int v) {
        left = l;
        right = r;
        value = v;
    }
}
/*
Your task is to return the list with elements from tree sorted by levels, which means the root element goes first, then root children (from left to right) are second and third, and so on.

Return empty list is root is 'null'.

Example 1 - following tree:

                 2
            8        9
          1  3     4   5
Should return following list:

[2,8,9,1,3,4,5]
 */