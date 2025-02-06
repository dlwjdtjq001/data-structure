package queue;

import java.util.Scanner;

public class IntArrayQueueTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        IntArrayQueue queue = new IntArrayQueue(64);
        int x;

        while(true){
            System.out.println("현제 데이터 개수 : " + queue.size() + "/" + queue.capacity());
            System.out.println("(1)인큐 (2)디큐 (3)피크 (4)덤프 (5) 종료 숫자로 선택하세요");
            int menu = in.nextInt();
            if(menu == 0) break;
            switch (menu){
                case 1 :
                    System.out.println("숫자 데이터를 입력하세요");
                    x = in.nextInt();
                    try {
                        queue.enque(x);
                    } catch (IntArrayQueue.OverflowIntArrayQueueException e) {
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;
                case 2 :
                    try {
                        x = queue.deque();
                    } catch (IntArrayQueue.EmptyIntArrayQueueException e) {
                        System.out.println("큐가 비어있습니다.");
                    }
                    break;
                case 3:
                    try {
                        x = queue.peak();
                        System.out.println("피크데이터는 " + x);
                    } catch (IntArrayQueue.EmptyIntArrayQueueException e) {
                        System.out.println("큐가 비어있습니다.");
                    }
                case 4:
                    queue.dump();
                    break;
            }
        }
    }
}
