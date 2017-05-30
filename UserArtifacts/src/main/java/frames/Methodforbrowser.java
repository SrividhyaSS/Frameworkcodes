package frames;



public class Methodforbrowser extends ObjectFileReader
{

	/*public Methodforbrowser()
	{
			
			super ();	
		
	}*/
	
	
	public String getChromePath ()
	{
		String Path =  pro.getProperty("ChromeDriver");
		return Path;
		
	}

	
	public String getIEPath()
	{
		
		String path = pro.getProperty("IEDriver");
		return path;
	}
	
	public String getApplicationURL ()
	{
		String URL = pro.getProperty("URL");
		return URL;
	}
	
	
}
