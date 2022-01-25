class ReverseNumber{
		public static void main(String[] args){
		int number=Integer.parseInt(args[0]); 
		int reverse=0;
		int reminder;
		for(int index=number;index!=0;index=index/10){
		 reminder=index%10;
		reverse=reverse*10+reminder;
		}
			System.out.println(reverse);
		}
}