package entity;

public class TypeOfTraining {
    private String TypeId;
    private String TypeName;

    public String getTypeId() {
        return TypeId;
    }

    public void setTypeId(String typeId) {
        TypeId = typeId;
    }

    public String getTypeName() {
        return TypeName;
    }

    public void setTypeName(String typeName) {
        TypeName = typeName;
    }

    public TypeOfTraining(String typeId, String typeName) {
        super();
        TypeId = typeId;
        TypeName = typeName;
    }

    @Override
    public String toString() {
        return "TypeOfTraining [TypeId=" + TypeId + ", TypeName=" + TypeName + "]";
    }

}
