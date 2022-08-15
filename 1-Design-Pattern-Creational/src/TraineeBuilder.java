public class TraineeBuilder
{
	private String name;​
	private int age=0;
	private String technology;

	public TraineeBuilder() {
	}

	public Trainee buildTrainee() {
		return new Trainee(name, age, technology);
	}

	public TraineeBuilder byName(String passedName) {
		this.name=passedName;
		return this;
	}

	public TraineeBuilder byAge(int passedAge) {
		this.age=passedAge;​
	return this;
	}

	public TraineeBuilder byTechnology(String passedTechnology) {
		this.technology=passedTechnology;
		return this;​
	}​
}​