package com.main.beans;

import java.util.List;

import com.main.beans.inner.CityBean;
import com.main.beans.inner.ListBean;

public class RequestResponseBean {
 private String cod;
 private double message;
 private int cnt;
 private List<ListBean> list;
 private CityBean city; 
public String getCod() {
	return cod;
}
public void setCod(String cod) {
	this.cod = cod;
}
public double getMessage() {
	return message;
}
public void setMessage(double message) {
	this.message = message;
}
public int getCnt() {
	return cnt;
}
public void setCnt(int cnt) {
	this.cnt = cnt;
}
public List<ListBean> getList() {
	return list;
}
public void setList(List<ListBean> list) {
	this.list = list;
}
public CityBean getCity() {
	return city;
}
public void setCity(CityBean city) {
	this.city = city;
}

 
 
}
