/*
 * Created on 18 de octubre de 2013, 01:22 PM
 */
 
package page;           

import org.apache.wicket.protocol.http.WebApplication;

/** 
 *
 * @author Luis Alfredo Moctezu
 * @version 
 */

public class Application extends WebApplication {

    public Application() {
    
    }
    public Class getHomePage() {
       return index.class;
       //   return ahorro.dondecomprar.class;
    }

}
