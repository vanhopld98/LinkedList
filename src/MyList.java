public class MyList {
    private Node head;

    public MyList(int value) {
        this.head = new Node(value);
    }

    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void addFirst(int value){
        Node temp = head;
        Node nodeX = new Node(value);
        head = nodeX;
        nodeX.next = temp;
    }

    public void add(int value,int index){
        Node temp = head;
        Node nodeX = new Node(value);
        for (int i = 0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        Node nodeTemp = temp.next;
        temp.next = nodeX;
        nodeX.next = nodeTemp;
    }

}
