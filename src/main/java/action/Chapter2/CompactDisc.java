package action.Chapter2;

import org.springframework.beans.factory.annotation.Qualifier;
import  org.springframework.stereotype.Component;

/**
 * Created by mukeshpal on 28/03/18.
 */


@Component()
@Qualifier("compact_disc")
public class CompactDisc implements Disc{

	String title = "song title";
	String artist = "song artist";

	public CompactDisc(){
		System.out.println("Creating compact disc Bean");
	}

	public void play() {
		System.out.println("Playing: "+ title+" by "+artist);
	}

}
