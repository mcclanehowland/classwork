import  java.util.ArrayList;

public class Runner
{
	public static void main(String args[])
	{
		//What do you have to import to use ArrayList
        //java.util.ArrayList		
		//What do you think the ? is in ArrayList< ? > represents?
        //data type of the arraylist
		ArrayList<Song> songList1 = new ArrayList<Song>();
        ArrayList<Song> songList2 = new ArrayList<Song>();
        songList2.add(new Song("Adele","hello"));
        songList2.add(new Song("thing","song"));
        songList2.add(new Song("this","what"));
        songList2.add(new Song("usher","happy"));
        songList2.add(new Song("other","days"));

        System.out.println(songList2.get(0));
        System.out.println(songList2.get(songList2.size()-1));
        System.out.println();
        for(int i = 0; i < songList2.size();i++) {
            System.out.println(songList2.get(i));
        }
        System.out.println();
        for(Song each : songList2) {
            System.out.println(each);
        }
        System.out.println();
        songList2.set(0,new Song("hola","adele"));
        for(Song each : songList2) {
            System.out.println(each);
        }
        System.out.println();
        Song temp = songList2.get(0);
        songList2.set(0,songList2.get(4));
        songList2.set(4,temp);
        for(Song each : songList2) {
            System.out.println(each);
        }




        
		
		//What do you think the method add() does?
        //adds a new song to the arraylist
		songList1.add(new Song("John", "Happy"));
		songList1.add(new Song("Jose", "Sad"));
		
		//What do you think the method get() does?
		//What method gets called by default when you don't use getName() ?
        //get(int) returns the item at that index of the array
		System.out.println();
		System.out.println( songList1.get(0).getName() );
		System.out.println( songList1.get(1).getName() );
		System.out.println( songList1.get(0) );
		System.out.println( songList1.get(1) );
		
		//What do you think the method set() does?
        //sets the index of the first number to the value of the second argument
		System.out.println();
		songList1.set(1, new Song("Jen", "Happy Days") );
		System.out.println( songList1.get(1) );
		
		
		//Print the size of songList1 using a method of the ArrayList class.
		//Look at the documentation on ArrayList on the internet.
        System.out.println("Size: "+songList1.size());

	
		
		//Do you ever have to set the size of an ArrayList?
        //no.
		
		//What is an advantage of using an ArrayList versus a regular Array.
        //you can add and remove elements of the array


		
		
		
		
	}
}
