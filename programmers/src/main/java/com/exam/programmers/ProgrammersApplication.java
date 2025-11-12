package com.exam.programmers;

import com.exam.programmers.solution.Q_120809;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProgrammersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgrammersApplication.class, args);

		Q_120809 q120809 = new Q_120809();
		int[] arr= new int[]{1,2,3,4,5};
		q120809.solution(arr);
	}

}
