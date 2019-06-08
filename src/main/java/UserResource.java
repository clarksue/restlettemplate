import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class UserResource extends ServerResource {
    String userName;

    Object user;

    @Override
    public void doInit() {
        this.userName = getAttribute("user");
        this.user = null; // Could be a lookup to a domain object.
    }

    @Get("txt")
    public String toString() {
        return "Account of user \"" + this.userName + "\"";
    }
}