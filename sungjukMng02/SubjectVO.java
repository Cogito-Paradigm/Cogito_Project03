package sungjukMng02;

import java.util.Scanner;

public class SubjectVO {
	int kor;
	int mat;
	int eng;
	
	//생성자로 과목 점수 입력
	public SubjectVO(){
		Scanner sc = new Scanner(System.in);
		
		//국어점수 
		System.out.println("국어점수를 입력");
		setKor(sc.nextInt());
		
		//수학점수
		System.out.println("수학점수를 입력");
		setMat(sc.nextInt());
		
		//영어점수
		System.out.println("영어점수를 입력");
		setEng(sc.nextInt());
	}
	
	//toString 오버라이딩
	public String toString(){
		return getKor()+", "+getMat()+", "+getEng();
	}
	
	//setter와 getter
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
}

