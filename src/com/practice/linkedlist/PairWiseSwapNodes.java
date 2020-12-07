package com.practice.linkedlist;

public class PairWiseSwapNodes {

    public Node node;

    public Node swapPairWiseNodes(Node head){

        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        Node newHead = head.next;
        Node curr = head;
        Node prev = null;
        while(curr != null && curr.next !=null){

            Node next = curr.next.next;
            curr.next.next = curr;
            if(prev!=null){
                prev.next = curr.next;
            }
            prev = curr;
            curr = next;
        }
        //System.out.println("prev" + prev.data);
        //System.out.println("Curr" + curr.data);
        prev.next = curr;
        return newHead;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.next = node2;
        Node node3 = new Node(3);
        node2.next = node3;
        Node node4 = new Node(4);
        node3.next = node4;
        Node node5 = new Node(5);
        node4.next = node5;
        Node node6 = new Node(6);
        node5.next = node6;
        Node node7 = new Node(7);
        node6.next = node7;

        PairWiseSwapNodes pairWiseSwapNodes = new PairWiseSwapNodes();
        Node newHead = pairWiseSwapNodes.swapPairWiseNodes(node1);
        while(newHead != null){
            System.out.println(newHead.data);
            newHead = newHead.next;
        }


    }
}



class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }

}