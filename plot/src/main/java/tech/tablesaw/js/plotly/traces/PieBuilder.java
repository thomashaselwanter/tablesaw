package tech.tablesaw.js.plotly.traces;

import tech.tablesaw.js.plotly.components.TraceBuilder;

public class PieBuilder extends TraceBuilder {

    private String type = "pie";
    Object[] x;
    double[] y;

    PieBuilder(Object[] x, double[] y) {
        this.x = x;
        this.y = y;
    }

    public PiePlot build() throws Exception {
        return new PiePlot(this);
    }

    @Override
    protected String getType() {
        return type;
    }
}
