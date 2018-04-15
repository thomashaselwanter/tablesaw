package tech.tablesaw.js.plotly;

import java.io.IOException;

public class BarPlot extends Plot {

    BarPlot(PlotBuilder builder) throws Exception {
        super(builder);
    }

    public static BarBuilder builder(String fileName) throws IOException {
        return new BarBuilder(fileName);
    }
}
