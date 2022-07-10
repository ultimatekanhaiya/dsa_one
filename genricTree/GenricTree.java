import java.util.*;

public class GenricTree {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    // display function to display root and its direct child node
    public static void display(Node node) {
        String str = node.data + "->";
        for (Node child : node.children) {
            str += child.data + ",";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }

    }

    // size function to show number of node in tree
    public static int size(Node node) {
        int s = 0;
        for (Node child : node.children) {
            int cs = size(child);
            s += cs;
        }
        s += 1;
        return s;
    }

    // maximum function to print max node in tree
    public static int maximum(Node node) {
        int max = Integer.MIN_VALUE;
        for (Node child : node.children) {
            int cm = maximum(child);
            max = Math.max(cm, max);
        }
        max = Math.max(node.data, max);
        return max;
    }

    // ht function to print height of tree
    public static int height(Node node) {
        int ht = -1;
        for (Node child : node.children) {
            int ch = height(child);
            ht = Math.max(ch, ht);
        }
        ht += 1;
        return ht;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };

        Node root = null;
        Stack<Node> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                stack.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (!stack.isEmpty()) {
                    stack.peek().children.add(t);
                } else {
                    root = t;
                }
                stack.push(t);
            }
        }
        display(root);
        int sz = size(root);
        System.out.println("size of tree " + sz);
        int max = maximum(root);
        System.out.println("maximum " + max);
        int ht = height(root);
        System.out.println("height of tree " + ht);
    }
}