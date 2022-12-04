import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

public class Utils {

    public static String md5sum(String input) {

        if (Objects.nonNull(input)) {
            MessageDigest md = null;
            try {
                md = MessageDigest.getInstance("MD5");
                byte[] magnitude = md.digest(input.getBytes());
                return new BigInteger(1, magnitude).toString(16);
            } catch (NoSuchAlgorithmException nsae) {
                // ・・・
            }
        }
        return null;
    }
}
