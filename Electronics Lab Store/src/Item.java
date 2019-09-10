/**
 * 
 */

/**
 * @author dell 2
 *
 */
/* Static Attribute */


//Attributes
/**
 * @param ItemId
 * @param ItemName
 * @param ItemDescription
 * @param ItemCategory
 * @param SupplierName
 * @param SupplierContact
 * @param ItemPrice
 * @param AvailableQty
 */
public class Item {
	private static int Counter = 0;
	private String ItemId;
	private String ItemName;
	private String ItemDescription;
	private String ItemCategory;
	private String SupplierName;
	private String SupplierContact;
	private double ItemPrice;
	private int AvailableQty;

	// Default constructors
		/**
		 * @param ItemId
		 * @param ItemName
		 * @param ItemDescription
		 * @param ItemCategory
		 * @param SupplierName
		 * @param SupplierContact
		 * @param ItemPrice
		 * @param AvailableQty
		 */
	public Item(){
		this.ItemId = null;
		this.ItemName = null;
		this.ItemDescription = null;
		this.ItemCategory = null;
		this.SupplierName = null;
		this.SupplierContact = null;
		this.ItemPrice = 0.0;
		this.AvailableQty = 0;
		
		//incrementing the counter to calculate no of items
		setCounter(getCounter() + 1);
	}
	
	



	// Overloaded constructors
	/**
	 * @param ItemId
	 * @param ItemName
	 * @param ItemDescription
	 * @param ItemCategory
	 * @param SupplierName
	 * @param SupplierContact
	 * @param ItemPrice
	 * @param AvailableQty
	 */
	public Item(String ItemId, String ItemName, String ItemDescription, String ItemCategory, String SupplierName,
			String SupplierContact, double ItemPrice, int AvailableQty) {
		super();
		this.ItemId = ItemId;
		this.ItemName = ItemName;
		this.ItemDescription = ItemDescription;
		this.ItemCategory = ItemCategory;
		this.SupplierName = SupplierName;
		this.SupplierContact = SupplierContact;
		this.ItemPrice = ItemPrice;
		this.AvailableQty = AvailableQty;
		
		//incrementing the counter to calculate no of items
				setCounter(getCounter() + 1);
	}
	
	// -------------Behaviors-----------------//
		// Getters //
	
		/**
		 * @return the Counter
		 */
		


		/**
		 * @return the ID of Item
		 */
		public String getItemId() {
			return ItemId;
		}

		/**
		 * @return the Name of Item
		 */
		public String getItemName() {
			return ItemName;
		}

		/**
		 * @return the Description of Item
		 */
		public String getItemDescription() {
			return ItemDescription;
		}

		/**
		 * @return the Category of Item
		 */
		public String getItemCategory() {
			return ItemCategory;
		}

		/**
		 * @return the Name of Supplier
		 */
		public String getSupplierName() {
			return SupplierName;
		}

		/**
		 * @return the Supplier Contact Number
		 */
		public String getSupplierContact() {
			return SupplierContact;
		}

		/**
		 * @return the Price of Item
		 */
		public double getItemPrice() {
			return ItemPrice;
		}

		/**
		 * @return the Quantity Available of the item
		 */
		public int getAvailableQty() {
			return AvailableQty;
		}
		

		// Setters //
		
		
		/**
		 * @param ID the item to set
		 */
		public void setItemId(String ItemId) {
			this.ItemId = ItemId;
		}

		/**
		 * @param Name the item to set
		 */
		public void setItemName(String ItemName) {
			this.ItemName = ItemName;
		}

		/**
		 * @param Description the item to set
		 */
		public void setItemDescription(String ItemDescription) {
			this.ItemDescription = ItemDescription;
		}

		/**
		 * @param Category the item to set
		 */
		public void setItemCategory(String ItemCategory) {
			this.ItemCategory = ItemCategory;
		}

		/**
		 * @param Contact of the supplier to set
		 */
		public void setSupplierContact(String SupplierContact) {
			this.SupplierContact = SupplierContact;
		}

		/**
		 * @param Name of the supplier to set
		 */
		public void setSupplierName(String SupplierName) {
			this.SupplierName = SupplierName;
		}

		/**
		 * @param Price the item to set
		 */
		public void setItemPrice(double ItemPrice) {
			this.ItemPrice = ItemPrice;
		}

		/**
		 * @param Quantity available of the item to set
		 */
		public void setAvailableQty(int AvailableQty) {
			this.AvailableQty = AvailableQty;
		}
		/* Generic/other method */
		
		
		
		// compare two Item objects for equality
		/**
		 * @param X is another item
		 * @return true if the 2 items are the same
		 */
		public boolean equal(Item X) {
			if (this.ItemId.equalsIgnoreCase(X.ItemId)){
				  return true;
			}
			else {
				return false;
				
			}
		}
		
		
		/**
		 * @return the counter
		 */
		public static int getCounter() {
			return Counter;
		}

		/**
		 * @param counter the counter to set
		 */
		public static void setCounter(int Counter) {
			Item.Counter = Counter;
		}
		
		public String findItemByCategory() {
			return(this.ItemId + " " + this.ItemName + " " + this.ItemDescription + " " + this.ItemCategory + " " + this.AvailableQty + " " + this.ItemPrice + " ");
		}

}
