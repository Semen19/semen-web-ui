package org.example;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertEquals;

public class TriangleTest {

    Triangle correctTriangle = new Triangle(3, 4, 5);


    @Test
    public void correctTriangle() {

        double area = 6;
        assertEquals(correctTriangle.getTriangleArea(), area, 0.0);
    }

    @Test
    public void wrongTriangle() {
        final Triangle[] wrongTriangle = new Triangle[1];
        assertThatIllegalArgumentException().isThrownBy(() -> wrongTriangle[0] = new Triangle(-2, 5 ,7));
    }
}