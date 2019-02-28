package sometest;

import org.junit.Test;

/**
 * Created by zgg on 2019/02/24
 */

public class AnyTest {
    @Test
    public void test1() {
        Integer a = 127;
        Integer b = 127;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b); // true

        Integer c = 128;
        Integer d = 128;
        System.out.println(c);
        System.out.println(d);
        System.out.println(c == d); // false
    }

}
