package Text;

import java.util.stream.Stream;

public class Steam {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("HQQQ", "WWW", "HNN", "dhhoo", "aaaa");
         //查找所有包含t的元素并进行打印
        s.filter(n -> n.contains("H")).forEach(System.out::println);
    }
}
