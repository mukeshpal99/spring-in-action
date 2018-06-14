package action.Chapter4;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by mukeshpal on 14/06/18.
 */
@Component()
@Aspect
public class CriticAspect {

	@Pointcut("execution(* action.Chapter4.ConcertDisc.playTrack(int)) && args(trackNumber)")
	public void critisism(int trackNumber){};

	@AfterReturning("critisism(trackNumber)")
	public void giveFeedback(int trackNumber){
		//int playCount=
		System.out.println("best song of the year");
	}
}
