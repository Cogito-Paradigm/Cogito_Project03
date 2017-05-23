package sungjukMng02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main{
	/**프로필과 성적관리
	 * sungjukMng(성적관리) 패키지를 기반으로 하여
	 * 사용자의 입력을 받아 해당하는 기능을 실행
	 * Method 클래스에 각 기능들을 static으로 구현하여 사용
	 */
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//리스트생성
		List<ProfileVO> proLs = new ArrayList<ProfileVO>();
		List<SubjectVO> subLs= new ArrayList<SubjectVO>();
		
		//while-switch로 프로그램 반복실행
		int num=0;
		while(num!=7){
			System.out.println("1.프로필 입력  2.과목점수 입력  3.프로필 출력  4.과목점수 출력  5.최고점수  6.평균점수 7.종료");
			
			num = sc.nextInt();
			
			switch(num){
				case 1 : Method.setPro(proLs); break;
				case 2 : Method.setSub(subLs); break;
				case 3 : Method.disPro(proLs); break;
				case 4 :	 Method.sumList(proLs, subLs); break;
				case 5 : Method.bestScr(proLs, subLs); break;
				case 6 : Method.avg(proLs, subLs); break;
				case 7 : break;
				default : System.out.println("잘못입력했습니다.");
			}
		}
		
		//7이 입력되면 프로그램 종료
		System.out.println("프로그램을 종료합니다.");
	}
}
