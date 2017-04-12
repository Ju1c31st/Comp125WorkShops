//QUESTION 1
/**
* a StockItem is an item for sale at a store.
* unitPrice is the price per unit.
* quantity is the number of units of the item left in store.
*/
class StockItem {
	private double unitPrice;
	private int quantity;
	
	//getter for each instance variable
	
	/*
	 * setter for each instance variable 
	 * (validate such that if parameter is 
	 * negative, instance variable is assigned 0)
	 */
	
	/*
	 * default constructor
	 * unitPrice should be 0.1
	 * quantity should be 1
	 */
	
	//parameterized constructor

	/*
	 * method totalPrice, returns the total 
	 * price of all stock of the item. so if
	 * 5 units are left @ $1.5 per unit, total
	 * stock price is 5 * 1.5 = 7.5 
	 */
	
	/* compareTo(StockItem other)
	 * return:
	 * 1 if unitPrice of calling object is more than that of parameter object 
	 * -1 if unitPrice of calling object is less than that of parameter object
	 *  0 if unitPrice of calling object is equal to that of parameter object
	 */
}


public class AllInOne {
	/**
	 * Question 2
	 * @param arr
	 * @return the product of all items of arr.
	 * return 1 if array is null or empty
	 */
	public static int product(int[] arr) {
		return 1; //to be completed
	}

	/**
	 * Question 3
	 * @param arr
	 * @param low
	 * @param high
	 * @return true if all the items of arr are 
	 * more than or equal to low and
	 * less than or equal to high.
	 * return false otherwise (or if arr is null or empty)
	 */
	public static boolean allInRange(int[] arr, int low, int high) {
		return true; //to be completed
	}

	/**
	 * Question 4
	 * @param arr
	 * @param target
	 * @return an index in arr at which target exists.
	 * return -1 if array is null or target doesn't exist in arr
	 */
	public static int binarySearch(int[] arr, int target) {
		boolean dummy = false;
		int first = 0; 
		int last = 123456789; //replace 123456789 by the correct value
		while( dummy ) { //replace dummy by the correct expression		
			int median = (first + last)/2;		
			if (dummy) //replace dummy by the correct expression
				return median;
			if (target < arr[median])
				last = median - 1; //search left
			else
				first = 123456789; //search right: replace 123456789 by the correct value
		}
		return -1;
	}

	/**
	* QUESTION 5: Sort the array in ascending order
	*/
	public static void selectionSort(int[] arr) {
		  boolean dummyExpression = false; 

		if(arr == null)
		       return;
		    
		  for(int i=0; dummyExpression; i++) { //replace dummyExpression by correct expression
		    int minIndex = i; 
		    for(int k = i + 1; k < arr.length; k++) { 
		      if (dummyExpression) { //replace dummyExpression by correct expression
				    minIndex = 123456789; //replace 123456789 by correct value
		      }
		    }

		    int temp = 123456789; //replace 123456789 by correct value
		    arr[i] = 123456789; //replace 123456789 by correct value
		    arr[minIndex] = temp; 		  
		}
	}

	/**
	 * 
	 * @param arr
	 * @param low
	 * @param high
	 * @return an array containing all items from arr that are
	 * more than or equal to low and less than or equal to high.
	 * return null if arr is null.
	 * return empty array if arr is empty or if there are no items
	 * satisfying the condition
	 */
	public static int[] getItemsInRange(int[] arr, int low, int high) {
		return null; //to be completed
	}
}
