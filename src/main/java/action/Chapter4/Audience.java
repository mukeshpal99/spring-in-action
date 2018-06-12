package action.Chapter4;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by mukeshpal on 31/05/18.
 */
@Aspect
public class Audience {


	@Pointcut("execution(** Chapter4.Performance.perform(..))")
	public void performance(){};

	@Before("performance()")
	public void silenceCellPhones(){
		System.out.println("Silence ur cell phones");
	}

	@AfterReturning("performance()")
	public void applause(){
		System.out.println("CLap clap clap");
	}

	@AfterThrowing("performance()")
	public void demandRefund(){
		System.out.println("demand a refund");
	}
}
