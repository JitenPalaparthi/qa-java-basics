
public class CreationalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trainee t1= new TraineeBuilder().byName("Jiten").byAge(37).buildTrainee();
		
	    Trainee t2= new TraineeBuilder().byName("Jeff").byAge(19).byTechnology("devops").buildTrainee();

			    System.out.println(t1);
			    System.out.println(t2);
		
	}

}
