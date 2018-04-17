package tech.tablesaw.js.plotly.traces;

import tech.tablesaw.js.plotly.components.TraceBuilder;


public class ScatterBuilder extends TraceBuilder {

    String type = "scatter";
    String mode = "markers";
    double[] x;
    double[] y;

    ScatterBuilder() {}

    ScatterBuilder(double[] x, double[] y) {
        this.x = x;
        this.y = y;
    }

    public ScatterBuilder mode(String mode) {
        this.mode = mode;
        return this;
    }

    public ScatterBuilder type(String kind) {
        this.type = kind;
        return this;
    }

    public Scatter build() {
        return new Scatter(this);
    }

    protected String getType() {
        return type;
    }
}
