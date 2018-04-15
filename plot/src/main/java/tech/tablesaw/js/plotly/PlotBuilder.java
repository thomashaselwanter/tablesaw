package tech.tablesaw.js.plotly;

import tech.tablesaw.api.Table;
import tech.tablesaw.columns.Column;

import java.io.File;
import java.io.IOException;

public class PlotBuilder {

    private Table table;
    private Column[] columns;

    private String kind = "scatter";
    private String title;
    private String yLable;
    private String xLabel;

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

    public PlotBuilder columns(String title) {
        this.title = title;
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

    public PlotBuilder title(String title) {
        this.title = title;
        return this;
    }

    public PlotBuilder kind(String kind) {
        this.kind = kind;
        return this;
    }

    public Table table() {
        return table;
    }

    public Column[] columns() {
        return columns;
    }

    public String kind() {
        return kind;
    }

    public String title() {
        return title;
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
