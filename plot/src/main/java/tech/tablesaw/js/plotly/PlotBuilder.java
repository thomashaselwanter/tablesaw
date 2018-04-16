package tech.tablesaw.js.plotly;

import tech.tablesaw.api.Table;
import tech.tablesaw.columns.Column;

import java.io.File;
import java.io.IOException;

public class PlotBuilder {

    private Table table;
    private Column[] columns;

    private String type = "scatter";
    private String mode = "markers";
    private String chartTitle;
    private String yLable;
    private String xLabel;
    private String windowTitle;

    public PlotBuilder(String fileName) throws IOException {
        this.table = Table.read().csv(fileName);
    }

    public PlotBuilder(File file) throws IOException {
        this.table = Table.read().csv(file);
    }

    public PlotBuilder columns(String[] columnNames) {
        this.columns = table.columns(columnNames).toArray(new Column[0]);
        return this;
    }

    public PlotBuilder title(String title) {
        this.chartTitle = title;
        return this;
    }

    public PlotBuilder mode(String mode) {
        this.mode = mode;
        return this;
    }

    public PlotBuilder yLabel(String yLable) {
        this.yLable = yLable;
        return this;
    }

    public PlotBuilder xLabel(String xLabel) {
        this.xLabel = xLabel;
        return this;
    }

    public PlotBuilder windowTitle(String title) {
        this.windowTitle = title;
        return this;
    }

    public PlotBuilder type(String kind) {
        this.type = kind;
        return this;
    }

    public Table table() {
        return table;
    }

    public Column[] columns() {
        return columns;
    }

    public String type() {
        return type;
    }

    public String title() {
        return chartTitle;
    }

    public String windowTitle() {
        return windowTitle;
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

    public Plot build() throws Exception {
        return new Plot(this);
    }
}
