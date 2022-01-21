class Typeint{
		public static void main(String[] args){
		//widening
		int n=12809876;
		long ll=n;
		int nn=123456;
		float fl=nn;
		int n1=1234567654;
		double d=n1;
		System.out.println(ll+"\n"+fl+"\n"+d);
		//narrowing
		long l1=1234567;
		int mn=(int)l1;
		float fll=12345.0f;
		int nm=(int)fl;
		double d1=235.11;
		int sh5=(int)d1;
		char ch='d';
		int sh6=(int)ch;
		System.out.println(l1+"\n"+fll+"\n"+d1+"\n"+sh6);

		
		}
}