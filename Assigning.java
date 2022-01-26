class Assigning{
			public static void main(String[] args){
			int []arr1= new int[] {100,200,300,400,500};
			
			int arr2[]=new int[10];
			for(int index=0;index<arr1.length;index++){
				arr2[index]=arr1[index];
		  }	
		  for(int index=0;index<arr2.length;index++){
			System.out.println(arr2[index]);
		  }	
			
	}
}