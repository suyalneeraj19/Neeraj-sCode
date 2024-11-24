class MyCircularQueue {

    int [] que;

    int f = 0, r = -1, len = 0;

    public MyCircularQueue(int k) {
        que = new int[k];
    }
    
    public boolean enQueue(int value) {
        if(!isFull()){
            r = (r + 1) % que.length;
            que[r] = value;
            len++;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(!isEmpty()){
            f = (f + 1) % que.length;
            len--;
            return true;
        }
        return false;
    }
    
    public int Front() {
        return isEmpty() ? -1 : que[f];
    }
    
    public int Rear() {
        return isEmpty() ? -1 : que[r];
    }
    
    public boolean isEmpty() {
        return len == 0;
    }
    
    public boolean isFull() {
        return len == que.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */