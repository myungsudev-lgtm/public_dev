package com.exam.programmers.solution;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//정수 배열 numbers가 매개변수로 주어집니다.
// numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
@Component
public class Q_120809 {
        public List<Integer> solution(int[] numbers) {
            List<Integer> numberList = new ArrayList<>();
            for (int i = 0; i < numbers.length; i++) {
                numberList.add(numbers[i]*2);
            }
            return numberList;
        }
}
