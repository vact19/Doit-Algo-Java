package doitjava.chap04;


public class IntStack2 {
    private int[] stack;
    private int capacity; // max capacity
    private int ptr; // 다음 push될 인덱스를 가리키고 있게 됨.

    public IntStack2(int capacity) {
        ptr = 0;
        try {
            this.capacity = capacity;
            stack = new int[capacity];
        } catch (OutOfMemoryError e){
            capacity = 0;
            System.err.println(e.getClass().getSimpleName());
        }
    }

    public int push(int x){
        if (ptr >= capacity)
            throw new RuntimeException("스택꽉참");
        return stack[ptr++] = x;
    }
    public int pop(){
        if (ptr <= 0)
            throw new RuntimeException("pop할게 없음");
        return stack[--ptr];
    }
    public int peek(){
        if (ptr <= 0)
            throw new RuntimeException("peek할게 없음");
        return stack[ptr - 1];
    }
    public int indexOf(int x){
        for (int i = ptr - 1; i >=0; i-=1){
            if (stack[i] == x)
                return i;
        }
        return -1;
    }
    public void clear(){
        ptr = 0;
    }
    public boolean isFull(){
        return ptr >= capacity;
    }
    public int size(){
        return capacity;
    }
    public int getCapacity(){
        return capacity;
    }



}
















