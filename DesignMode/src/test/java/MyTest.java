import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 门那粒沙
 * @create 2019-05-23 10:05
 **/
public class MyTest {

    @Test
    public void test() {
        String str = "3453253";
        String regex = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
        Matcher matcher = Pattern.compile(regex).matcher(str);
        System.out.println(matcher.find());

        regex = "^(?!\\d+&)";
        matcher = Pattern.compile(regex).matcher(str);
        System.out.println(matcher.find());
        System.out.println(str.matches(regex));
    }
}
