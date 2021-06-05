class node {
    public int value;
    public node next;
    node(int value, node next){
        this.value=value;
        this.next=next;
    }
}
public class DSD_create1 {
    public static void main(String[] args) {
        node head=null;
        for (int i=9; i>=0; i--) {
            head=new node(i,head);
        }

        node ref=head;
        while (ref!=null){
            System.out.println(" "+ref.value);
            ref=ref.next;

        }
    }
}