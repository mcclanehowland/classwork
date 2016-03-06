public class Runner2 {
	public static void main(String[] args) {
		System.out.println("test");
		Split sp = new Split("john.smith@mvla.net");
		String name = sp.getName();
		System.out.println(name);
		String domain = sp.getDomain();
		System.out.println(domain);
		System.out.println(sp.getLastNameMVLA("jane.doe@mvla.net"));
		System.out.println(sp);
	}
}