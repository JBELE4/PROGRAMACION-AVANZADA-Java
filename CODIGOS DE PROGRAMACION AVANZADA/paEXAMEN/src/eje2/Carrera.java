package eje2;

public enum Carrera {
    GradoenIngenieríadelaCiberseguridad, GradoenIngenieríaInformática, GradoenIngenieríadelSoftware, GradoenIngenieríadeComputadores, GradoenDiseñoyDesarrollodeVideojuegos;

    public String devolver() {
        String result = null;
        switch (this) {
            case GradoenDiseñoyDesarrollodeVideojuegos:
                result = "GradoenDiseñoyDesarrollodeVideojuegos";
                break;
            case GradoenIngenieríadeComputadores:
                result = "GradoenIngenieríadeComputadores";
                break;
            case GradoenIngenieríadelaCiberseguridad:
                result = " GradoenIngenieríadelaCiberseguridad";
                break;
            case GradoenIngenieríadelSoftware:
                result = "GradoenIngenieríadelSoftware";
                break;
            case GradoenIngenieríaInformática:
                result = "GradoenIngenieríaInformática";
                break;
        }
        return result;
    }
}
