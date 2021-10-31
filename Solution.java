//Justin Butler
/*
26 / 26 test cases passed.
Status: Accepted
Runtime: 0 ms
Memory Usage: 38.2 MB
Runtime beats 100%. 
*/
// 10/31/2021 Happy Halloween!

class Solution {
    boolean first = true; // is true ONLY for the first element of the list
    Node root; // Holds the head node of the newly constructed doubly linked list
    Node current; // Holds the current node of the newly constructed doubly linked list
    public Node flatten(Node head) {
        if(head == null){return root;}
        else
        {
            if(first) // Construct our doubly linked list
            {
                first = !first;
                root = new Node(head.val);
                current = root;
            }
            else // Map all values to the newly constructed list.
            {
                Node temp = current; // temp value to hold our prev element
                current.next = new Node(head.val);
                current = current.next;
                current.prev = temp;
            }
        } 
        if(head.child != null) // iterate over child nodes.
        {
            flatten(head.child);
        }
        if(head.next !=null){flatten(head.next);} // iterate next
        return root;
    }
}
