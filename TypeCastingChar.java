class TypeCastingChar{
	public static void main(String args[]){
		char value='U';
		int data=value;
		long ldata=value;
		float fdata=value;
		double dData=value;
		System.out.println(data+" \n"+ldata+"\n "+fdata+"\n "+dData);
		
		//narrowing
		byte b=(byte)value;
		short s=(short)value;
		int i=(int)value;
		long l=(long)value;
		float f=(float)value;
		double d=(double)value;
		System.out.println(b+"\n "+s+" \n"+i+"\n "+l+"\n "+f+"\n "+d);
	}
} 