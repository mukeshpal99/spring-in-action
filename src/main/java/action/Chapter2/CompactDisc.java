package action.Chapter2;

import  org.springframework.stereotype.Component;

/**
 * Created by mukeshpal on 28/03/18.
 */


@Component()
public class CompactDisc {

	String title = "song title";
	String artist = "song artist";

	public void play() {
		System.out.println("Playing: "+ title+" by "+artist);
	}
}
