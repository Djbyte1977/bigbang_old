package org.javaee7.sample;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;
import java.util.HashSet;
import org.javaee7.sample.PersonDatabase;

@ApplicationPath("/resources")
public class MyApplication extends Application {

private Set<Class<?>> classes = new HashSet<Class<?>>();

public MyApplication(){
        classes.add(PersonDatabase.class); 
   }
}
