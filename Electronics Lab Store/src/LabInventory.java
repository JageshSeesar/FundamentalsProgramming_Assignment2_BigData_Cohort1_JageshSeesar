import java.util.Scanner;
import java.util.Arrays;
/**
 * 
 */

/**
 * @author dell 2
 *
 */

public class LabInventory {

	/**
	 * 
	 */
	public LabInventory() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner keyboard = new Scanner(System.in);
		
		//Initializing variable
		int size = 0;
		int choice = 0;
		String pwrd = null;
		final String PASSWORD = "DitProg123";
		int wrong = 0;
		
		System.out.println("Welcome to the lab inventory");
		
		System.out.println("Enter maximum number of Items to be store: ");
		size = keyboard.nextInt();
		
		//Create an empty array
		//Item itemDatabase = new Item[size];
		Item [] itemDatabase = new Item[size];
		int i = 0;
		 String ItemId;
		 String ItemName;
		 String ItemDescription;
		 String ItemCategory;
		 String SupplierName = null;
		 String SupplierContact = null;
		 double ItemPrice;
		 int AvailableQty;
		 
		System.out.println("You're good to go. Please insert your Item: ");
		for (i=0; i < size; i++) {
		System.out.println("Item ID: ");
		ItemId = keyboard.next();
		
		System.out.println("Item Name: ");
		ItemName = keyboard.next();
		
		System.out.println("Item Description: ");
		ItemDescription = keyboard.next();
		
		System.out.println("Item Category: ");
		ItemCategory = keyboard.next();
		
		System.out.println("Supplier Name: ");
		SupplierName = keyboard.next();
		
		System.out.println("Supplier Contact No: ");
		SupplierContact = keyboard.next();
		
		System.out.println("Item Quantity: ");
		AvailableQty = keyboard.nextInt();
		
		System.out.println("Item Price: ");
		ItemPrice = keyboard.nextDouble();
		
		itemDatabase [i] = new Item(ItemId, ItemName, ItemDescription, ItemCategory, SupplierName, SupplierContact, ItemPrice, AvailableQty);
		 
		itemDatabase[i].setItemId(ItemId);
		itemDatabase[i].setItemName(ItemName);
		itemDatabase[i].setItemDescription(ItemDescription);
		itemDatabase[i].setItemCategory(ItemCategory);
		itemDatabase[i].setAvailableQty(AvailableQty);
		itemDatabase[i].setItemPrice(ItemPrice);
		
		System.out.println(itemDatabase[i].toString());
		}
		
		do {
			System.out.println("What do you want to do? ");
			System.out.println("Enter 1 to add new Item to the inventory ");
			System.out.println("Enter 2 to change information of an existing Item ");
			System.out.println("Enter 3 to display all the Items with specified category ");
			System.out.println("Enter 4 to display all Item to be re-ordered ");
			System.out.println("Enter 5 to know number of Items currently in store ");
			System.out.println("Enter 6 to quit ");
			System.out.println("Please enter your choice: ");
			choice = keyboard.nextInt();
			
			
			// 1. Enter a new Item to the inventory (password required)
			if (choice == 1) {
				System.out.println("Add a new item to the inventory");
				for(int attempt = 0; attempt < 3; attempt++) {
					System.out.println("Enter your password. Attempt "+(attempt + 1)+": ");
					pwrd = keyboard.next();
					
					if(!pwrd.equals(PASSWORD)) {
						wrong++;
						System.out.println("Try again ");
						
						if(wrong == 12) {
							System.out.println("Dell1234");
							break;
						}
					}
					else {
						
						
						
						
						
						System.out.println(" ");
						break;
					
						
					}
				}		
				
			}
			
			
			// 2. Change information of an existing Item (password required)
			if (choice == 2) {
				System.out.println("Change information of an existing Item");
				for(int attempt = 0; attempt < 3; attempt++) {
					System.out.println("Enter your password. Attempt "+(attempt + 1)+": ");
					pwrd = keyboard.next();
					
					if(!pwrd.equals(PASSWORD)) {
						wrong++;
						System.out.println("Try again ");
						
						if(wrong == 12) {
							System.out.println("Dell1234");
							break;
						}
					}
					else {
						break;
					}
			}
	/*
				for(i = 0; i < size; i++) {
					String ItemNameChange = itemDatabase[i].getItemId();
					
					String whichId = null;
					if (IdChange.equals(whichId)) {
						System.out.println("Which detail would you like to change: ");
						String detailToChange = keyboard.next();
						
						
						if (detailToChange.equalsIgnoreCase("ItemName")) { 
							
							System.out.println("Please enter updated Item Name: ");
							ItemName = keyboard.next();
							itemDatabase[i].setItemName(ItemName);
						}
					    if (detailToChange.equalsIgnoreCase("ItemDescripton")) {
					    	System.out.println("Please enter updated description of item: ");
					    	ItemDescription = keyboard.next();
					    	itemDatabase[i].setItemDescription(ItemDescription);
					    }
					    if(detailToChange.equalsIgnoreCase("ItemCategory")) {
					    	System.out.println("Please enter updated item category: ");
					    	ItemCategory = keyboard.next();
					    	itemDatabase[i].setItemCategory(ItemCategory);
					    }
					    if (detailToChange.equalsIgnoreCase("AvailableQty")) {
					    	System.out.println("Please enter updated quantity available : ");
					    	AvailableQty = keyboard.nextInt();
					    	itemDatabase[i].setAvailableQty(AvailableQty);
					   
					    }
					    if (detailToChange.equalsIgnoreCase("price")) {
					    	System.out.println("Please enter updated price : ");
					    	ItemPrice = keyboard.nextDouble();
					    	itemDatabase[i].setItemPrice(ItemPrice);
					    }
					    
					    
					    System.out.println(itemDatabase[i].toString());
					    
		 	        	
					
					}
						}
						
			*/
				
		}
			
			// 3. Display all the Items with the specified category
			if (choice == 3) {
				System.out.println("Displaying all the Items with a specified category");
				
				System.out.println("Enter Specified category: ");
				size = keyboard.nextInt();
				

			}
			// 4. Display all Items to be re-ordered
			if (choice == 4) {
				System.out.println("Display all Items to be re-ordered");
		
			}
			// 5. Number of Items currently in store
			if (choice == 5) {
				System.out.println("Number of Items currently in store");
				
				
			}
			// 6. Quit
			if (choice == 6) {
				System.out.println("Lab Inventory is closed.");
				break;
			}
		}
		while(!pwrd.equals(PASSWORD));
		keyboard.close();

	}

}
