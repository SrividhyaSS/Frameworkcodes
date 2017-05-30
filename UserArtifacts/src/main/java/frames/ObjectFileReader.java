package frames;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;




public class ObjectFileReader 
{
	Properties pro;
	public  ObjectFileReader () 
	{
		
		try {
			
			File src = new File ("D:\\SeleniumPractice\\srividhya\\UserArtifacts\\objects.properties");
			FileInputStream fis = new FileInputStream (src);
			pro=new Properties();
			pro.load(fis);
		} 
		
		catch (Exception e) 
		{
			
			System.out.println("Print the error message here :" +e.getMessage());
		}
		
		
		
	}

}
