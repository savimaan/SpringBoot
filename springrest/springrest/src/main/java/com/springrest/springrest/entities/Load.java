package com.springrest.springrest.entities;

public class Load {
public Load() {
		super();
		// TODO Auto-generated constructor stub
	}
public Load(long i, String loadingPoint, String unloadingPoint,String productType, String truckType,int noOfTrucks,int weight,String optional,String Date) {
		super();
		this.shipperId = i;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint=unloadingPoint;
		this.productType=productType;
		this.truckType=truckType;
		this.noOfTrucks=noOfTrucks;
		this.weight=weight;
		this.optional=optional;
		this.Date=Date;
	}
@Override
public String toString() {
	return "Load [shipperId=" + shipperId + ", loadingPoint=" + loadingPoint + ", "
			+ "unloadingPoint=" + unloadingPoint +" "
					+ ",productType= " + productType +", truckType =" + truckType +","
							+ " noOfTrucks = " + noOfTrucks +",weight ="+ weight +","
									+ " optional =" + optional +",Date="+ Date +" ]";
}
public Long getshipperId() {
	return shipperId;
}
public void setshipperId(Long shipperId) {
	this.shipperId = shipperId;
}
public String getloadingPoint() {
	return loadingPoint;
}
public void setloadingPoint(String loadingPoint) {
	this.loadingPoint = loadingPoint;
}
public String getunloadingPoint() {
	return unloadingPoint;
}
public void setunloadingPoint(String unloadingPoint) {
	this.unloadingPoint = unloadingPoint;
}
public String getproductType() {
	return productType;
}
public void setproductType(String productType) {
	this.productType= productType;
}
public String gettruckType() {
	return truckType;
}
public void settruckType(String truckType) {
	this.truckType= truckType;
}
public int getnoOfTrucks() {
	return noOfTrucks;
}
public void setnoOfTrucks(int noOfTrucks) {
	this.noOfTrucks = noOfTrucks;
}
public int getweight() {
	return weight;
}
public void setweight(int weight) {
	this.weight =weight;
}
public String getoptional() {
	return optional;
}
public void setoptional(String optional) {
	this.optional= optional;
}
public String getDate() {
	return Date;
}
public void setDate(String Date) {
	this.Date =Date;
}
private  int noOfTrucks;
private String  unloadingPoint;
private String productType;
private String truckType;
private int weight;
private String optional;
private String Date;
private String loadingPoint;
private Long  shipperId;
}
