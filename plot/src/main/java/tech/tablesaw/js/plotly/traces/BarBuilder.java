package tech.tablesaw.js.plotly.traces;

import tech.tablesaw.js.plotly.components.TraceBuilder;

public class BarBuilder extends TraceBuilder {

    private String type = "bar";
    private String barMode;
    private String barGap;

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
