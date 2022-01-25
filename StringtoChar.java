class StringtoChar{

    public static void main(String[] args){
	String umesh=args[0];
	char arr[]=new char[umesh.length()];
		for(int index=0;index<umesh.length();index++){
			arr[index]=umesh.charAt(index);
			System.out.println("chatAt "+ index +" "+"is:"+ arr[index]);
		}
	}

}