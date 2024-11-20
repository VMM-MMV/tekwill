public class LinkedList {
    // Capul de listă
    Node head;
    Node tail;
    private int length;

    [1,2,3,4,5,6,7,8] -> [8,7,6,5,4,3,2,1]

    // Doubly Linked list Node
    class Node {
        int data;
        Node prev;
        Node next;

        // Constructor de creare a unui node nou
        // next și prev sunt implicit null
        Node(int d) { data = d; }
    }

    public void push(int new_data) {
        /* 1. Alocăm un nod
         * 2. Adăugăm date */
        Node new_Node = new Node(new_data);

        /* 3. Facem următorul nod ca head și anterior ca NULL     */
        new_Node.next = head;
        new_Node.prev = null;

        /* 4. Schimbăm nodul prev principal în nodul nou */
        if (head != null)
            head.prev = new_Node;

        /* 5. mutăm capul pentru a indica noul nod */
        head = new_Node;
        length++;
    }

    void append(int new_data) {
        /* 1. Alocăm un nod
         * 2. Adăugăm date */
        Node new_node = new Node(new_data);

        Node last = tail;

        /* 3. Noul node va deveni ultimul, iar
         * următorul va deveni NULL*/
        new_node.next = null;

        /* 4. Dacă lista este goală, atunci facem noul node ca head */
        if (head == null) {
            new_node.prev = null;
            head = new_node;
        } else {
            /* 6. Scimbăm next al ultimului node*/
            last.next = new_node;

            /* 7. Facem ultimul node ca previous */
            new_node.prev = last;

        }
        tail = new_node;
        length++;
    }

    public void insertAfter(Node targetNode, int new_data) {

        /*1. verificați dacă prev_node dat este NULL */
        if (targetNode == null) {
            System.out.println(
                    "The given previous node cannot be NULL ");
            return;
        }

        /* 2. aloca un nod
         * 3. introduceți datele */
        Node new_node = new Node(new_data);

        /* 4. Faceți next of new node ca next of prev_node */
        new_node.next = targetNode.next;

        /* 5. Faceți următorul din prev_node ca new_node */
        targetNode.next = new_node;

        /* 6. Faceți prev_node ca anterior pentru new_node */
        new_node.prev = targetNode;

        /* 7. Schimbați anteriorul nodului următor al new_node */
        if (new_node.next != null)
            new_node.next.prev = new_node;
    }

    public int getLength() {
        return length;
    }
}
