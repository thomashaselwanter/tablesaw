package tech.tablesaw.js.plotly.traces;

import tech.tablesaw.api.Table;
import tech.tablesaw.js.plotly.components.AbstractTrace;

import java.io.IOException;

public class BarPlot extends AbstractTrace {

    BarPlot(BarBuilder builder) throws Exception {
        super(builder);
    }

    public static BarBuilder builder(String fileName) throws IOException {
        Table table = Table.read().csv(fileName);
        return new BarBuilder();
    }

    @Override
    public String asJavascript(int i) {
        return null;
    }
}
