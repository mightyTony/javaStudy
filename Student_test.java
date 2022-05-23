package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_test {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("--------------------------------------------");
			System.out.println("1.성적입력 2.개인 성적조회 3.과목 성적조회 4.종료");
			System.out.println("--------------------------------------------");
			int choice = sc.nextInt();
			Student student = new Student();
			if (choice == 1) { //성적 입력
				System.out.println("이름 : ");
				student.setName(sc.next());
				System.out.println("국어 :");
				student.setKor(sc.nextInt());
				System.out.println("영어 : ");
				student.setEng(sc.nextInt());
				System.out.println("수학 : ");
				student.setMath(sc.nextInt());
				// ArrayList에 학생 입력값 넣기 
				students.add(student);
			}
			else if(choice == 2) {
				// 개인 성적조회
				System.out.print("학생 리스트 : ");
				for(int i=0; i<students.size(); i++) {
					System.out.print((i)+": "+students.get(i).getName()+", ");
				}
				System.out.println();
				System.out.println("누구 꺼 ? > ");
				int pick = sc.nextInt();
				
				System.out.println("--------------------------------------------");
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println("--------------------------------------------");
				System.out.print(students.get(pick).getName()+"\t");
				System.out.print(students.get(pick).getKor()+"\t");
				System.out.print(students.get(pick).getEng()+"\t");
				System.out.print(students.get(pick).getMath()+"\t");
				System.out.print(students.get(pick).getSum()+"\t");
				System.out.printf("%.2f \t",students.get(pick).getAvg());
				System.out.println();
			}
			else if(choice ==3) {
				// 과목별 성적 조회
				System.out.println("--------------------------------------------");
				System.out.println("어떤 과목 성적을 조회 하고 싶나요? ");
				System.out.println("1. 국어  2.영어  3. 수학");
				int subject = sc.nextInt();
				if(subject == 1) { //국어
					int ifsum = 0;
					for(int i=0; i<students.size(); i++) {
						ifsum += students.get(i).getKor();
						System.out.println(students.get(i).getName() + ": " + students.get(i).getKor());
					}
					float ifavg = ifsum/students.size();
					System.out.printf("국어의 평균은 : %.2f", ifavg);
					System.out.println();
				}
				else if(subject == 2) {
					int ifsum = 0;
					for(int i=0; i<students.size(); i++) {
						ifsum += students.get(i).getEng();
						System.out.println(students.get(i).getName() + ": " + students.get(i).getEng());
					}
					float ifavg = ifsum/students.size();
					System.out.printf("영어의 평균은 : %.2f", ifavg);
					System.out.println();
				}
				else if(subject == 3) {
					int ifsum = 0;
					for(int i=0; i<students.size(); i++) {
						ifsum += students.get(i).getMath();
						System.out.println(students.get(i).getName() + ": " + students.get(i).getMath());
					}
					float ifavg = ifsum/students.size();
					System.out.printf("수학의 평균은 : %.2f", ifavg);
					System.out.println();
				}
			}
			else if(choice == 4) {
				System.out.println("종료합니다.");
				break;
			}
			else {
				System.out.println("다시 입력해주세요");
			}
		}
	}

}
