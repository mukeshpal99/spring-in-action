package action.Chapter2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by mukeshpal on 05/05/18.
 */
@Component
@Qualifier("blue_ray_disc")
public class BlueRayDisc implements Disc {

	String title;
	String artist;

	public BlueRayDisc(
			@Value("#{systemProperties['disc.title']}") String title,
			@Value("#{systemProperties['disc.artist']}") String artist){
		this.title=title;
		this.artist=artist;
	}


	public void play() {
		System.out.println("Playing: "+ title+" by "+artist);
	}
}
