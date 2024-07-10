public class DisplayScreen
{
	private String companyMake;
	private int monitorSize;
	private int refreshRate;
	private double monitorPrice;
	private static int lastListPosition;
	private int listPosition;
	
	// Default Constructor
	public DisplayScreen()
	{
		lastListPosition++;
		listPosition = lastListPosition;
	}
	
	// Constructor with defined parameters
	public DisplayScreen(String make, int size, int rate, double cost)
	{
		lastListPosition++;
		listPosition = lastListPosition;
		companyMake = make;
		monitorSize = size;
		refreshRate = rate;
		monitorPrice = cost;
	}
	
	// Manufacturer setter
	public void setMake(String make)
	{
		companyMake = make;
	}
	
	// Size setter
	public void setSize(int size)
	{
		monitorSize = size;
	}
	
	// Refresh Rate setter
	public void setRefreshRate(int rate)
	{
		refreshRate = rate;
	}
	
	// Price setter
	public void setMonitorPrice(double cost)
	{
		monitorPrice = cost;
	}
	
	// Make getter
	public String getMake()
	{
		return companyMake;
	}
	
	// Size getter
	public int getScreenSize()
	{
		return monitorSize;
	}
	
	// Refresh Rate getter
	public int getRefreshRate()
	{
		return refreshRate;
	}
	
	// Price getter
	public double getMonitorPrice()
	{
		return monitorPrice;
	}
	
	// Display Information Method
	public void displayInformation()
	{
		System.out.println("Monitor " + listPosition +  " Information:");
		System.out.println("Manufacturer: " + companyMake);
		System.out.println("Screen Size: " + monitorSize + " Inches.");
		System.out.println("Screen Refresh Rate: " + refreshRate + " Hertz.");
		System.out.println("Price: $" + monitorPrice);
		System.out.println();
	}
}
