public class StringTest{
	String word;
	StringTest(String word){
		this.word = word;
	}
	public char getFirstLetter(){
		return word.charAt(0);
	}
	public char getLastLetter(){
		return word.charAt(word.length()-1);
	}
	public void printWordGame(){
		System.out.print(getFirstLetter());
		for(int i = 1; i < word.length()-1;i++)
			System.out.print("*");
		System.out.print(getLastLetter());
		
	}
}