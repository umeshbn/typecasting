class TypeCastlong{
		public static void main(String[] args){
		long l=9876;
		float fl=l;
		long ll=98765;
		double dd=ll;
		System.out.println(fl+"\n"+dd);
		//narrowing
		long num=100;
		byte data=(byte)num;
		short data1=(short)num;
		int data2=(int)num;
		float data3=(float)num;
		double data4=(double)num;
		char data5=(char)num;
		System.out.println(data+" "+data1+" "+data2+" "+data3+" "+data4+" "+data5);
		
		
		}
}

