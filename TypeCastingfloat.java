class TypeCastingfloat{
	public static void main(String args[]){
		float fvalue=244.5f;
		double dData=fvalue;
		System.out.println(dData);
		//narrowing
		byte b=(byte)fvalue;
		short s=(short)fvalue;
		int i=(int)fvalue;
		long l=(long)fvalue;
		double d=(double)fvalue;
		char ch=(char)fvalue;
		System.out.println(b+"\n "+s+"\n "+i+"\n "+l+" \n"+d+"\n "+ch);
	}
}