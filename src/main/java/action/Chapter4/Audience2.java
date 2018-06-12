package action.Chapter4;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by mukeshpal on 31/05/18.
 */
@Aspect
public class Audience2 {


	@Pointcut("execution(** Chapter4.Performance.perform(..))")
	public void performance(){};

	@Around("performance()")
	public void watchPeformance(ProceedingJoinPoint jp){
		try{
			System.out.println("Silence ur cell phones");
			jp.proceed();
			System.out.println("CLap clap clap");
		}catch (Throwable e){
			System.out.println("demand a refund");
		}
	}
}
