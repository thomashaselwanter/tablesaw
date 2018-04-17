package tech.tablesaw.js.plotly.components;

import org.junit.Test;

import static org.junit.Assert.*;

public class LayoutTest {

    @Test
    public void asJavascript() {
        Layout layout = Layout.builder()
                .title("foobar")
                .build();
        System.out.println(layout.asJavascript());
    }
}