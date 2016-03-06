public class Test {
	public String doubleChar(String str) {
		String s = "";
  		for(int i = 0; i < str.length(); i++) {
			s = s+""+str.charAt(i)+""+str.charAt(i);
		}
		return s;
	}
		
	
}
