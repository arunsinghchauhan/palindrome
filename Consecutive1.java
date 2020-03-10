public class Consecutive1 {

	
	int[] arr={1,0,0,1,1,1,0,1,1,1,1,1,0,0,1};
	int temp=0,max=0;
	
	public void traversearr()
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				temp= temp+1;
				//System.out.println(temp);
				
			}
			
			else
			{
				if(max<temp)
				{
					max=temp;
				}
				else
			
			    	temp=0;
			}
			/*
			 * else { if(temp>max) { max=temp; //System.out.println(max); } temp=0;
			 * 
			 * }
			 */
		}
		
		System.out.println(temp);
		/*
		 * if(max>temp) { System.out.println("The maximum number of consecutive 1;s :"
		 * +max); }
		 */
	}
	public static void main(String[] args) {
		Consecutive1 co= new Consecutive1();
		co.traversearr();
	}

}