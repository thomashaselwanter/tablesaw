package tech.tablesaw.js.plotly;

import java.io.File;
import java.io.IOException;

public class HistogramBuilder extends PlotBuilder {

    private int bins;
    private String barMode;
    private String histFunction;
    private String histNorm;

    public HistogramBuilder(String fileName) throws IOException {
        super(fileName);
    }

    public HistogramBuilder(File file) throws IOException {
        super(file);
    }

    public HistogramBuilder setBins(int bins) {
        this.bins = bins;
        return this;
    }

    public HistogramBuilder barMode(String barMode) {
        this.barMode = barMode;
        return this;
    }

    public PlotBuilder histFunction(String histFunction) {
        this.histFunction = histFunction;
        return this;
    }

    public PlotBuilder histNorm(String histNorm) {
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
