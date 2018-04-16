package tech.tablesaw.js.plotly;

import org.junit.Test;

public class PlotTest {

    @Test
    public void show() throws Exception {

        Plot plot = new PlotBuilder("../data/bush.csv")
                .title("Chart Title")
                .windowTitle("Window Title")
                .type("scatter")
                .mode("markers")
                .build();
        plot.show();
    }
}