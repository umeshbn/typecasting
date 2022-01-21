class TypeCastingDouble{
	public static void main(String ar[]){
		//widening 
		double data=35.6;
		//narrowing
		byte number=(byte)data;
		short num=(short)data;
		int num1=(int)data;
		long longNum=(long)data;
		float fnum=(float)data;
		char ch=(char)data;
		System.out.println(number+"\n "+num+"\n "+num1+" \n"+longNum+"\n "+fnum+"\n "+ch);
	}
}