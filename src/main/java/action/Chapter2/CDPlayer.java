package action.Chapter2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by mukeshpal on 31/03/18.
 */
@Component()
public class CDPlayer {

	@Autowired
	@Qualifier("blank_disc")
	public Disc disc;

	public CDPlayer( Disc disc){
		this.disc = disc;
	}

	public void play(){
		disc.play();
	}

}
