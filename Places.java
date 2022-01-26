class Places{
		
		static String printAll(String name){
			System.out.println(name);
			return printAll(); 
		}
		public static void main(String[] rgs){
		String res=printAll("umesh");
	     System.out.println(res);
		
		} 
}