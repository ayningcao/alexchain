package learn;

import com.ayning.alexchain.util.DigestUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * SHA-256算法的Java实现
 * <p>
 * created by 10127 on 2018/2/28
 */
public class Sha256 {

    @Test
    public void testSha256() {
        String plain = "I like eating";
        String str = DigestUtil.sha256(plain);
        System.out.println(str);
        Assert.assertNotNull(DigestUtil.sha256(plain));
    }


}
