
public class Trainee {

	private String name;
	private String technology;
	private int age;

	public Trainee() {
		
	}
	public Trainee(int age) {
		this.age=age;
	}
	
	public Trainee(String name) {
		this.name=name;
	}

//	public Trainee(String technology) {
//		this.technology=technology;
//	}
	
	public Trainee(String name,int age,String technology) {
		this.name=name;
		this.age=age;
		this.technology=technology;
	}
	
}
