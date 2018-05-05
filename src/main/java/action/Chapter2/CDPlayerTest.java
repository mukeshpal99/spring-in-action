package action.Chapter2;

import static org.testng.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import action.CDPlayerConfig;

/**
 * Created by mukeshpal on 28/03/18.
 */

@ContextConfiguration(classes = CDPlayerConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class CDPlayerTest {

	private AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
 	//ctx.register(CDPlayerConfig.class);
 	//ctx.refresh();

	@Autowired
	private CompactDisc compactDisc;

	@Test
	public void test() {
		System.out.println("Bean ID: "+compactDisc);
		assertNotNull(compactDisc);

	}


}
