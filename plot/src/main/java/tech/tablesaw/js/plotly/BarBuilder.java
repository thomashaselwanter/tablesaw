package tech.tablesaw.js.plotly;

import java.io.File;
import java.io.IOException;

public class BarBuilder extends PlotBuilder {

    private String barMode;
    private String barGap;

    public BarBuilder(String fileName) throws IOException {
        super(fileName);
    }

    public BarBuilder(File file) throws IOException {
        super(file);
    }


    public PlotBuilder barMode(String barMode) {
        this.barMode = barMode;
        return this;
    }

    public PlotBuilder barGap(String barGap) {
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
}
