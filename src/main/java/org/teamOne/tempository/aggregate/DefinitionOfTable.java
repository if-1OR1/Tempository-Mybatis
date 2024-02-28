package org.teamOne.tempository.aggregate;

public class DefinitionOfTable {
    private int tableId;
    private int definitionNo;
    private String tableName;
    private String propertyName;
    private boolean primaryKey;
    private boolean foreignKey;
    private boolean nullable;
    private String columnName;
    private String defaultValue;
    private String dataType;
    private String note;
    private int projectId;

    public DefinitionOfTable() {
    }

    public DefinitionOfTable(String tableName) {
        this.tableName = tableName;
    }

    public DefinitionOfTable(int projectId) {
        this.projectId = projectId;
    }

    public DefinitionOfTable(int definitionId, int definitionNo, String tableName, String propertyName, boolean primaryKey, boolean foreignKey, boolean nullable, String columnName, String defaultValue, String dataType, String note, int projectId) {
        this.tableId = definitionId;
        this.definitionNo = definitionNo;
        this.tableName = tableName;
        this.propertyName = propertyName;
        this.primaryKey = primaryKey;
        this.foreignKey = foreignKey;
        this.nullable = nullable;
        this.columnName = columnName;
        this.defaultValue = defaultValue;
        this.dataType = dataType;
        this.note = note;
        this.projectId = projectId;
    }

    public int getTableId() {
        return tableId;
    }

    public int getDefinitionNo() {
        return definitionNo;
    }

    public String getTableName() {
        return tableName;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public boolean isPrimaryKey() {
        return primaryKey;
    }

    public boolean isForeignKey() {
        return foreignKey;
    }

    public boolean isNullable() {
        return nullable;
    }

    public String getColumnName() {
        return columnName;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public String getDataType() {
        return dataType;
    }

    public String getNote() {
        return note;
    }

    public int getProjectId() {
        return projectId;
    }

    @Override
    public String toString() {
        return "DefinitionOfTable{" +
                "definitionId=" + tableId +
                ", definitionNo=" + definitionNo +
                ", tableName='" + tableName + '\'' +
                ", propertyName='" + propertyName + '\'' +
                ", primaryKey=" + primaryKey +
                ", foreignKey=" + foreignKey +
                ", nullable=" + nullable +
                ", columnName='" + columnName + '\'' +
                ", defaultValue='" + defaultValue + '\'' +
                ", dataType='" + dataType + '\'' +
                ", note='" + note + '\'' +
                ", projectId=" + projectId +
                '}';
    }
}
