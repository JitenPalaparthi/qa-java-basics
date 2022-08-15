public class WeatherTracker {
    private String conditions;

    public void setConditions(String weather) {
        this.conditions = weather;
    }

    public void notify(Notifier notifier) {
        notifier.alertWeatherConditions(conditions);
    }

    public String getConditions() {
        return conditions;
    }
}