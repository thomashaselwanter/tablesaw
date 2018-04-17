package tech.tablesaw.js.plotly.traces;

import tech.tablesaw.js.plotly.components.TraceBuilder;

public class BarBuilder extends TraceBuilder {

    private String type = "bar";
    Object[] x;
    double[] y;

    BarBuilder(Object[] x, double[] y) {
        this.x = x;
        this.y = y;
    }

    public BarPlot build() throws Exception {
        return new BarPlot(this);
    }

    @Override
    protected String getType() {
        return type;
    }
}
