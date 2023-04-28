package letsGetPlaced;

public class AllConstrucstorConcept 
{
	String name;
	int nmb;
	float ft;
	char cr;
	
	public AllConstrucstorConcept(String studentname,int number, float floatt,char chr)
	{
		name = studentname;
		nmb  = number;
		ft = floatt;
		cr = chr;
	}
	
	public void method()
	{
		System.out.println(name);
		System.out.println(nmb);
		System.out.println(ft);
		System.out.println(cr);
	}
	public static void main(String[] args) 
	
	{
	
		AllConstrucstorConcept object = new AllConstrucstorConcept("mangesh",100,0.1f,'A');
		object.method();
		
		
		
		
	}
	
	
}
