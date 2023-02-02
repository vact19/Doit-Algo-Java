package doitjava.chap04;

public class IntQueue {
    private int[] queue; // 배열로 큐 구현
    private int front; // 다음번 deque 시, 내보내야 할 인덱스
    private int rear; // 다음번 enque 시, 큐에 등록될 인덱스

    // 원형 큐이므로 스택 예제와 달리,
    // 포인터값(여기서는 front, rear) 이 몇이든 Full일 수도 있고 Empty일 수도 있다.
    // 판단을 위해 정확한 현재 용량을 나타내는 num을 사용한다.
    private int num; // 현재 용량
    private int capacity; // 큐 용량

    public IntQueue(int capacity){
        num = front = rear = 0;
        this.capacity = capacity;
        try {
            queue = new int[capacity];
        } catch (OutOfMemoryError e){
            capacity = 0;
            System.err.println(e.getClass().getSimpleName());
        }
    }

    public int enque(int x){
        if (num >= capacity) // 현재 용량이 최대용량 이상이면
            throw new RuntimeException("으앙 큐 꽉참");
        queue[rear++] = x;
        num++; //
        if (rear == capacity) // 무한히 Enque하거나 Deque할 수 없게끔 위 조건문의 num이 막아준다.
            rear = 0; // cap이 12면, rear는 11 다음에 0부터 다시 시작해야 한다.
        return x;
    }

    public int deque(){
        if (num <= 0) // 현재용량이 num 이하라면
            throw new RuntimeException("으앙 큐 비었음");
        int x = queue[front++];
        num--;
        if (front == capacity)
            front = 0;
        return x;
    }

    public int peek(){
        if (num <= 0)
            throw new RuntimeException("보여줄 게 없어요");
        return queue[front];
    }

    public int indexOf(int x){
        for (int i = 0; i < num; i+=1){
            // capacity 10일 때, front 8부터 5칸 앞까지 찾으려면 8, 9, 0, 1, 2로 찾아야 한다. 그것을 위한 식.
            int idx = (i + front) % capacity;
            if (queue[idx] == x)
                return idx;
        }
        return -1;
    }

    public int search(int x){
        for (int i = 0; i < num; i+=1)
            if (queue[(i + front) % capacity] == x)
                return i + 1; // 인덱스 위치가 아니라, 앞에서 몇 번째인가를 반환함
        return 0; // 못 찾으면 -0
    }
    public boolean isEmpty(){
        return num <= 0;
    }
    public boolean isFull(){
        return num >= capacity;
    }

    public int getCapacity() {
        return capacity;
    }
    public int size(){
        return num;
    }

//    {
//         아래와 같이 오래된 데이터를 버리는(최신순으로 10개까지만 저장하는) 링 버퍼로 만들 수도 있다.
//        int max =10;
//        int x = 5;
//
//        queue[num % max] = x;
//    }
}



















