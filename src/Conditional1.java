
public class Conditional1 {

	public static void main(String[] args) {
		
		
		{
			int a = 34 ;
			int b = 156 ;
			int c = 57;
			
			int ans1 = a > b ? a : b ;
			
	   int largest = ans1 > c ? ans1 : c ;
	   
	   System.out.println("Largest"+largest);
			
			}
			
			{
			
			int a = 34 ;
			int b = 56 ;
			int c = 57;
			
			int ans1 = a < b ? a : b ;
			
	   int smallest = ans1 < c ? ans1 : c ;
	   
	   System.out.println("Smallest :"+smallest );
			
		
			
		}
		{
			
			int a = 314 ;
			int b = 56 ;
			
			
			int ans1 = a < b ? a : b ;
			

	   
	   System.out.println(ans1);
			
			
			
			
			
			
		}
		
		
			
			
			
			
		
		
		// TODO Auto-generated method stub

	}

}
