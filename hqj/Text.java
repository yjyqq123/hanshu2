package Text;

import java.util.function.Supplier;

public class Text {
    public void text(){
        int num1 = 2020;
        int num2 = 223;
        Supplier<Integer> supplier= () -> num1 + num2;
        System.out.println(supplier.get());
    }


}
