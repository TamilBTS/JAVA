class node{
    int data;
    node next=null;
}
public class LinkedList {
    node head;          //reference variable for class node
    void get(int a){              //a=10    again a=20   again a=30
        node n=new node();    //new node created
        n.data=a;            //assigning our value to data     first node(10)    second node(20)  third node(30)
        if(head==null){      //at first head node is empty
            head=n;         //head node=first node=10
            return;         //exits from the function...  now head node is not empty
        }
        node a1=head;       //pointing reference variable head to another reference variable
        while(a1.next!=null){    //second node ku false  third node ku true
            a1=a1.next;         //second node address aa point panum
        }
        a1.next=n;  //new node address will be stored in a1(head)'s next   a1(2nd node) ithula 3rd node address store aagum
    }
    void dis(){
        node p=head;
        while(p!=null){
            System.out.println(p.data);
            p=p.next;
        }
    }
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.get(10);
        l.get(20);
        l.get(30);
        l.get(40);
        l.get(50);
        l.dis();
    }
}
