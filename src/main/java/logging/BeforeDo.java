package logging;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import entity.Customer;
//把这个类声明为一个切面:需要把该类放到ioc容器中,再声明一个切面
@Aspect
@Component
public class BeforeDo {
	//声明该方法是一个前置通知:在目标方法执行前执行
	@Before("execution(public int ServiceInter.ICustomer.addCustomer(..))")
	public void beforeout(){
		System.out.println("Before Insert Customer Data");
	}
}
