class Swap{
		public static void main(String[] args){
		 int a=Integer.parseInt(args[0]);
		 int b=Integer.parseInt(args[1]);
		System.out.println("before swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
			a=a+b;
			b=a-b;
			a=a-b;
		System.out.println("after swap");
		System.out.println("a="+a);
		System.out.println("b="+b);
		}
}
