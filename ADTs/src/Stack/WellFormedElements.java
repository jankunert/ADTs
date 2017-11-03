package Stack;
import java.util.Scanner;
public class WellFormedElements 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		String t = s.nextLine();
		s.close();
		
		if( isWellFormed(t) ) 
		{
			System.out.println("Deine Eingabe: "+t+" ist in Ordnung.");
		}
		else
			System.out.println("Deine Eingabe: "+t+" ist NICHT in Ordnung!");
	}
	
	
	public static boolean isWellFormed(String t)
	{
		CharStack g = new CharArrayStack();
		for( int k = 0; k<t.length();k++)
		{
			char c = t.charAt(k);

			if(c=='(')
			{						
				g.push(c);
			}
			else
			{	
				if( g.isEmpty() )
					return false;
				
				g.pop();
			}
			
			
		}
		
		return g.isEmpty();	
	}
	
}
