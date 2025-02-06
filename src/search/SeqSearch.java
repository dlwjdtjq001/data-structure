package search;

import java.util.Scanner;

public class SeqSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("몇개의 데이터를 입력하시겠습니까? ex)7");
        int number = sc.nextInt();
        int[] array = new int[number + 1]; // 배열의 길이 셋팅하여 배열 객체생성

        for(int i = 0; i < array.length-1; i++){
            System.out.println("array[" + i + "] : ");
            array[i] = sc.nextInt();
        }

        System.out.println("검색할 값은?");
        int key = sc.nextInt();
        int idx = seqSearch(array,number,key);
//        System.out.println(idx);
        if(idx == -1) System.out.println("데이터가 존재하지 않습니다.");
        else System.out.println("그 값은 array[" + idx + "] 에 존재합니다.");
    }

    static int seqSearch(int[] array, int number, int key){
        int i = 0;
        array[number] = key;
        while(true){
//            if(i == number) return - 1; // 검색 실패(-1 을 반환)
//            if(array[i] == key) return 1; // 검색 성공 (자료가 있는 인덱스 반환)
//            i++;
            if(array[i] == key) break;//검색 성공
            i++;
        }
        return i == number ? -1 : i;
    }
}
