package tech.tablesaw.js.plotly.traces;

import tech.tablesaw.js.plotly.components.TraceBuilder;

public class BoxBuilder extends TraceBuilder {

    String type = "box";
    Object[] x;
    double[] y;

    BoxBuilder(Object[] x, double[] y) {
        this.x = x;
        this.y = y;
    }

    public BoxPlot build() {
        return new BoxPlot(this);
    }

    @Override
    protected String getType() {
        return type;
    }
}
