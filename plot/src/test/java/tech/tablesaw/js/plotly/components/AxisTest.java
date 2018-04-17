package tech.tablesaw.js.plotly.components;

import org.junit.Test;

import static org.junit.Assert.*;

public class AxisTest {

    @Test
    public void asJavascript() {
        Axis x = Axis.builder().title("x Axis 1").build();

        System.out.println(x.asJavascript());
    }
}