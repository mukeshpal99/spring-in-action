package action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import action.Chapter2.BlankDisc;
import action.Chapter4.ConcertDisc;

/**
 * Created by mukeshpal on 28/03/18.
 */

@Configuration
@ComponentScan()
@PropertySource("app.properties")
@EnableAspectJAutoProxy
public class JavaBeanConfig {

	@Autowired
	Environment environment;

	@Bean
	public BlankDisc disc() {
		return new BlankDisc(
				environment.getProperty("disc.title"),
				environment.getProperty("disc.artist")

		);
	}

	@Bean
	public ConcertDisc concertDisc() {
		ConcertDisc concertDisc = new ConcertDisc();
		concertDisc.setTitle("Concert Title");
		concertDisc.setArtist("Concert Artist");

		List<String> tracks = new ArrayList<String>();
		tracks.add("Tract 1");
		tracks.add("Tract 2");
		tracks.add("Tract 3");
		tracks.add("Tract 4");
		tracks.add("Tract 5");
		concertDisc.setTracks(tracks);

		return concertDisc;
	}
}
