package com.main.beans.inner;

import java.util.List;

public class ListBean {
	private long dt;
    private MainDataBean main;
    private List<WeatherBean> weather;
    private CloudsBean clouds;
    private WindBean wind;
    private SysBean sys;
    private String dt_txt;
    
	public long getDt() {
		return dt;
	}
	public void setDt(long dt) {
		this.dt = dt;
	}
	public MainDataBean getMain() {
		return main;
	}
	public void setMain(MainDataBean main) {
		this.main = main;
	}
	public List<WeatherBean> getWeather() {
		return weather;
	}
	public void setWeather(List<WeatherBean> weather) {
		this.weather = weather;
	}
	public CloudsBean getClouds() {
		return clouds;
	}
	public void setClouds(CloudsBean clouds) {
		this.clouds = clouds;
	}
	public WindBean getWind() {
		return wind;
	}
	public void setWind(WindBean wind) {
		this.wind = wind;
	}
	public SysBean getSys() {
		return sys;
	}
	public void setSys(SysBean sys) {
		this.sys = sys;
	}
	public String getDt_txt() {
		return dt_txt;
	}
	public void setDt_txt(String dt_txt) {
		this.dt_txt = dt_txt;
	}
    
    
}
