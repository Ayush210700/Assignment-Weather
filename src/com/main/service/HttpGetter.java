package com.main.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.main.beans.RequestResponseBean;
import com.main.beans.inner.ListBean;
import com.main.config.AppConfig;

public class HttpGetter {
	private RequestResponseBean getAPI() throws Exception {
		
		HttpClient httpClient = HttpClient.newHttpClient();
		 
		HttpRequest httpRequest = HttpRequest.newBuilder()
				  .uri(new URI(AppConfig.API_URL))
				  .GET()
				  .build();
		HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
//		int statusCode = response.statusCode();
//      System.out.println("Status Code: " + statusCode);
        String responseBody = response.body();
        Gson gson = new Gson();
        RequestResponseBean requestResponseBean = gson.fromJson(responseBody, RequestResponseBean.class);
		return requestResponseBean;
	}
	/*
	private DateRange getDate(String inputDate) {

        // Parse the input date to a LocalDate object
        LocalDate localDate = LocalDate.parse(inputDate);

        // Set the time to 00:00:00
        LocalDate startDate = localDate.atStartOfDay().toLocalDate();

        // Convert to milliseconds
        long millis = startDate.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
        
        LocalDate endDate = LocalDate.parse(inputDate);
        // Set the end date time to 23:59:59
        LocalDate endDateWithoutTime = endDate.atStartOfDay().plusDays(1).minusNanos(1).toLocalDate();

        // Convert to milliseconds
        long endMillis = endDateWithoutTime.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
        DateRange dateRange = new DateRange();
        dateRange.setStartDate(millis);
        dateRange.setEndDate(endMillis);
        return dateRange;
	}
	
	*/
	public String tempOfInputDate(String inputDateString) throws Exception {
		// choice 1
		String output = "";
		RequestResponseBean data = this.getAPI();
		for(ListBean dataList: data.getList()) {
			if(dataList.getDt_txt().startsWith(inputDateString)) {
				System.out.println("Temperature on "+ dataList.getDt_txt() + " : " + dataList.getMain().getTemp());
			}
				
		}
		return output;
	}
	
	public String windSpeedOfInputDate(String inputDateString) throws Exception {
		// choice 2
		String output = "";
		RequestResponseBean data = this.getAPI();
		for(ListBean dataList: data.getList()) {
			if(dataList.getDt_txt().startsWith(inputDateString)) {
				System.out.println("Wind Speed on "+ dataList.getDt_txt() + " : " + dataList.getWind().getSpeed());
			}
				
		}
		return output;
	}
	
	public String pressureOfInputDate(String inputDateString) throws Exception {
		// choice 3
		String output = "";
		RequestResponseBean data = this.getAPI();
		for(ListBean dataList: data.getList()) {
			if(dataList.getDt_txt().startsWith(inputDateString)) {
				System.out.println("Pressure on "+ dataList.getDt_txt() + " : " + dataList.getMain().getPressure());
			}
				
		}
		return output;
	}

}
