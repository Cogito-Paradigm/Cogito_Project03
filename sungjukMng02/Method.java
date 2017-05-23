package sungjukMng02;

import java.util.List;
import java.util.Scanner;

public class Method {

	//프로필 입력함수
	public static void setPro(List<ProfileVO> ls){
		Scanner sc = new Scanner(System.in);
		System.out.println("프로필을 입력할 학생 수를 입력하세요.");
		int stu = sc.nextInt();
		for(int i=0; i<stu; i++){
			ProfileVO pro = new ProfileVO();
			System.out.println(pro.toString());
			ls.add(pro);
		}
	}
	
	//프로필 출력함수
	public static void disPro(List<ProfileVO> ls){
		for(ProfileVO t : ls)
		System.out.println("이름 : "+t.getName()+", 나이 : "+t.getAge()+", 성별 : "+t.getSex());
	}
	
	//과목점수 입력함수
	public static void setSub(List<SubjectVO> ls){
		Scanner sc = new Scanner(System.in);
		System.out.println("과목점수를 입력할 학생 수를 입력하세요.");
		int stu = sc.nextInt();
		for(int i=0; i<stu; i++){
			SubjectVO sub = new SubjectVO();
			System.out.println(sub.toString());
			ls.add(sub);
		}
	}
	
	//과목점수 출력함수
	public static void disSub(List<SubjectVO> ls){
		for(SubjectVO t : ls)
		System.out.println("국어점수 : "+t.getKor()+", 수학점수 : "+t.getMat()+", 영어점수 : "+t.getEng());
	}
	
	//리스트 합치기
	public static void sumList(List<ProfileVO> pro, List<SubjectVO> sub){
		for(ProfileVO a : pro){
			for(SubjectVO b : sub){
				if(sub.indexOf(b)==pro.indexOf(a)){
					System.out.println(a.getName()+"의 국어점수는 "+b.getKor()+"의 수학점수는 "+b.getMat()+"의 영어점수는 "+b.getEng());
				}else{
				}
			}
		}
	}
		
	//평균점수 구하기
	public static void avg(List<ProfileVO> pro, List<SubjectVO> sub){
		int kor = 0, mat = 0, eng =0;
		for(SubjectVO t : sub){
			kor = kor+t.getKor();
			mat = mat+t.getMat();
			eng = eng+t.getEng();
		}
		System.out.println("국어점수의 평균은 "+(kor/sub.size())+"입니다.");
		System.out.println("수학점수의 평균은 "+(mat/sub.size())+"입니다.");
		System.out.println("영어점수의 평균은 "+(eng/sub.size())+"입니다.");
	}
	
	//최고점수 구하기
	public static void bestScr(List<ProfileVO> pro, List<SubjectVO> sub){
		int kor = 0, mat = 0, eng = 0;
		String korName = null, matName= null, engName=null;
		
		for(ProfileVO a : pro){
			for(SubjectVO b : sub){
				if(sub.indexOf(b)==pro.indexOf(a)){
					if(kor<=b.getKor()){
						kor = b.getKor();
						korName = a.getName();
						System.out.println(korName+"국어들어와쪄염");
					}else{}
					
					if(mat<=b.getMat()){
						mat = b.getMat();
						matName = a.getName();
						System.out.println(matName+"수학들어와쪄염");
					}else{}
					
					if(eng<=b.getEng()){
						eng = b.getEng();
						engName = a.getName();
						System.out.println(engName+"영어들어와쪄염");
					}else{}
				}
			}
		}
		
		System.out.println(korName+"는 "+kor+"로 국어 1등입니다.");
		System.out.println(matName+"는 "+mat+"로 수학 1등입니다.");
		System.out.println(engName+"는 "+eng+"로 영어 1등입니다.");
	}
}
