package java_programmess.DSA_java;

public class singly_linked1_list {
    private static  ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(ListNode head){
        ListNode current =head;
        while(current!=null){
            System.out.print(current.data+" --> ");
            current=current.next;
        }
        System.out.println(current);
    }
    public boolean find(ListNode head,int SearchKey){
        if(head==null){
            return false;
        }
        ListNode current=head;
        while(current!=null){
            if(current.data==SearchKey){
                return true;
            }
            current=current.next;
        }
        return false;
    }
    public ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }
        ListNode current=head;
        ListNode previous=null;
        ListNode next=null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
    public ListNode getmiddlenode(){
        if(head==null){
            return null;
        }
        ListNode slowptr=head;
        ListNode fastptr=head;
        while(fastptr!=null && fastptr.next!=null){
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
        return slowptr;
    }
    public static void main(String[] args) {
        ListNode first=new ListNode(10);
        ListNode second=new ListNode(8);
        ListNode third=new ListNode(1);
        ListNode fourth=new ListNode(13);
        ListNode fifth=new ListNode(23);
        head=first;
        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        singly_linked1_list sll=new singly_linked1_list();
        sll.display(head);
        ListNode sgl=sll.getmiddlenode();
        System.out.println("middle node is --"+sgl.data);
        //sll.display(sgl);



/*         if(sll.find(head, 1)){// 1St part(find)
            System.out.println("search key is found!!!");
        }else{
            System.out.println("search key not found!!!");
        } */

        
    }
    
}
