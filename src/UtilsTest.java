import static org.junit.Assert.*;

import org.junit.Test;

public class UtilsTest {

    @Test
    public void test() {
        assertEquals("5e8ff9bf55ba3508199d22e984129be6", Utils.md5sum("sample"));
        assertNull(Utils.md5sum(null));
        assertEquals("d41d8cd98f00b204e9800998ecf8427e", Utils.md5sum(""));
        assertEquals("7215ee9c7d9dc229d2921a40e899ec5f", Utils.md5sum(" "));
        assertEquals("1920baf9665480a79df488e00e69530a", Utils.md5sum("　"));
    }

}
