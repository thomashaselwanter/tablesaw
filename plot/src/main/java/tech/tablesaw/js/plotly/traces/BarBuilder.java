package tech.tablesaw.js.plotly.traces;

import tech.tablesaw.js.plotly.components.TraceBuilder;

public class BarBuilder extends TraceBuilder {

    String type = "bar";
    String barMode;
    String barGap;
    Object[] x;
    double[] y;

    BarBuilder(Object[] x, double[] y) {
        this.x = x;
        this.y = y;
    }

    public BarBuilder barMode(String barMode) {
        this.barMode = barMode;
        return this;
    }

    public BarBuilder barGap(String barGap) {
        this.barGap = barGap;
        return this;
    }

    String barMode() {
        return barMode;
    }

    String barGap() {
        return barGap;
    }

    public BarPlot build() throws Exception {
        return new BarPlot(this);
    }

    @Override
    protected String getType() {
        return type;
    }
}
