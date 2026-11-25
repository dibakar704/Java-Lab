package LL;

public class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }
Node build(Node k,int val){
    if (k==null){
        Node head=new Node(val);
        return head;

        
    }
    if (k.next==null)
    {
        Node current=new Node(val);
        head.next=current;
        head=current;
    }
    return head;


}

    
Node buildList(int n) {
   
    if (n <= 0) {
        return null;
    }

   
    Node current = new Node(n);

    
    Node head = buildList(n - 1);

   
    if (head == null) {
        return current;
    }

    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }
    temp.next = current;

    return head;
}
Node reverse(Node head,Node prev,Node current)
{
if (head==null)return prev;
current =head;
head=head.next;
current.next=prev;
prev=current;

return reverse(head,prev,current);
}
Node first(Node head,Node add)
{
add.next=head;
return add;
}
void last(Node head,Node l)
{
    if (head.next==null)
    {
        head.next=l;return ;
    }
    last(head.next,l);
}
void addval(Node prev,Node head,Node add,int pos,int target )
{
    if (pos==target)
    {
       prev.next=add;
       add.next=head;
       return ;

       }
       addval(head,head.next,add,pos+1,target);

    
}
void del(Node prev,Node head,int pos,int target)
{ if (head==null)
{
    return ;
}
    if (pos==target)
    {
       prev.next=head.next;
       return ;
    }
    del(head,head.next,pos+1,target);
}
Node delall(Node prev, Node head, int target) {
    if (head == null) {
        return null;
    }

    if (head.val == target) {
        
        if (prev == null) {
            return delall(null, head.next, target);
        }
        
        prev.next = head.next;
        return delall(prev, head.next, target);
    }

    
    delall(head, head.next, target);
    return head;
}
Node findmid(Node slow,Node fast)
{
    if (fast.next==null )return slow;
    return findmid(slow.next,fast.next.next);
}


void addall(Node head,int val)
{
    
    if (head==null)return ;
    head.val+=val;
    addall(head.next,val);
}
Node findmax(Node head,Node max)
{
    if (head==null)return max;
    if (head.val>max.val) max.val=head.val;
   return findmax(head.next,max);

}
int count(Node head,int c)
{
    if (head==null) return c;
    if (head.val%3==0)c++;
    return count(head.next,c);
}
int index(Node head,Node max,int pos,int ind)
{
    if (head==null)return ind;
    if (head.val>max.val) 
        {max.val=head.val;
            ind=pos;
        }
   return index(head.next,max,pos+1,ind);

}
int countnode(Node head,int count)
{
    if (head==null)return count;
    return countnode(head.next,count+1);
}
int search (Node head,int pos,int target )
{ if (head==null)return -1;
    if (head.val==target) return pos;
    return search(head.next,pos+1,target);
    
}

    
    void display() 
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}

