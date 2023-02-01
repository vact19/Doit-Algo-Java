package doitjava.chap04;

public class IntStack {
    private int[] stack;
    private int capacity;
    private int ptr; // 스택 포인터, 다음에 push될 index를 가리킨다.

    /** 생성자 */
    public IntStack(int capacity){
        ptr = 0;
        this.capacity = capacity;
        try {
            stack = new int[capacity];
        } catch (OutOfMemoryError e){
            capacity = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException{
        if (ptr >= capacity) // 스택이 꽉 찼다면
            throw new OverflowIntStackException("스택 터진다 터져");
        return stack[ptr++] = x;
    }

    public int pop() throws EmptyIntStackException{
        if (ptr <= 0)
            throw new EmptyIntStackException("스택 비어있다");
        return stack[--ptr]; // ptr은 다음에 push될 인덱스를 가리킨다. ptr--이 아닌 --ptr을 해야 꼭대기 값 반환 가능.
    }

    public int peek() throws EmptyIntStackException{
        if (ptr <= 0)
            throw new EmptyIntStackException("스택 비어있다");
        return stack[ptr - 1];
    }

    // 찾은 값의 인덱스 반환
    public int indexOf(int x){
        for (int i = ptr - 1; i >= 0; i-=1){
            if (stack[i] == x)
                return i;
        }
        return -1;
    }

    public void clear(){
        ptr = 0;
    }
    public int getCapacity(){
        return capacity;
    }
    public int size(){
        return ptr;
    }
    public boolean isEmpty(){
        return ptr <= 0; // ptr이 0이하인지
    }
    public boolean isFull(){
        return ptr >= capacity;
    }
    public void dump(){
        if (ptr <= 0)
            System.out.println("스택 비어있다.");
        else {
            for (int i = 0; i < ptr; i+=1){
                System.out.print(stack[i] + " ");
                System.out.println();
            }
        }
    }




    static class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException(String message){
            super(message);
        }
    }

    static class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException(String message){
            super(message);
        }
    }
}
