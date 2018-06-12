package action.Chapter4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by mukeshpal on 31/03/18.
 */
@Component()
public class CDPlayer4 {

	@Autowired
	@Qualifier("concert_disc")
	public ConcertDisc disc;
	public TrackCounter counter;

	public CDPlayer4(ConcertDisc disc){
		this.disc = disc;
	}

	public void play(){
		disc.playTrack(1);
		disc.playTrack(2);
		disc.playTrack(2);
		disc.playTrack(3);
		disc.playTrack(3);
		disc.playTrack(3);
		disc.playTrack(4);
		disc.playTrack(4);
		disc.playTrack(5);
	}



}
