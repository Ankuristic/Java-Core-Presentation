package FruitsShopMain;

import java.io.IOException;
import java.util.Scanner;

import FruitsShopDAOMySql.FruitsDAO;
import OnlineFruitShop.dto.Fruits;

public class FruitsShopMain {

	public static void main(String[] args) throws  IOException{
		// TODO Auto-generated method stub
		System.out.println("Welcome to Fruit shop");
		Scanner scn = new Scanner(System.in);
		while(true)
		{
		System.out.println("Press 1 to add fruit");
		System.out.println("Press 2 to delete the fruit");
		System.out.println("Press 3 to fetch all the fruit");
		System.out.println("Press 4 to update the fruit");
		System.out.println("Press 5 to exit");
		int c = Integer.parseInt(scn.next());
		
		if(c==1)
		{
			//add fruits
			System.out.println("Enter user fruitid : ");
			int fruitid = scn.nextInt();
			
			System.out.println("Enter user fruitsname : ");
			String fruitname =scn.next();
			
			System.out.println("Enter user price : ");
			int price = scn.nextInt();
			
			System.out.println("Enter user description : ");
			String description = scn.next();
			
			//create student object to store student
			Fruits fn = new Fruits(fruitid,fruitname,price,description);
			boolean answer = FruitsDAO.addFruits(fn);
			if(answer)
			{
				System.out.println("Fruits  is successfully added...");
			}else
			{
				System.out.println("something went wrong..");
			}
			
			System.out.println(fn);
		}
			
			else if(c==2)
			{
				//delete fruits
				System.out.println("Enter fruit id to delete : ");
				int fruitsId = Integer.parseInt(scn.next());
				boolean f = FruitsDAO.deleteFruit(fruitsId);
				if(f)
				{
					System.out.println("Deleted");
				}else
				{
					System.out.println("something went wrong...");
				}
			}
			else if(c==3)
			{
				//display fruits
				FruitsDAO.showAllFruits();;
			}
			else if(c==4)
			{
				System.out.println("Enter fruit name : ");
				String name =scn.next();
				
				System.out.println("Enter fruit id : ");
				Integer id = scn.nextInt();
				Fruits fn1 = new Fruits();
			boolean st =FruitsDAO.updateFruits(fn1);					
				if(st) 
				{
				System.out.println("Fruits is successfully update...");
			}else
				{
					System.out.println("something went wrong..");
				}
			
				System.out.println(st);
				
			} else if(c==5)
			{
				break;
			}
	}
		System.out.println("Thank you for shopping the fruit from this market ");

	}

}
	
	