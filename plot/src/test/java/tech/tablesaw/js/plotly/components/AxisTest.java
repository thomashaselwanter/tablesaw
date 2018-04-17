package tech.tablesaw.js.plotly.components;

import org.junit.Test;

import static org.junit.Assert.*;

public class AxisTest {

    @Test
    public void asJavascript() {
        Axis x = Axis.builder()
                .title("x Axis 1")
                .visible(true)
                .type(Axis.Type.DEFAULT)
                .titleFont(Font.builder()
                        .family(Font.Family.ARIAL)
                        .size(8)
                        .color("red")
                        .build())
                .build();

        System.out.println(x.asJavascript());
    }
}