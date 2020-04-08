package com.fun.linkedlist;

public class BubbleSortUsingLinkedList
{
    private static class Node{
        Node next = null;
        int value;
        //Integer count;
    }
    public static void main(String[] args) {
        Node head = null;
        Node prev = null;
        Node n = new Node();

        for(int i = 4; i < 20;){
            n = new Node();
            if(head == null)
                head = n;

            if(i % 2 == 0){
                ++i;
                n.value = i * 2;

            }
            else if(i % 3 == 0){
                i += 2;
                n.value = i * -2;

            }
            else{
                n.value = i;
                i++;
            }
            if(prev != null)
                prev.next = n;

            prev = n;
        }

        Node tmp = head;

        while(tmp != null){
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }

        Node first = head;
        Node sec;
        int anoTmp;
        while((sec = first.next) != null){
            while(sec != null){
                //  System.out.println("in");
                if(sec.value < first.value){
                    anoTmp = sec.value;
                    sec.value = first.value;
                    first.value = anoTmp;
                }
                sec = sec.next;
            }
            first = first.next;
        }
        System.out.println();
        tmp = head;
        while(tmp != null){
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }

    }

}
