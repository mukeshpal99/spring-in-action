package action.Chapter2;

import org.springframework.stereotype.Component;

/**
 * Created by mukeshpal on 31/03/18.
 */
@Component()
public class CDPlayer implements MediaPlayer{

	public CompactDisc compactDisc;

	public CDPlayer( CompactDisc disc){
		compactDisc = disc;
	}

	public void play(){
		compactDisc.play();
	};
}
