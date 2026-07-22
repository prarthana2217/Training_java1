package org.tns.acc.c2ct.oops;

public class FoodItem {
	//variable
		String name;
		double price;
		String Category;
		
		//method
		void displayDetail()
		{
			System.out.println("Food name :"+ name);
			System.out.println("Price :"+ price);
			System.out.println("Category :"+Category);
			System.out.println("----");
		}
	

	public static void main(String[] args) {
		FoodItem fooditem1=new FoodItem();
		fooditem1.name="Briyanni";
		fooditem1.price=299.99;
		fooditem1.Category="Rice";
		
		FoodItem fooditem2=new FoodItem();
		fooditem2.name="Pizaa";
		fooditem2.price=399.99;
		fooditem2.Category="Fast Food";
		
		fooditem1.displayDetail();
		fooditem2.displayDetail();

	}

}
