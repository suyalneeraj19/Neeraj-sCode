class MyCircularDeque {
    int k, size;
    Node first,last;
    
    public MyCircularDeque(int k) {
        this.k     = k;
        this.size  = 0;
        this.first = new Node(-1,null,null);
        this.last  = new Node(-1,null,null);
        this.first.next = last;
        this.last.prev  = first;
    }
    
    public boolean insertFront(int v) {
        if (isFull()) return false;
        first.next = new Node(v,first,first.next);
        first.next.next.prev=first.next;
        size++;
        return true;
    }
    
    public boolean insertLast(int v) {
        if (isFull()) return false;
        last.prev = new Node(v,last.prev,last);
        last.prev.prev.next = last.prev;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if (isEmpty()) return false;
        first.next=first.next.next;
        first.next.prev=first;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if (isEmpty()) return false;
        last.prev=last.prev.prev;
        last.prev.next=last;
        size--;
        return true;
    }
    
    public int getFront() {
        return first.next.val;
    }
    
    public int getRear() {
        return last.prev.val;
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==k;
    }
    
    static class Node{
        int val;
        Node prev,next; 
        public Node(int val,Node prev, Node next){
            this.val=val;
            this.prev=prev;
            this.next=next;
        }
    }
}   