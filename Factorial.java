class Factorial{
		public static void main(String[] args){
		int fact=1;
		 int num=Integer.parseInt(args[0]);
		for(int index=1;index<num;index++){
		fact=fact*index;
		}	
		System.out.println(fact);
		}
}