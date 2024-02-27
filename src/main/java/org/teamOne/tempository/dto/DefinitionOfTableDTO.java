package org.teamOne.tempository.dto;

public class DefinitionOfTableDTO {
    private int definitionId;
    private int projectId;
    private int definitionNo;
    private String tableName;
    private String propertyName;
    private boolean primaryKey;
    private boolean foreignKey;
    private boolean null_able;
    private String columnName;
    private String defaultValue;
    private String dataType;
    private String note;

    public DefinitionOfTableDTO() {
    }


    public DefinitionOfTableDTO(int projectId) {
        this.projectId = projectId;
    }

    public DefinitionOfTableDTO(int definitionId, int projectId, int definitionNo, String tableName, String propertyName, boolean primaryKey, boolean foreignKey, boolean null_able, String columnName, String defaultValue, String dataType, String note) {
        this.definitionId = definitionId;
        this.projectId = projectId;
        this.definitionNo = definitionNo;
        this.tableName = tableName;
        this.propertyName = propertyName;
        this.primaryKey = primaryKey;
        this.foreignKey = foreignKey;
        this.null_able = null_able;
        this.columnName = columnName;
        this.defaultValue = defaultValue;
        this.dataType = dataType;
        this.note = note;
    }

    public int getDefinitionId() {
        return definitionId;
    }

    public void setDefinitionId(int definitionId) {
        this.definitionId = definitionId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getDefinitionNo() {
        return definitionNo;
    }

    public void setDefinitionNo(int definitionNo) {
        this.definitionNo = definitionNo;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public boolean isPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(boolean primaryKey) {
        this.primaryKey = primaryKey;
    }

    public boolean isForeignKey() {
        return foreignKey;
    }

    public void setForeignKey(boolean foreignKey) {
        this.foreignKey = foreignKey;
    }

    public boolean isNull_able() {
        return null_able;
    }

    public void setNull_able(boolean null_able) {
        this.null_able = null_able;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "DefinitionOfTableDTO{" +
                "definitionId=" + definitionId +
                ", projectId=" + projectId +
                ", definitionNo=" + definitionNo +
                ", tableName='" + tableName + '\'' +
                ", propertyName='" + propertyName + '\'' +
                ", primaryKey=" + primaryKey +
                ", foreignKey=" + foreignKey +
                ", null_able=" + null_able +
                ", columnName='" + columnName + '\'' +
                ", defaultValue='" + defaultValue + '\'' +
                ", dataType='" + dataType + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
