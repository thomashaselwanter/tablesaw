package tech.tablesaw.js.plotly;

public class ScattterBuilder {

    private String type = "scatter";
    private String mode = "markers";
    private String yLable;
    private String xLabel;


    public ScattterBuilder mode(String mode) {
        this.mode = mode;
        return this;
    }

    public ScattterBuilder yLabel(String yLable) {
        this.yLable = yLable;
        return this;
    }

    public ScattterBuilder xLabel(String xLabel) {
        this.xLabel = xLabel;
        return this;
    }

    public ScattterBuilder type(String kind) {
        this.type = kind;
        return this;
    }

    public String type() {
        return type;
    }

    public String mode() {
        return mode;
    }

    public String yLable() {
        return yLable;
    }

    public String xLabel() {
        return xLabel;
    }

    public Scatter build() throws Exception {
        return new Scatter(this);
    }
}
