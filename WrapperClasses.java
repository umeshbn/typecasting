class WrapperClasses{
			public static void main(String[] umesh){
			
			String num="45";
			int sum=Integer.parseInt(num);
			String sub="23";
			byte sum1=Byte.parseByte(sub);
			String sub1="23";
			short sum2=Short.parseShort(sub1);
			String num1="2345";
			long summer=Long.parseLong(num1);
			String win="288";
			float winter=Float.parseFloat(win);
			String rain="23";
			double fall=Double.parseDouble(rain);
			String rain1="23";
			boolean fall2=Boolean.parseBoolean(rain1);
			String ch="umesh";
			char cha=ch.charAt(0);
			System.out.println(sum+"\n"+sum1+"\n"+sum2+"\n"+summer+"\n"+winter+"\n"+fall+"\n"+fall2+"\n"+cha);
				System.out.println("@@@@@@@ USING STRING ARGUMENTS PASSING VALUES AT RUN TIME @@@@@@@");	
					for(int index=0;index<umesh.length;index++){
						byte gossip=Byte.parseByte(umesh[index]);
						short goss1=Short.parseShort(umesh[index]);
						int  goss2=Integer.parseInt(umesh[index]);
						long goss3=Long.parseLong(umesh[index]);
						float goss4=Float.parseFloat(umesh[index]);
						double dd=Double.parseDouble(umesh[index]);
						boolean bb=Boolean.parseBoolean(umesh[index]);
						char chaa=umesh[index].charAt(0);
						System.out.println(gossip+""+goss1+""+goss2+""+goss3+""+goss4+""+dd+""+bb+""+chaa);	
					}

			}
}