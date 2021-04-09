package org.lessons.prototype.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * This is an example of shallow copy
 * <p>
 *
 * @author axteel on 09.04.2021 : 15:26
 * @version 1.0
 */
public class Statement implements Cloneable<Statement> {
    private String sql;
    private List<String> parameters;
    private Record record;

    public Statement(Statement statement) {
        if (statement == null)
            throw new NullPointerException("Statement is null");
        this.sql = statement.sql;
        this.record = new Record();
        this.parameters = new ArrayList<>(statement.parameters);
    }

    public Statement(String sql, List<String> parameters, Record record) {
        this.sql = sql;
        this.parameters = parameters;
        this.record = record;
    }

    @Override
    public Statement clone(CloneType type) {
        switch (type) {
            case DEEP:
                return new Statement(this);
            case SHALLOW:
                try {
                    return (Statement) super.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                break;
        }

        return null;
    }



    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }
}
