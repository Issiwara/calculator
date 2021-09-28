package com.company.v5.Operations;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.*;

public class AddOperationTest {

    // Cases
    //5,6=>11
    //0,0=>0

    //positive n
    //0+0
    //negative+negative
    //negative+positive
    @Test
    public void should_add_positive_values()
    {
        AddOperation addOperation = new AddOperation();
        Double result = addOperation.execute(new Double[]{5.0,6.0});

        assertThat(result, is(11.0));

    }

    @Test
    public void should_add_zeros()
    {
        AddOperation addOperation = new AddOperation();
        Double result = addOperation.execute(new Double[]{0.0,0.0});

        assertThat(result, is(0.0));

    }

    @Test
    public void should_add_negative_values()
    {
        AddOperation addOperation = new AddOperation();
        Double result = addOperation.execute(new Double[]{-2.0,-6.0});

        assertThat(result, is(-8.0));

    }



}