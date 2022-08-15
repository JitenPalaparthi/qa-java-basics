
public class DependencyInversionDemo {
	
	public static void main(String[] args) {
		
		Email email= new Email();
		Phone phone=new Phone();
		
		
		WeatherTracker tracker = new WeatherTracker();
		
		tracker.setConditions("sunny");
		tracker.notify(email);
		tracker.setConditions("rainy");
		tracker.notify(phone);
	}

}
