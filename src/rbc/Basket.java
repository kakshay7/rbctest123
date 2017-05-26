package rbc;

import java.util.Scanner;

public class Basket {
    
	Item[] items;
	int quantity;
	
	public void fillBasket()
	{
		String tempName;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("How many Do you want to put in basket: ");
		quantity = sc.nextInt();
		items = new Item[quantity];
		
		for(int i = 0; i < quantity; i++)
		{
			items[i] = new Item();
			System.out.println("Enter the " + (i+1) + " Item Name");
			tempName = sc.next();
			items[i].setItem(tempName);
			System.out.println("Enter the " + (i+1) + " Item Value");
			items[i].setValue(sc.nextInt());
		}
		sc.close();
				
	}
	
	public int CountValue()
	
	{
		int sum = 0;
		for(int j = 0; j < quantity; j++)
		{
			sum = sum + items[j].getValue();
		}
		return sum;
	}
	
	
}


