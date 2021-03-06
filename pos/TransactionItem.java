package pos;


import account.Customer;
import java.util.Date;
/**
 * This is a inventory item that the store carries with it's own unique barcode number; The classes that should implement this interface include: physical video, refund, penalty, lost movie, discount.
 	@author Peter
 */
public interface TransactionItem
{
	/**
		This gets the type of the item (Rental Video, Sale Video, Promo, Penalty, etc).
		@return the item's type is returned.
	*/
	String getType();
	/**
		This gets the name of the item.
		@return the name of the item.
	*/
	String getName();
	/**
		The price of the item (can be negative for discounts)
		@return the price of the item in cents
	*/
	int getPrice(); // price in cents
	/**
		The item's barcode number
		@return the barcode of the item
	*/
	String getBarcode();
	/**
	 * This updates the item info (to be used when the item is added to the Transaction, example: for a Rental Video, the video should be marked as checked by the customer on the given date, and for Penalties  it should be marked as paid, and for Promos maybe nothing or for future functions)
	 
	 * @param invoiceID the invoice number this item is on.
	 * @pre the item should be paid for before calling this method.
	 */
	void updateItemInfoAtCheckOut(int invoiceID)
                throws Exception;
	//this method should probably be in some inventory item class.
	//boolean updateItemInfoAtCheckIn(Date theDate, String barcode);
}

