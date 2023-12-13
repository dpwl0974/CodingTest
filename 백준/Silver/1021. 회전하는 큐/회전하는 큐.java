import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> deque = new LinkedList<Integer>();

        int count = 0;

        int N = sc.nextInt(); //큐 크기
        int M = sc.nextInt(); //뽑을 개수

        for(int i = 1; i <= N; i++) {
            deque.add(i);
        }

        int[] num = new int[M];

        for(int i = 0; i < M; i++) {
            num[i] = sc.nextInt(); //뽑을 수 
        }

        for(int i = 0; i < M; i++) {

            int idx = deque.indexOf(num[i]);
            int half_idx;

            if(deque.size() % 2 ==0) {
                half_idx = deque.size() / 2 - 1;
            }
            else {
                half_idx = deque.size() / 2;
            }


            if(idx <= half_idx) {   //덱 왼쪽 이동
                for(int j = 0; j < idx; j++) {
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    count++;
                }
            }
            else{  // 덱 오른쪽 이동
                for(int j = 0; j < deque.size() - idx; j++) {
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    count++;
                }
            }
            deque.pollFirst(); //이동 후 삭제
        }

        System.out.println(count);

    }
}
