class Prime{
		public static void main(String[] args){
			int start=Integer.parseInt(args[0]);
			int end=Integer.parseInt(args[1]);
			int ummi=0;
			for(int index=start;index<end;index++){
				if(end%2==0){
				ummi=1;
			}
				}
				if(ummi==0){
				System.out.println("prime number");				
				}else{
                 System.out.println("not prime number");
				}
			
		}	
}