package java_programmess.DSA_java;

public class singly_linked_list {
    private ListNode head;
    private class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(){
        ListNode current =head;
        while(current!=null){
            System.out.print(current.data+" --> ");
            current=current.next;
        }
        System.out.println("null");
    }
    public int length(){
        if(head==null){
            return 0;
        }
        int count=0;
        ListNode current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    public void insertfirst(int value){
        ListNode newNode =new ListNode(value);
        newNode.next=head;
        head=newNode;
    }
    public void insertlast(int value){
        ListNode newNode =new ListNode(value);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode current=head;
        while(null!=current.next){
            current=current.next;
        }
        current.next=newNode;
    }
    public void insert(int position,int value){
        ListNode node=new ListNode(value);
        if(position==1){
            node.next=head;
            head=node;
        }else{
            ListNode previous=head;
            int count=1;
            while(count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            node.next=current;
            previous.next=node; 
            node.next=current;
        }

    }
    public ListNode deletefirst(){
        if(head==null){
            return null;
        }
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        return temp;
    }
    public ListNode deletelast(){
        if(head==null || head.next==null){
            return head;
        }
        ListNode current=head;
        ListNode previous=null;
        while(current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;
    }
    public void delete(int position){
        //position is valid and starting from 1
        //3-->4-->7-->8-->9-->null
        if(position==1){
            head=head.next;
        }else{
            ListNode previous=head;
            int count=1;
            while(count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            previous.next=current.next;
        }
    }
    public ListNode getNthnodefromend(int n){
        if(head==null){
            return null;
        }
        if(n<=0){
            throw new IllegalArgumentException("invalid value : n = "+n);
        }
        ListNode mainptr=head;
        ListNode refptr=head;
        int count=0;
        while(count<n){
            if(refptr==null){
                throw new IllegalArgumentException(n+"is greater then the no of nodes in list");
            }
            refptr=refptr.next;
            count++;
        }
        while(refptr!=null){
            refptr=refptr.next;
            mainptr=mainptr.next;
        }
        return mainptr;
    }
    public void removeduplicates(){
        if(head==null){
            return;
        }
        ListNode current=head;
        while(current!=null && current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
    }
    public ListNode insertinsortedlist(int value){
        ListNode newnode=new ListNode(value);
        if(head==null){
            return newnode;
        }
        ListNode current=head;
        ListNode temp= null;
        while(current!=null && current.data<newnode.data){
            temp=current;
            current=current.next;
        }
        newnode.next=current;
        temp.next=newnode;
        return head;
    }
    public void deletenode(int key){
        ListNode current=head;
        ListNode temp=null;
        if(current!=null && current.data==key){
            head=current.next;
            return;
        }
        while(current!=null && current.data!=key){
            temp=current;
            current=current.next;
        }
        if(current==null) return;
        temp.next=current.next;
    }
    public boolean containsloops(){
        ListNode fastptr=head;
        ListNode slowptr=head;
        while(fastptr!=null && fastptr.next !=null){
            fastptr=fastptr.next.next;
            slowptr=slowptr.next;
            if(slowptr==fastptr){
                return true;
            }
        }
        return false;
    }
    public void createAloopinlinkedlist(){
        ListNode first=new ListNode(1);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(3);
        ListNode fourth=new ListNode(4);
        ListNode fifth=new ListNode(5);
        ListNode sixth=new ListNode(6);
        head=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=third;
    }
    public static void main(String[] args) {
        singly_linked_list sll=new singly_linked_list();
/*         ListNode head=new ListNode(10);
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(13);
        ListNode fourth=new ListNode(11); */
        //now we will connect all to form a chain
/*         head.next=second;//10-->1
        second.next=third;//10-->1-->13
        third.next=fourth;//10-->1-->13-->11-->null  */ 
/*         sll.insertlast(12);
        sll.insertlast(13);
        sll.insertlast(14);
        sll.display();
        System.out.println("the length of linked list is - "+sll.length()); */
        /* sll.insert(1, 12);
        sll.insert(2, 14);
        sll.insert(1,13);
        sll.display();
        ListNode sgl=sll.getNthnodefromend(2);//from here you can change the value
        System.out.println("nth node from end is --"+sgl.data); */
/*         sll.insertfirst(16);
        sll.insertfirst(10);
        sll.insertfirst(8);
        sll.insertfirst(1);
        sll.display();
        sll.deletenode(10);
        sll.display(); */
        sll.createAloopinlinkedlist();
        System.out.println(sll.containsloops());



    }
    
}
