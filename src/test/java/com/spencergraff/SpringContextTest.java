package com.spencergraff;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.spencergraff.ecommercedemo.EcommerceDemoApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EcommerceDemoApplication.class)
public class SpringContextTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}
