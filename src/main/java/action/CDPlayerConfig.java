package action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import action.Chapter2.BlankDisc;

/**
 * Created by mukeshpal on 28/03/18.
 */

@Configuration
@ComponentScan()
@PropertySource("app.properties")
public class CDPlayerConfig {

	@Autowired
	Environment environment;

	@Bean
	public BlankDisc disc(){
		return new BlankDisc(
			environment.getProperty("disc.title"),
			environment.getProperty("disc.artist")

		);
	}

	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
		return  new PropertySourcesPlaceholderConfigurer();
	}


}
