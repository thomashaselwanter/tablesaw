package tech.tablesaw.js.plotly.components;

import org.junit.Test;

import static org.junit.Assert.*;

public class LayoutTest {

    @Test
    public void asJavascript() {

        Axis x = Axis.builder().title("A test").build();
        String xAxis = x.asJavascript();

        Layout layout = Layout.builder()
                .title("foobar")
                .xAxis(x)
                .build();
        System.out.println(layout.asJavascript());
    }
}