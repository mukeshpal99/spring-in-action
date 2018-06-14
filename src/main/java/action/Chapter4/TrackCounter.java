package action.Chapter4;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by mukeshpal on 01/06/18.
 */
@Aspect
@Component()
@Qualifier("track_counter")
public class TrackCounter {

	private Map<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();

	@Pointcut("execution(* action.Chapter4.ConcertDisc.playTrack(int)) && args(trackNumber)")
	public void trackPlayed(int trackNumber){}

	@Before("trackPlayed(trackNumber)")
	public void countTrack(int trackNumber){
		System.out.println("counting the playcount of track: "+trackNumber);
		int currentCount = getPlayCount(trackNumber);
		trackCounts.put(trackNumber, currentCount+1);

	}


	public int getPlayCount(int trackNumber){

		return trackCounts.containsKey(trackNumber)? trackCounts.get(trackNumber): 0;
	}
}
