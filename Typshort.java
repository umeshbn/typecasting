class Typshort{
	public static void main(String[] args){
	//widening
	short sh=99;
	int nn=sh;
	short sh1=3261;
	long ll=sh1;
	short sh2=3199;
	float ff=sh2;
	short sh3=2999;
	double dd=sh3;
	System.out.println(nn+"\n"+ll+"\n"+ff+"\n"+dd+"\n"+dd);
	System.out.println("narrowing");
	int n=888;
	short shh=(short)n;
	long lll=2345;
	short shhh=(short)lll;
	float fl=234.4f;
	short sh4=(short)fl;
	double d1=235.11;
	short sh5=(short)d1;
	char ch='d';
	short sh6=(short)ch;
		System.out.println(shh+"\n"+shhh+"\n"+sh4+"\n"+sh5+"\n"+sh6);

	}

}