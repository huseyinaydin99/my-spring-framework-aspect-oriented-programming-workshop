package tr.com.huseyinaydin.sqrt.aspectJ.domain;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework AOP.
* 
*/

public class Counter {

	private volatile boolean flag = true;
	private int count;

	public void start() {
		Runnable runnable = () -> {
		while(flag)
			count++;
		};
		new Thread(runnable).start();
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getCount() {
		return count;
	}
}