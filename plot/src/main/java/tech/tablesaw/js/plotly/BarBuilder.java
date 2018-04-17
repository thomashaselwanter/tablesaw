package tech.tablesaw.js.plotly;

public class BarBuilder extends ScattterBuilder {

    private String barMode;
    private String barGap;

    public ScattterBuilder barMode(String barMode) {
        this.barMode = barMode;
        return this;
    }

    public ScattterBuilder barGap(String barGap) {
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
