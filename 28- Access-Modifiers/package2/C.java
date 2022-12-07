package package2;
import package1.*;

public class C {
    
    //When there is no modifier, it is only visible withing the same package
    String defaultMessage = "This is the default";

    //When there is a public modifier it is visible withing every package in the project
    public String publicMessage = "This is public";

    //It is accessible as long as the class is a sub class even if it is a different package
    protected String protectedMessage = "This is protected";

    //IT is only visible to the class it is in
    private String privateMessage = "This is a private message";

}
