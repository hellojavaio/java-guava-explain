package edu.maskleo.guava.test.basic;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import org.junit.Assert;
import org.junit.Test;

public class OptionalTest {

    /**
     *  避免 null 可能错误使用而提出
     *
     *  eg: 在 HashMap 中 value 为 null, 可能是没有找到对应的值, 或者这个值本来就是 null
     */
    @Test
    public void optionalTest01() {
        Optional<Integer> optional = Optional.of(1);
        Assert.assertTrue(optional.isPresent());
        Assert.assertTrue(1 == optional.get());
        Assert.assertTrue(2 == MoreObjects.firstNonNull(null, 2));
    }
}
