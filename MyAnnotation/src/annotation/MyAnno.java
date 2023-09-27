package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})		//To specify where to use a specify annotation
@Retention(RetentionPolicy.RUNTIME)					//Annotation to get actived at runtime
@interface MyAnno{
	
//	int id=0;
//	String name="XYZ";
//	String city="Mumbai";
	
	int id() default 10;
	String name() default "XYZ";
	String city = "Mumbai";
	
	
}