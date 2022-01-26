class Airoplane{
			int tickectPrice;
			String type;
		
		Airoplane(){
		this();	
		}
		Airoplane(int tickectPrice,String type){
		this();
		this.tickectPrice=tickectPrice;
		this.type=type;
		}
		public static void main(String[] args){
		Airoplane um=new Airoplane(23,"first");
			System.out.println(um.tickectPrice+"\t"+um.type);
		}
}