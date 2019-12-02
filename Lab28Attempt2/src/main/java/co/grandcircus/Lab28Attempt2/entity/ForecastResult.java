package co.grandcircus.Lab28Attempt2.entity;

public class ForecastResult {
	String forecast;
	public ForecastResult() {}
	public ForecastResult(String forecast) {
		this.forecast = forecast;
	}
	public String getForecast() {
		return forecast;
	}
	public void setForecast(String forecast) {
		this.forecast = forecast;S
	}
	@Override
	public String toString() {
		return "ForecastResult [forecast=" + forecast + "]";
	}
}
