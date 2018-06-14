package action.Chapter2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by mukeshpal on 05/05/18.
 */
@Qualifier("blank_disc")
@Component()
public class BlankDisc implements Disc{

	String title;
	String artist;


	public BlankDisc(
			@Value("${disc.title}") String title,
			@Value("${disc.artist}") String artist){

		System.out.println("Creating Custom Blank disc Bean");
		this.title=title;
		this.artist=artist;
	};

	public BlankDisc(){
		System.out.println("Creating Blank disc Bean");
	}
	public void play(){
		System.out.println("Playing: "+ title+" by "+artist);
	};

}
