package dataStructures.linkedLists;

/**
 *
 * @author makerGeek
 */
public class Five {

    public static void main(String[] args) {
        Node a = Node.intToNode(156);
        a.printReverse();
        System.out.println("+");
        Node b = Node.intToNode(65);
        b.printReverse();
        System.out.println("=");
        linkedSum(a, b).printReverse();
    }

    public static Node linkedSum(Node a, Node b) {
        Node res = new Node();
                    int c = 0;
        while (true) {

            if (a == null && b == null) {
                break;
            }
            if (a != null) {
                c += a.val;
                a = a.next;
            }

            if (b != null) {
                c += b.val;
                b = b.next;
            }

            if (c < 10) {
                res.appendTail(new Node(c));
                c = 0;
            } else {
                res.appendTail(new Node(c % 10));
                c /= 10;
            }
        }
        if (c != 0) {
            if (c < 10) {
                res.appendTail(new Node(c));
                c = 0;
            } else {
                res.appendTail(new Node(c % 10));
                c /= 10;
                if(c!=0)
                res.appendTail(new Node(c));
            }
        }
        return res.next;
    }
}
