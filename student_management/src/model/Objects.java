package model;

public class Objects {
    private Long objectId;
    private String objectName;
    private boolean statusObject;

    public Objects() {
    }

    public Objects(Long objectId, String objectName, boolean statusObject) {
        this.objectId = objectId;
        this.objectName = objectName;
        this.statusObject = statusObject;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public boolean isStatusObject() {
        return statusObject;
    }

    public void setStatusObject(boolean statusObject) {
        this.statusObject = statusObject;
    }

    @Override
    public String toString() {
        return "Objects{" +
                "objectId=" + objectId +
                ", objectName='" + objectName + '\'' +
                ", statusObject=" + statusObject +
                '}';
    }
}
