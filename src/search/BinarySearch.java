package search;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("몇개의 데이터를 입력하시겠습니까? ex)7");
        int number = sc.nextInt();
        int[] array = new int[number];

        System.out.println("오름차순으로 입력하세요!!");
        System.out.println("array[0] :"); //첫 요소값 입력
        array[0] = sc.nextInt();

        for(int i = 1; i < number; i++){
            do{
                System.out.println("array[" + i + "] :");
                array[i] = sc.nextInt();
            }while(array[i] < array[i-1]); // 오름차순으로 배열에 입력값을 저장하겠다.
        }

        System.out.println("검색할 값은?");
        int key = sc.nextInt();
        int idx = binSearch(array,number,key);
//        System.out.println(idx);
        if(idx == -1) System.out.println("데이터가 존재하지 않습니다.");
        else System.out.println("그 값은 array[" + idx + "] 에 존재합니다.");

//        for(int data : array) System.out.print(data + " ")
    }


    static int binSearch(int[] array, int number, int key){
        int pl = 0; // 검색 범위의 첫 인덱스
        int pr = number-1; // 검색 범위의 마지막 인덱스

        do{
            int pc = (pl + pr)/2; //중앙 요소 인덱스
            if(array[pc] == key) return pc;
            else if(array[pc] < key) pl = pc + 1; // 검색범위를 뒤쪽 절반으로 좁힌다.
            else pr = pc - 1; // 검색범위를 앞쪽 절반으로 좁힌다.
        } while(pl <= pr);
        return -1;
    }
}
