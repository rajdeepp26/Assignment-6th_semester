import java.*;
import java.io.*;

class uniqueCount {
    static final int Size=256;
 
    static void getOccuringChar(String str)
    {
        int count[] = new int[Size];		// Create an array of size 
 
        int length = str.length();
 
        for (int i = 0; i < length; i++)	// Initialize count array index
            count[str.charAt(i)]++;
 
        char ch[] = new char[str.length()];      // Create an array of given String size
        for (int i = 0; i < length; i++) {
            ch[i] = str.charAt(i);
            int temp = 0;
            for (int j = 0; j <= i; j++) {
 
                 if (str.charAt(i) == ch[j]) 
                    temp++;                
            }
 
            if (temp == 1) 
		//System.out.println("Number of Occurrence of ");
                System.out.println("Occurrence of "+ str.charAt(i) + " is " + count[str.charAt(i)]);            
        }
    }
}

class capitalize_Alternate_Char{

	void toUpperCase(String str)
	{
		System.out.println();
		System.out.print("--->");
		for(int i=0; i<str.length();i++)
		{
			char ch= str.charAt(i);
			if(i % 2 == 0)                                 
			{
				System.out.print(Character.toUpperCase(ch));      // converting to upperCase 
			}
			else
				System.out.print(Character.toLowerCase(ch));
		}
		System.out.println();
	}
}


class assignment {
    public static void main(String[] args)
    {
        try{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter thr string : ");
		String str= br.readLine(); 
		//Object created of uniqueCount class
		uniqueCount countObject = new uniqueCount();		
		System.out.println();                                          
        	countObject.getOccuringChar(str);
		//object created of capitalize_Alternate_Char class
		capitalize_Alternate_Char capitalObject = new capitalize_Alternate_Char(); 
		capitalObject.toUpperCase(str);
		
	}
	catch(Exception e)
	{
		System.out.println(e);                           
	}

    }
}
