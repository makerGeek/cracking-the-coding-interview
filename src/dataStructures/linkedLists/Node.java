/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructures.linkedLists;

/**
 *
 * @author makerGeek
 */
public class Node {

    int val;
    Node next;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    public void appendTail(Node a) {
        Node runner = this;
        while (runner.next != null) {
            runner = runner.next;
        }
        runner.next = a;
    }

    public void print() {
        Node runner = this;
        while (runner != null) {
            System.out.print(runner.val + " ");
            runner = runner.next;
        }
    }

    public void printReverse() {
        Node runner = this;
        StringBuilder sb = new StringBuilder();
        while (runner != null) {
            sb.append(runner.val + " ");
            runner = runner.next;
        }
        sb.reverse();
        System.out.println(sb.toString());
    }

    public void initSample() {
        Node x = this;
        x.val = 0;
        x.appendTail(new Node(5));
        x.appendTail(new Node(3));
        x.appendTail(new Node(7));
        x.appendTail(new Node(8));
        x.appendTail(new Node(5));
        x.appendTail(new Node(4));
        x.appendTail(new Node(2));
        x.appendTail(new Node(8));
        x.appendTail(new Node(2));
        x.appendTail(new Node(5));
    }
}
