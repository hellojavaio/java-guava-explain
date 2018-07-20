package edu.maskleo.guava.test.basic;

import com.google.common.base.Preconditions;
import org.junit.Test;

public class PreconditionsTest {

    @Test
    public void preconditionsTest01(){
        Preconditions.checkArgument(true);
    }
}
