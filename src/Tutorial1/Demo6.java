package Tutorial1;

public class Demo6 {

	public static void main(String[] args) {
		String a="abcd123efgh456";
	    char []b =a.toCharArray();
	    for(int i=0;i<b.length;i++)
	    {
	    	if(Character.isDigit(b[i]))
	    	{
	    		System.out.print(b[i]);
	    	}
	    }

	}

}
