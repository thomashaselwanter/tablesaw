package tech.tablesaw.js.plotly.traces;

import tech.tablesaw.js.plotly.components.TraceBuilder;

public class BarBuilder extends TraceBuilder {

    private String type = "bar";
    Object[] x;
    double[] y;
    BarPlot.Orientation orientation = BarPlot.Orientation.HORIZONTAL;

    BarBuilder(Object[] x, double[] y) {
        this.x = x;
        this.y = y;
    }

    public BarPlot build() throws Exception {
        return new BarPlot(this);
    }

    /**
     * Sets the orientation of the bars. With "v" ("h"), the value of the each bar spans along the vertical (horizontal).
     */
    public BarBuilder orientation(BarPlot.Orientation orientation) {
        this.orientation = orientation;
        return this;
    }

    @Override
    protected String getType() {
        return type;
    }
}
