package model;

public class PointObject {
    private Long pointObjectId;
    private float point;
    private boolean statusPointObject;

    public PointObject() {
    }

    public PointObject(Long pointObjectId, float point, boolean statusPointObject) {
        this.pointObjectId = pointObjectId;
        this.point = point;
        this.statusPointObject = statusPointObject;
    }

    public Long getPointObjectId() {
        return pointObjectId;
    }

    public void setPointObjectId(Long pointObjectId) {
        this.pointObjectId = pointObjectId;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public boolean isStatusPointObject() {
        return statusPointObject;
    }

    public void setStatusPointObject(boolean statusPointObject) {
        this.statusPointObject = statusPointObject;
    }

    @Override
    public String toString() {
        return "PointObject{" +
                "pointObjectId=" + pointObjectId +
                ", point=" + point +
                ", statusPointObject=" + statusPointObject +
                '}';
    }
}
