package tech.tablesaw.js.plotly;

public class HistogramBuilder extends ScattterBuilder {

    private int bins;
    private String barMode;
    private String histFunction;
    private String histNorm;

    public HistogramBuilder setBins(int bins) {
        this.bins = bins;
        return this;
    }

    public HistogramBuilder barMode(String barMode) {
        this.barMode = barMode;
        return this;
    }

    public ScattterBuilder histFunction(String histFunction) {
        this.histFunction = histFunction;
        return this;
    }

    public ScattterBuilder histNorm(String histNorm) {
        this.histNorm = histNorm;
        return this;
    }

    String histFunction() {
        return histFunction;
    }

    String histNorm() {
        return histNorm;
    }

    int bins() {
        return bins;
    }

    String barMode() {
        return barMode;
    }
}
