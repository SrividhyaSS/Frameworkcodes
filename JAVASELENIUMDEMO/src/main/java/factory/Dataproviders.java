package factory;

import dataproviders.ExcelConfiguration;
import dataproviders.ObjectReader;

public class Dataproviders 
{
	
	public static ExcelConfiguration getExcel ()
	{
		ExcelConfiguration config = new ExcelConfiguration ();
		return config;
	}

	
	public static ObjectReader getConfig ()
	{
		ObjectReader getExcel = new ObjectReader ();
		return getExcel;
	}
}
