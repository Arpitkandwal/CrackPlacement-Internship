import java.util.ArrayList;
import java.util.List;
class Node
{
    int data;
    Node next,prev;
    
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}
public class BalancedBinaryTree {
    
    public static void main(String[] args) {
        
    }

    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        Node current = head;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if(head == null) {
            return result;
        }

        Node next = current.next;
        while(current != null) {
            if(current.data + next.data == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(current.data);
                pair.add(next.data);
                result.add(pair);
            }
            else {
                next = next.next;
            }
            current = current.next;
        }

        return result;
    }
}
