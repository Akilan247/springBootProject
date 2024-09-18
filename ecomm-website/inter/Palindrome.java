import java.util.ArrayList;

public class Palindrome {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public void insertFirst(int data){
        Node node = new Node(data);
        node.next = node;
    }
    public boolean isPalindrome(Node head){
        Node temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp!=null){
            list.add(temp.data);
            temp=temp.next;
        }
        temp=head;
        int n = list.size()-1;
        while(temp!=null){
            if(n>=0 && temp.data!=list.get(n)){
                return false;
            }
            n--;
        }
        return true;
    }
}
