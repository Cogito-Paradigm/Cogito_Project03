package sungjukMng01;

public class SubjectVO {
	int math;
	int kor;
	int eng;
	
	//생성자
	public SubjectVO(){
	}
	public SubjectVO(int kor, int math, int eng){
		this.math = math;
		this.kor = kor;
		this.eng = eng;
	}
	
	//setter, getter
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public String toString(){
		return ""+this.math;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
}
