package sungjukMng01;

public class HumanVO {
	private	String name;
	private int age;
	private String sex;
	
	public HumanVO(){
	}
	public HumanVO(String name, int age, String sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public String toString(){
		return this.getName()+","+this.getAge()+","+this.getSex();
	}
	
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
		if(sex=="1") return "남자";
		else return "여자";
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
