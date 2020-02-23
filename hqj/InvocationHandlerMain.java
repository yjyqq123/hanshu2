package Text;
import java.lang.reflect.InvocationHandler;
public class InvocationHandlerMain {
    public static void main(String[] args) throws Throwable {
        InvocationHandler invocationHandler= (o, method, objects) -> 4545;
        invocationHandler.invoke(null,null,null);
    }
}
