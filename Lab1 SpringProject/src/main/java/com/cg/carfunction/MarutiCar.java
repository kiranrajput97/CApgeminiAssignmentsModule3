package com.cg.carfunction;

import com.cg.hello.hello;

public class MarutiCar implements car {
	hello h;
	/*void Maruticar()
	{};*/
	
	MarutiCar(int id, hello h)
	{
	    this.h=h;	
		System.out.println(id);
	}
	private String carName;
	private float price;
	private int modelNumber;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}

	public void startFunction() {
		System.out.println("start Maruti car"
				+ "carname:- "+carName +"  "+"price :-"+price+ " "+"modleNumber"+modelNumber);
		System.out.println(h.getData());
		
	}
	

}
