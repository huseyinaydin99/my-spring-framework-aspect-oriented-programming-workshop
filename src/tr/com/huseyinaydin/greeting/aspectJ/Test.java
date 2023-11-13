package tr.com.huseyinaydin.greeting.aspectJ;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework AOP.
* 
*/

public class Test {

	public static void main(String[] args) {
		Merhaba merhaba = new Selam("Selamun Aleyküm");
		System.out.println(merhaba.test());
	}
}
abstract class Merhaba{
	private String deger;

	protected Merhaba(String deger) {
		super();
		this.deger = deger;
	}
	
	public abstract String test();
	
	public String hello() {
		return "Hello";
	}

	public String getDeger() {
		return deger;
	}
}

class Selam extends Merhaba{
	public Selam(String deger) {
		super(deger);
	}

	@Override
	public String test() {
		return "Hüseyin: " + this.getDeger();
	}
}