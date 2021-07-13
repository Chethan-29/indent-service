package com.dxc.eproc.tender;

import com.dxc.eproc.tender.IndentServiceApp;
import com.dxc.eproc.tender.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { IndentServiceApp.class, TestSecurityConfiguration.class })
public @interface IntegrationTest {
}
