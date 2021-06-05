class Node{
    public int value;
    public node next;
    Node(int value, node next){
        this.value=value;
        this.next=next;
    }
}
public class DSD_create2 {
    public static void main(String[]args){
        node head=new node(0,null);
        node tail=head;
        for(int i=0; i<9; i++){
            tail.next=new node(i+1, null);
            tail=tail.next;
        }
        node ref=head;
        while (ref!=null){
            System.out.println(" "+ref.value);
            ref=ref.next;
        }
    }
}