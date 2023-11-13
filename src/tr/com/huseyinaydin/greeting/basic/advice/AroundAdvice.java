
package tr.com.huseyinaydin.greeting.basic.advice;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework AOP.
* 
*/

public class AroundAdvice implements MethodInterceptor{

//	@Override
//	public Object invoke(MethodInvocation invocation) throws Throwable {
//		System.out.print("Hüseyin ");
//		Object returnedValue = invocation.proceed(); 
//		System.out.println(", nöğĞrüyon?");
//		return returnedValue;
//	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.err.println("\n- Kesilem metodun öncesi başlangıcı -");
		Method method = invocation.getMethod();
		System.err.println("Kesilen metodun adı: " + method.getName());
		System.err.println("Kesilen metodun içinde bulunduğu sınıfının adı: " + invocation.getClass().getName());
		Object[] args = invocation.getArguments();
		int length = args.length;
		System.err.println("Kesilen metdun " + length + " adet argümanı yani parametreleri var.");
		System.err.println("Kesilen metod öncesi işlemleri bitiverdi gitti şimdi ise ilgili kesilen metod çalıştırılıyor....");
		Object returnedValue = invocation.proceed(); 
		System.err.println("\nKesilen metot bitince return eder burası return ettikten sonrasıdır.");
		System.err.println("Return edilen değer yahut referans: " + returnedValue);
		System.err.println("Return etme işlemi bitişi.");
		System.err.println("Return ettikten sonrası başlangıcı.");
		return returnedValue;
	}
}