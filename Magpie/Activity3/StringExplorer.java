/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("Before toLowerCase(), sample = " + sample);
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		
		//  Try other methods here:
		position = sample.indexOf("slow");
		System.out.println ("sample.indexOf(\"slow\") = " + position);

		sample = sample.replace("quick", "slow");
		position = sample.indexOf("slow");
		System.out.println ("sample.indexOf(\"slow\") = " + position);



	}

}
