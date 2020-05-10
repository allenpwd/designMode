import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author 门那粒沙
 * @create 2020-05-07 23:12
 **/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
//        StringBuffer sb = new StringBuffer();
//        Matcher matcher = Pattern.compile("(0x.*?)(?=(0x|$))").matcher(line);
//        while (matcher.find()) {
//            sb.append()
//        }
        System.out.println(new BigInteger(line.substring(2), 16).intValue());
    }
}
