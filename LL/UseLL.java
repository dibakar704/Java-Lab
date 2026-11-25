package LL;

import java.util.Scanner;

public class UseLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        ll.head=ll.buildList(10);
        Node max=ll.findmax(ll.head,ll.head);
       int count=ll.countnode(ll.head,0);
       int found=ll.search(ll.head,1,5);
        System.out.println(found );
       

        
    }
}
