package action.Chapter2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import  org.springframework.stereotype.Component;

/**
 * Created by mukeshpal on 28/03/18.
 */


@Component()
@Qualifier("compact_disc")
public class CompactDisc implements Disc{

	String title;
	String artist;

	List<String> tracks = new ArrayList<String>();

	public CompactDisc(){
		System.out.println("Creating compact disc Bean");
	}

	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title;
	}


	public String getArtist(){
		return this.artist;
	}

	public void setArtist(String artist){
		this.artist = artist;
	}


	public List<String> getTracks(){
		return this.tracks;
	}

	public void setTracks(List<String> tracks){
		this.tracks = tracks;
	}
	public void play() {
		System.out.println("Playing: "+ title+" by "+artist);
	}

}
