package tech.tablesaw.js.plotly;

import tech.tablesaw.api.Table;

import java.io.IOException;

public class BarPlot extends Scatter {

    BarPlot(ScattterBuilder builder) throws Exception {
        super(builder);
    }

    public static BarBuilder builder(String fileName) throws IOException {
        Table table = Table.read().csv(fileName);
        return new BarBuilder();
    }
}
