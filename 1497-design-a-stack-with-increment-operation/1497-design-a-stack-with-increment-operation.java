class CustomStack {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    // Default constructor
    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    // Parameterized constructor
    public CustomStack(int maxSize) {
        this.data = new int[maxSize];
    }

    // Push method to add an element to the stack
    public void push(int x) {
        if (ptr == data.length - 1) {
            System.out.println("Stack Overflow");
            return; // Stack is full
        }
        ptr++;
        data[ptr] = x;
    }

    // Pop method to remove and return the top element
    public int pop() {
        if (ptr == -1) {
            System.out.println("Stack Underflow");
            return -1; // Stack is empty
        }
        return data[ptr--];
    }

    // Increment the bottom k elements by val
    public void increment(int k, int val) {
        // Only increment up to the minimum of k or the actual number of elements in the stack
        for (int i = 0; i < Math.min(k, ptr + 1); i++) {
            data[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k, val);
 */
