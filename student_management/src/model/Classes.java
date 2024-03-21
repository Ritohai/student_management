package model;

public class Classes {
    private Long idClasser;
    private String classerName;

    private boolean statusClasses;

    public Classes() {
    }

    public Classes(Long idClasser, String classerName, boolean statusClasses) {
        this.idClasser = idClasser;
        this.classerName = classerName;
        this.statusClasses = statusClasses;
    }

    public Long getIdClasser() {
        return idClasser;
    }

    public void setIdClasser(Long idClasser) {
        this.idClasser = idClasser;
    }

    public String getClasserName() {
        return classerName;
    }

    public void setClasserName(String classerName) {
        this.classerName = classerName;
    }

    public boolean isStatusClasses() {
        return statusClasses;
    }

    public void setStatusClasses(boolean statusClasses) {
        this.statusClasses = statusClasses;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "idClasser=" + idClasser +
                ", classerName='" + classerName + '\'' +
                ", statusClasses=" + statusClasses +
                '}';
    }
}
