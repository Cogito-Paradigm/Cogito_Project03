
import java.util.Scanner;

public class NumCycle{
	/**Cogito_Project02의 NumCycle보다 간결한 방식으로 수정
	 *0보다 크거나 같고 99보다 작거나 같은 정수를 이용한 연산
	 *주어진 수가 10보다 작다면 앞에 0을 붙여 두자리수로 만들고, 각 자리수를 더함
	 *주어진 수의 가장 오른쪽 자리 숫자와 앞에서 구한 합의 가장 오른쪽 자리 수를 더하여 이으면 새로운 수
	 *ex)
	 *26 		2+6=8 68 		6+8=14 84 	8+4=12 42 	4+2=6 26
	 *4번 걸렸으므로 사이클의 길이는 4
	 *n의 사이클의 길이를 구하는 프로그램을 작성
	*/
	public static void main(String[] args){
		
		//0~99까지의 숫자를 입력
		int num;
		System.out.println("0~99까지의 수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		//입력된 숫자의 범위를 판단
		while(num<0||num>99){
			System.out.println("숫자가 범위를 초과하였습니다. 다시입력하세요.");
			num = sc.nextInt();
		}
		sc.close();
		
		//비교대상이 될 원래숫자
		int su = num;
		
		//사이클 구하기
		int a = 1;
		while(true){
			num = Cycle(num);
			if(su==num){
				System.out.println("값이 같습니다.");
				break;
			}else{
				System.out.println("값이 다릅니다.");
				a++;
			}	
		}
		System.out.println(a+"번의 사이클을 반복했습니다.");
	}
	
	/**
	 * 주어진 식에 의하여 다음 싸이클에 해당하는 숫자를 반환하는 메소드
	 * @param su1
	 * @return
	 */
	public static int Cycle(int su1){
		int a1[] = new int[2];
		a1[0] = (int)(su1/10);
		a1[1] = su1%10;
		return a1[1]*10+(a1[0]+a1[1])%10;
	}
}