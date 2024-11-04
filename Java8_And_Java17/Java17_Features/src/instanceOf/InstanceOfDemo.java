package instanceOf;

public class InstanceOfDemo {

	public static void main(String[] args) {
		//Object o = new String();
		//Object o = new Integer(55);
		
		Object o = new Double(4.555);
		
		if (o instanceof String) 
		{
		    String s = (String) o;
		  String res =  String.format("String %s", s);
		  System.out.println(res);
		} 
		else if (o instanceof Integer) 
		{
		    Integer i = (Integer) o; 
		   String res = String.format("int %d", i);
		   
		   System.out.println(res);
		} 
		else if (o instanceof Double) 
		{
		    Double d = (Double) o;
		   String res = String.format("double %f", d);
		   
		   System.out.println(res);
		}

	}

}
