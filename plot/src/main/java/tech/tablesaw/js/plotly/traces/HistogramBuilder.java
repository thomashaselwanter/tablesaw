package tech.tablesaw.js.plotly.traces;

import tech.tablesaw.js.plotly.components.TraceBuilder;

public class HistogramBuilder extends TraceBuilder {

    String type = "histogram";
    int bins;
    String barMode;
    String histFunction;
    String histNorm;
    double[] x;

    public HistogramBuilder(double[] values) {
        this.x = values;
    }

    public HistogramBuilder setBins(int bins) {
        this.bins = bins;
        return this;
    }

    public HistogramBuilder barMode(String barMode) {
        this.barMode = barMode;
        return this;
    }

    public HistogramBuilder histFunction(String histFunction) {
        this.histFunction = histFunction;
        return this;
    }

    public HistogramBuilder histNorm(String histNorm) {
        this.histNorm = histNorm;
        return this;
    }

    public Histogram build() {
        return new Histogram(this);
    }

    @Override
    protected String getType() {
        return type;
    }
}
