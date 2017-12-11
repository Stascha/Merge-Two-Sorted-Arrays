import java.util.Arrays;

public class Merge_sorted_arrays 
{	
	// Merging of the two arrays both sorted in ascending order
	public static int[] merge_arrays(int[] a, int[] b)
	{		
		int a_last_index = a.length - 1;
		int b_last_index = b.length - 1;
		a = Arrays.copyOf(a, a.length + b.length);
		
		while(a_last_index >= 0 && b_last_index >= 0)		 
                    a[a_last_index + b_last_index + 1] = a[a_last_index ] > b[b_last_index] ? a[a_last_index--] : b[b_last_index-- ];
				
		while(b_last_index >= 0)
			a[ b_last_index ] = b[b_last_index-- ];
		
		return a;
	}
	
	// Merging of the two arrays. First sorted in the ascending order and the other sorted in the descending order
	public static int[] merge_arrays_2(int[] a, int[] b)
	{
		int a_last_index = a.length - 1;
		int b_start = 0;
		a = Arrays.copyOf(a, a.length + b.length);
		int n = a.length - 1;
	
		while(a_last_index >= 0 && b_start < b.length)
			a[n--] =  a[a_last_index ] > b[b_start] ? a[a_last_index--] : b[b_start++];
				
		while(b_start < b.length )
			a[ n-- ] = b[b_start++ ];
				
		return a;
	}
	
	// Merging of the two arrays both sorted in descending order
	public static int[] merge_arrays_3(int[] a, int[] b)
	{
		int a_start = 0;
		int b_start = 0;
		a = Arrays.copyOf(a, ( 2 * a.length ) + b.length );
		int n = a.length -1;
			
		while(a_start < (a.length - b.length)/2 && b_start < b.length)
			a[n--] =  a[a_start ] > b[b_start] ? a[a_start++] : b[b_start++];
	
		while(b_start < b.length )
			a[ n-- ] = b[b_start++ ];
			
		while(a_start < (a.length - b.length)/2  )
			a[ n-- ] = a[a_start++ ];
			
		a = Arrays.copyOfRange(a, (a.length - b.length)/2 , a.length);
			
		// We can use following Code instead Arrays.copyOfRange and get the same result
		/* 
		for(int i = 0; i < a.length - (a.length - b.length)/2 ; i ++ )
		   a[i] = a[i + (a.length - b.length)/2  ];
		   a = Arrays.copyOf(a, (a.length - b.length)/2 + b.length);
	        */
		return a;
			
	}
		
	// Merging of the two arrays. First sorted in the descending order and the other sorted in the ascending order
	public static int[] merge_arrays_4(int[] a, int[] b)
        {
		a = Arrays.copyOf(a, ( 2 * a.length ) + b.length);
		int a_start = 0;
		int b_last_index = b.length - 1;
		int n = a.length - 1;
					
		while( a_start < (a.length - b.length)/2 && b_last_index >= 0 )
		   a[n--] =  a[a_start] > b[b_last_index ] ? a[a_start++] : b[b_last_index-- ];
							
		while(a_start < (a.length - b.length)/2  )
		   a[ n-- ] = a[a_start++ ];
							
		while(b_last_index >= 0 )
		   a[ n-- ] = b[b_last_index-- ];
			
		for(int i = 0; i < a.length - (a.length - b.length)/2 ; i ++ )
		   a[i] = a[i + (a.length - b.length)/2  ];
		   a = Arrays.copyOf(a, (a.length - b.length)/2 + b.length);
						
	        return a;
	}

	public static void main(String args[])
	{
		int a[] = {5,8,15};
		int b[] = {1,2,3,4,6,7,9};
		
		int a1[] = {-1,15};
		int b1[] = {4,3,2,1};
		
		int a2[] = {15, 13, 9, -1};
		int b2[] = {19, 17, 14, 8, 2,1};
		
		int a3[] = {15, 8, 5, -1, -3, -5};
		int b3[] = {1,2,3,4,6,7,9};
		
		System.out.print( "a = ");
		for(int broj : a)
		   System.out.print(broj + " ");
		
		System.out.println(); 
		
		System.out.print( "b = ");
		for(int broj : b)
		   System.out.print(broj + " ");
		
		a = merge_arrays(a, b);
	    
	        System.out.println();
		System.out.println();
		
		System.out.print( "a = ");
		for(int broj : a)
		   System.out.print(broj + " ");
		
		/**************************************************************************************************/
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.print( "a1 = ");
		for(int broj : a1)
		   System.out.print(broj + " ");
		
		System.out.println();
		
		System.out.print( "b1 = ");
		for(int broj : b1)
		   System.out.print(broj + " ");
	
	        a1 = merge_arrays_2(a1, b1);
	    
	        System.out.println();
		System.out.println();
		
		System.out.print( "a1 = ");
		for(int broj : a1)
		   System.out.print(broj + " ");
		
		/*******************************************************************************************************/
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.print( "a2 = ");
		for(int broj : a2)
		   System.out.print(broj + " ");
		
		System.out.println();
		
		System.out.print( "b2 = ");
		for(int broj : b2)
		   System.out.print(broj + " ");
		
		System.out.println();
	
		a2 = merge_arrays_3(a2, b2);
	    
	        System.out.println();

		System.out.print( "a2 = ");
		for(int broj : a2)
			System.out.print(broj + " ");
		
		/********************************************************************************************************/
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.print( "a3 = ");
		for(int broj : a3)
		   System.out.print(broj + " ");
		
		System.out.println();
		
		System.out.print( "b3 = ");
		for(int broj : b3)
		   System.out.print(broj + " ");
		
		System.out.println();
		
	        a3 = merge_arrays_4(a3, b3);
	    
	        System.out.println();

		System.out.print( "a3 = ");
		for(int broj : a3)
		   System.out.print(broj + " ");
		
	}

}
