package action.Chapter4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by mukeshpal on 12/06/18.
 */
@Component()
@Qualifier("concert_disc")
public class ConcertDisc{

	String title;
	String artist;

	List<String> tracks = new ArrayList<String>();

	public ConcertDisc(){
		System.out.println("Creating concert disc Bean");
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
	public void playTrack(int trackNumber) {
		System.out.println("Playing: "+ title+" by "+artist+" Track Number: "+trackNumber);
	}

}
