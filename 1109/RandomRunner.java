public class RandomRunner
{
	public static void main(String[] args)
	{
		System.out.println((int)(Math.random()*11));
		System.out.println((int)(Math.random()*10+1));
		System.out.println((int)(Math.random()*11+5));
		System.out.println((int)(Math.random()*3+27));
		
		RandomTest r = new RandomTest(4,19);
		System.out.println(r.getRandom());
		System.out.println(r.getRandomMax());
		r.setRange(91,102);
		System.out.println(r.getRandom());
		System.out.println(r.getRandomMax());
		double dec = (double)(r.randomDecimal());
		System.out.println(dec/10);
	}
}