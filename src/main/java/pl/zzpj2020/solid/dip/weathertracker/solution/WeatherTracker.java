package pl.zzpj2020.solid.dip.weathertracker.solution;


public class WeatherTracker {
    String currentConditions;
    WeatherNotificator notificator;

    public WeatherTracker(WeatherNotificator notificator) {
        this.notificator = notificator;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;

        String alert = notificator.generateWeatherAlert(weatherDescription);
        System.out.println(alert);
    }
}
