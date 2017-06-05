package interfaceinjava;

public class Chromebrowser implements WebdriverInterface {
	
	static int z;

	public static void main(String[] args) 
	{
		Chromebrowser obj = new Chromebrowser();
		obj.add();	
		obj.get();
		obj.quit();
		obj.close();
		obj.sub(20, 30);
		System.out.println("print the calue : "+Chromebrowser.z);
	}
	
	public void get() 
	{
		
		System.out.println("Print get");
	}
	
	public void quit() {
		
		System.out.println("Print quit");
	}

	
	public void close() {
		
		System.out.println("Print close");
	}

	
	int sub (int x, int y)
	{
	
	return z = x - y;
	
			
	}

	
	public void add() 
	{
		
	System.out.println("Print add");	
	}
	
}
