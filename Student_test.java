package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_test {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("--------------------------------------------");
			System.out.println("1.�����Է� 2.���� ������ȸ 3.���� ������ȸ 4.����");
			System.out.println("--------------------------------------------");
			int choice = sc.nextInt();
			Student student = new Student();
			if (choice == 1) { //���� �Է�
				System.out.println("�̸� : ");
				student.setName(sc.next());
				System.out.println("���� :");
				student.setKor(sc.nextInt());
				System.out.println("���� : ");
				student.setEng(sc.nextInt());
				System.out.println("���� : ");
				student.setMath(sc.nextInt());
				// ArrayList�� �л� �Է°� �ֱ� 
				students.add(student);
			}
			else if(choice == 2) {
				// ���� ������ȸ
				System.out.print("�л� ����Ʈ : ");
				for(int i=0; i<students.size(); i++) {
					System.out.print((i)+": "+students.get(i).getName()+", ");
				}
				System.out.println();
				System.out.println("���� �� ? > ");
				int pick = sc.nextInt();
				
				System.out.println("--------------------------------------------");
				System.out.println("�̸�\t����\t����\t����\t����\t���");
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
				// ���� ���� ��ȸ
				System.out.println("--------------------------------------------");
				System.out.println("� ���� ������ ��ȸ �ϰ� �ͳ���? ");
				System.out.println("1. ����  2.����  3. ����");
				int subject = sc.nextInt();
				if(subject == 1) { //����
					int ifsum = 0;
					for(int i=0; i<students.size(); i++) {
						ifsum += students.get(i).getKor();
						System.out.println(students.get(i).getName() + ": " + students.get(i).getKor());
					}
					float ifavg = ifsum/students.size();
					System.out.printf("������ ����� : %.2f", ifavg);
					System.out.println();
				}
				else if(subject == 2) {
					int ifsum = 0;
					for(int i=0; i<students.size(); i++) {
						ifsum += students.get(i).getEng();
						System.out.println(students.get(i).getName() + ": " + students.get(i).getEng());
					}
					float ifavg = ifsum/students.size();
					System.out.printf("������ ����� : %.2f", ifavg);
					System.out.println();
				}
				else if(subject == 3) {
					int ifsum = 0;
					for(int i=0; i<students.size(); i++) {
						ifsum += students.get(i).getMath();
						System.out.println(students.get(i).getName() + ": " + students.get(i).getMath());
					}
					float ifavg = ifsum/students.size();
					System.out.printf("������ ����� : %.2f", ifavg);
					System.out.println();
				}
			}
			else if(choice == 4) {
				System.out.println("�����մϴ�.");
				break;
			}
			else {
				System.out.println("�ٽ� �Է����ּ���");
			}
		}
	}

}
