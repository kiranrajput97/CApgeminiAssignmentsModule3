package com.cg.carfunction;

public class FordCar implements car {
	FordCar(int id )
	{
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
		System.out.println("start Foard car"
				+ "carname:- "+carName +"  "+"price :-"+price+ " "+"modleNumber"+modelNumber);
		
	}

}
