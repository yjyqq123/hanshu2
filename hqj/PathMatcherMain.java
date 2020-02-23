package Text;
import java.nio.file.PathMatcher;
public class ActionListenerMain {
    public static void main(String[] args) {
        PathMatcher pathMatcher= path -> true;
            pathMatcher.matches(null);
        }
    }
