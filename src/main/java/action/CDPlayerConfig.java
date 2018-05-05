package action;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import action.Chapter3.MagicBean;
import action.Chapter3.MagicExistCondition;

/**
 * Created by mukeshpal on 28/03/18.
 */

@Configuration
@ComponentScan()
public class CDPlayerConfig {

	/*@Bean
	public CompactDisc compactDisc() {
		return new CompactDisc();
	}

	@Bean(name="cDPlayer")
	public CDPlayer cdPlayer(){
		return new CDPlayer(compactDisc());
	}

	@Bean(name="anotherCdPlayer")
	public CDPlayer anotherCdPlayer(){
		return new CDPlayer(compactDisc());
	}*/
}
