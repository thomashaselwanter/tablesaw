package tech.tablesaw.js.plotly.traces;

import tech.tablesaw.js.plotly.components.TraceBuilder;


public class ScatterBuilder extends TraceBuilder {

    String type = "scatter";
    String mode = "markers";
    String yLabel;
    String xLabel;

    ScatterBuilder() {}

    public ScatterBuilder mode(String mode) {
        this.mode = mode;
        return this;
    }

    public ScatterBuilder yLabel(String yLabel) {
        this.yLabel = yLabel;
        return this;
    }

    public ScatterBuilder xLabel(String xLabel) {
        this.xLabel = xLabel;
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
