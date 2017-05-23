package sungjukMng01;


import java.util.ArrayList;
import java.util.List;

public class Main {
	/**프로필과 성적관리
	 * HumanVO 에는 학생들의 인적사항을
	 * SubjectVO 에는 과목의 점수를 각각 저장
	 * 학생 인적사항과, 과목의 점수가 동일한 순서대로 리스트화 되어있다는 가정 하에
	 * 두 리스트를 비교하여 순서대로 출력
	 */
	public static void main(String[] args){
		List<HumanVO> ls = new ArrayList<HumanVO>();
		List<SubjectVO> ms = new ArrayList<SubjectVO>();
		
		//학생 프로필(인적사항) 입력
		HumanVO friend1 = new HumanVO("홍길동",21,"1");
		HumanVO friend2 = new HumanVO("김희선",21,"2");
		HumanVO friend3 = new HumanVO("미나",21,"2");
		
		//리스트에 프로필 입력
		ls.add(friend1);
		ls.add(friend2);
		ls.add(friend3);
		
		//프로필리스트 출력
		PrintPro(ls);
		
		//과목점수입력(국어, 수학, 영어)
		SubjectVO math1 = new SubjectVO(45, 80, 90);
		SubjectVO math2 = new SubjectVO(60, 70, 50);
		SubjectVO math3 = new SubjectVO(30, 40, 80);
		
		//리스트에 수학점수 입력
		ms.add(math1);
		ms.add(math2);
		ms.add(math3);
		
		//수학점수리스트 출력
		PrintSco(ms);
		
		//프로필과 수학점수 리스트 합친 후 출력
		SumList(ls, ms);

		//수학점수 평균함수
		Avg(ms);
		
		//수학과목 최고점수
		Best(ls,ms);
		
	}
	
	//함수들
	//리스트출력
	public static void PrintPro(List<HumanVO> ls){
		System.out.println("입력된 프로필");
		for(HumanVO t : ls){
			System.out.println("이름:"+t.getName()+", 나이:"+t.getAge()+", 성별:"+t.getSex());
		}
	}
	//수학점수출력
	public static void PrintSco(List<SubjectVO> ms){
		System.out.println("입력된 점수");
		for(SubjectVO t : ms){
			System.out.println("국어점수:"+t.getKor()+", 수학점수:"+t.getMath()+", 영어점수:"+t.getEng());
		}
	}
	
	//리스트 합치기
	public static void SumList(List<HumanVO> ls, List<SubjectVO> ms){
		System.out.println("학생이름과 수학점수");
		for(HumanVO a : ls){
			for(SubjectVO b : ms){
				if(ms.indexOf(b)==ls.indexOf(a)){
					System.out.println(a.getName()+"의 수학점수는 "+b.getMath());
				}else{
				}
			}
		}
	}
	
	//평균
	public static void Avg(List<SubjectVO> ms){
		int sum = 0;
		for(SubjectVO t : ms){
			sum = sum + t.getMath();
		}
		System.out.println("수학점수의 평균은 : "+(sum/ms.size()));
	}
	
	//최고점수
	public static void Best(List<HumanVO> ls, List<SubjectVO> ms){
		int best=0;
		String name=null;
		for(SubjectVO a : ms){
			if(best<=a.getMath()){
				best = a.getMath();
				for(HumanVO b : ls){
					if(ls.indexOf(b)==ms.indexOf(a)){
						name = b.getName();
					}else{
					}
				}
			}else{
			}
		}
		System.out.println("수학점수 1등은 "+name+"이고 점수는 "+best+"입니다.");
	}
}
