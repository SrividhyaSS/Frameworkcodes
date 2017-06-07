package dataproviders;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ObjectReader
{

	Properties pro;
	
	public ObjectReader ()
	{
		
		
		try {
			File src = new File ("./Configuration/object.properties");
			FileInputStream fis = new FileInputStream (src);
			pro=new Properties();
			pro.load(fis);
			
		} 
		catch (Exception e) {
			
			System.out.println("Exception is "+e.getMessage());
		}
	}
		
		
		public String getApplicationUrl()
		{
			String url=pro.getProperty("URL");
			return url;
		}
		
		public String getchromepath()
		{
			String chromepath = pro.getProperty("ChromeDriver");
			return chromepath;
		}
		
		public String getIEPath()
		{
			String IEPath = pro.getProperty("IEDriver");
			return IEPath;
		}
		
		
	}

	

