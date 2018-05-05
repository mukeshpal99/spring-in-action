package action.Chapter3;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by mukeshpal on 26/04/18.
 */

public class MagicExistCondition implements Condition {

	public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
		Environment environment = conditionContext.getEnvironment();
		return environment.containsProperty("magic");
	}
}
