package tech.tablesaw.js.plotly;

import org.junit.Test;

public class ScatterTest {

    @Test
    public void show() throws Exception {

        Scatter plot = new ScattterBuilder()
                .type("scatter")
                .mode("markers")
                .build();
        plot.show();
    }
}