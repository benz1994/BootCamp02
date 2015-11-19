
public class bootcamp02 {

	public static void main(String[] args)
	{
		

	}
	// Task 1
	public static int smallest( int[] smallest)
	{
	    int smallest_value = smallest[0];
	    int current_value=0;
		for(int i =1; i<smallest.length;++i)
		{
			
			current_value = smallest[i];
			if(smallest_value>current_value)
			{
				smallest_value =current_value;
			}
			
		}
		
		return smallest_value;
	}
	//------------------------------
	// Task 2

	public static int[] populateArray (int left, int right, int count)
	{
		int [] newArray = new int[count];
		
		if(left>right)
		{
		for(int i =newArray.length-1;i>=0;--i)
		{ 
			newArray[i] = (int)((left-right)*Math.random())+right;
			
		}
		}
		 else if(left<=right)
		{
			
			 for(int i =0;i<newArray.length;++i)
				{ 
					newArray[i] = (int)((right-left)*Math.random())+left;
					
				}
					
				}
		
	  
		return newArray;
		}	
	// -----------------------------------
	// Task3
	public static double[] populateArray (double left, double right, int count)
	{
		double [] newArray = new double[count];
		if(left>right)
		{
		for(int i =newArray.length-1;i>=0;--i)
		{ 
			newArray[i] = ((left-right)*Math.random())+right;
			
		}
		}
		 else if(left<=right)
		{
			
			 for(int i =0;i<newArray.length;++i)
				{ 
					newArray[i] = ((right-left)*Math.random())+left;
					
				}
					
				}
		
	  
		return newArray;
		}	
	// ---------------------------------
	//Task4
	public static int[] grow(int [] biggerArray)
	{
		int [] tmp= biggerArray;
		 biggerArray = new int [2*biggerArray.length];
		 for(int i =0; i<tmp.length;++i)
		 {
			 biggerArray[i] = tmp[i];
		 }
		 return biggerArray;
	}
	//--------------------
	// Task 5
	public static int [] shrink (int[] smallerArray)
	{
		int [] tmp = smallerArray;
		smallerArray = new int [smallerArray.length/2];
		 for(int i =0; i<smallerArray.length;++i)
		 {
			 smallerArray[i] = tmp[i];
		 }
		 return smallerArray;
		
	}
	//----------------------------------
	// Task 6
	public static double [] grow(double [] biggerArray)
	{
		double tmp[] = biggerArray;
		biggerArray = new double[biggerArray.length*2];
		 for(int i =0; i<tmp.length;++i)
		 {
			 biggerArray[i] = tmp[i];
		 }
		 return biggerArray;
	}
	// ----------
	// Task 7
	public static double [] shrink (double [] smallerArray)
	{
		double [] tmp = smallerArray;
		smallerArray = new double [smallerArray.length/2];
		 for(int i =0; i<smallerArray.length;++i)
		 {
			 smallerArray[i] = tmp[i];
		 }
		 return smallerArray;
	}
	}
		
	

