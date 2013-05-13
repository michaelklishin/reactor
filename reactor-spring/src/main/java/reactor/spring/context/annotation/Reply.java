package reactor.spring.context.annotation;

import java.lang.annotation.*;

/**
 * Indicate a method return is to be sent to the key referenced by the given expression.
 *
 * @author Jon Brisbin
 */
@Target({
						ElementType.METHOD
				})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Reply {

	/**
	 * An expression which evaluates to a key to which is sent the method return value.
	 *
	 * @return The expression.
	 */
	String value();

}
