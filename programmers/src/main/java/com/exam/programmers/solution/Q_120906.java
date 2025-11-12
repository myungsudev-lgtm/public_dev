package com.exam.programmers.solution;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

//정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
@Component
public class Q_120906 {

    public int solution(int n) {
        int sum = 0;
        while (n>0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
}
