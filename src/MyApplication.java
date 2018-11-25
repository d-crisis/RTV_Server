import API.*;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

//Defines the base URI for all resource URIs.
@ApplicationPath("/")
//The java class declares root resource and provider classes
public class MyApplication extends Application{
    /**
     * @return
     */
    //The method returns a non-empty collection with classes, that must be included in the published JAX-RS application
    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add( apiEuropa.class );
        h.add( apiAfrica.class );
        h.add( apiAsia.class );
        h.add( apiSudAmerica.class );
        h.add( apiUSA.class );
        return h;
    }
}
