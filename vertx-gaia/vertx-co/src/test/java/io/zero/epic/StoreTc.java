package io.zero.epic;

import io.vertx.ext.unit.TestContext;
import io.zero.quiz.StoreBase;
import org.junit.Test;

public class StoreTc extends StoreBase {

    @Test
    public void testJson(final TestContext context) {
        this.execJObject("test.json", config -> {
            this.getLogger().info("[T] {0}", config.result().encode());
            context.assertTrue(config.succeeded());
        });
    }

    @Test
    public void testProp(final TestContext context) {
        this.execProp("test.properties", config -> {
            this.getLogger().info("[T] {0}", config.result().encode());
            context.assertTrue(config.succeeded());
        });
    }
}
