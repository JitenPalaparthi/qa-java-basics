public class Email implements Notifier{
	public void alertWeatherConditions(String conditions) {
		 if (conditions.equals("sunny")) {
	            System.out.println("It is sunny");
	        }
	}
}