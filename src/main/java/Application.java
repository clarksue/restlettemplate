import org.restlet.Component;
import org.restlet.data.Protocol;

public class Application {
    public static void main(String[] args) {
        // Create a new Restlet component and add a HTTP server connector to it
        Component component = new Component();
        component.getServers().add(Protocol.HTTP, 8182);

        // Then attach it to the local host
        component.getDefaultHost().attach("/users/{user}", UserResource.class);

        // Now, let's start the component!
        // Note that the HTTP server connector is also automatically started.
        try {
            component.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
