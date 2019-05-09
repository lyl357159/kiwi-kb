package com.kiwi.kb.test.api;

import com.kiwi.kb.common.util.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by liulu on 2019/5/9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles(profiles = "")
public class StringUtilsTest {

    @Test
    public void strToIntTest(){
        String str = "123S";
        System.out.println("------------------" + StringUtils.strToIntDef(str,321) + "-------------------");
    }
}
