package pl.zzpj2020.solid.dip.weathertracker.solution;

public class Emailer implements WeatherNotificator {
    @Override
    public String generateWeatherAlert(String weatherConditions) {
        return "It is " + weatherConditions;
    }
}
