//package com.exam.programmers.solution;
//
////최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
//// 정수 배열 array가 매개변수로 주어질 때,
//// 최빈값을 return 하도록 solution 함수를 완성해보세요.
//// 최빈값이 여러 개면 -1을 return 합니다.
//
//import java.util.Arrays;
//
//public class Q_120812 {
//
//    public int solution(int[] array) {
//
//        int cnt[] = new int[1000];
//        //i idx에 있는 값 중 같은 수들을 비교
//        for (int i = 0; i < array.length; i++) {
//            cnt[array[i]]++;
//        }
//        //[0,0,0,0,0,0,0,0,0, ...]
//        //[0,1,3,0,0,2,...]
//        int mode = Arrays.stream(cnt).max().getAsInt();
//
//        if(Arrays.stream(cnt).count() > 2 ){
//            return  -1;
//        }
//
//
//    }
//}
