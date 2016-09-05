package logging;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
//把这个类声明为一个切面:需要把该类放到ioc容器中,再声明一个切面
@Aspect
@Component
public class AfterDo {
	//后置通知:在目标方法执行后执行,无论是否发生异常 都执行,不能获得执行结果
	@After("execution(public int ServiceImpl.CustomerImpl.addCustomer(..))")
	public void afterdoout(){
		System.out.println("After Insert Customer Data");
	}
}
