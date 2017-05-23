package sungjukMng02;


import java.util.Scanner;

public class ProfileVO{
	String name;
	int age;
	String sex;
	
	//생성자로 프로필 입력받음
	public ProfileVO(){
		Scanner sc = new Scanner(System.in);
			
		//이름입력	
		System.out.println("학생의 이름을 입력하시오.");
		setName(sc.nextLine());
		
		//나이입력	
		System.out.println("학생의 나이를 입력하시오.");
		setAge(sc.nextInt());
		
		//성별입력
		System.out.println("학생의 성별을 입력하시오.(성별 남=1, 여=2)");
		while(true){
			int a = sc.nextInt();
			if(a==1)
			{
				setSex("남자");
				break;
			}
			else if(a==2)
			{
				setSex("여자");
				break;
			}else{
				System.out.println("잘못입력하였습니다.");
			}
		}
	}
	
	//toString 오버라이딩
	public String toString(){
		return this.getName()+", "+this.getAge()+", "+this.getSex();
	}
	
	//setter와 getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}	
}
