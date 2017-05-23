import java.util.Scanner;

public class StarPrint {
	/**Cogito_Project02의 StarPrint보다 간결한 방식으로 수정
	 * 별찍기
	 */
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 숫자를 입력하세요.");
		int num = sc.nextInt();
		
		star(num);
	}
	
	/**
	 * 두개의 for문을 사용하여 내림차순으로 별을 프린트하는 메소드
	 * @param num
	 */
	public static void star(int num){
		for(int i=0; i<num; i++){
			System.out.print(" ");
			for(int j=num; j>i; j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}