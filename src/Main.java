public class Main 
{
	public static void main(String[] args)
	{
		// Create an object of the class ( In this case a display monitor, using a default constructor )
		
		DisplayScreen monitor1 = new DisplayScreen();
		
		/* Because the constructor was set to the default, the information for our newly created object will show:
		 *  
		 * Monitor 1 Information:
		 * Manufacturer: null
		 * Screen Size: 0 Inches.
		 * Screen Refresh Rate: 0 Hertz.
		 * Price: $0.0
		 * 
		 */
		
		monitor1.displayInformation();
		
		// To change the information, we use the setter methods as defined within the class.
		
		monitor1.setMake("Asus");
		monitor1.setSize(32);
		monitor1.setRefreshRate(144);
		monitor1.setMonitorPrice(199.99);
		
		/* The information for our object will now show :
		 * 
		 * Monitor 1 Information:
		 * Manufacturer: Asus
		 * Screen Size: 32 Inches.
		 * Screen Refresh Rate: 144 Hertz.
		 * Price: $199.99
		 * 
		 */
		
		// Call the display method to view updated information.
		
		monitor1.displayInformation();
		
		// Create a new object of the display class, using a constructor that updates the related information upon initialization
		
		DisplayScreen monitor2 = new DisplayScreen("Sony",36,240,349.99);
		
		/* Using the defined constructor, the information for this object will be displayed as:
		 * 
		 * Monitor 2 Information:
		 * Manufacturer: Sony
		 * Screen Size: 36 Inches.
		 * Screen Refresh Rate: 240 Hertz.
		 * Price: $349.99
		 * 
		 */
		
		// Call the display method to view that the initialized information matches.
		monitor2.displayInformation();
	}
}
