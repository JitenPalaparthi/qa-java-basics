public class Phone implements Notifier{
	public void alertWeatherConditions(String conditions) {
		 if(conditions.equals("rainy")) {
	            System.out.println("It is rainy");
	        }
	}
}