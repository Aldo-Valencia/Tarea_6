package org.example.herenciamultiple;

public class AlumnoDeportistArtista extends Alumno implements Deportista, Artista{
    private int idActiviExtra;
    private String deporte;
    private String arte;

    public AlumnoDeportistArtista() {
    }

    public AlumnoDeportistArtista(String nombre, int edad, int numerCuenta, String carrera, double promedio, int idActiviExtra, String deporte, String arte) {
        super(nombre, edad, numerCuenta, carrera, promedio);
        this.idActiviExtra = idActiviExtra;
        this.deporte = deporte;
        this.arte = arte;
    }

    public int getIdActiviExtra() {
        return idActiviExtra;
    }

    public void setIdActiviExtra(int idActiviExtra) {
        this.idActiviExtra = idActiviExtra;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getArte() {
        return arte;
    }

    public void setArte(String arte) {
        this.arte = arte;
    }

    @Override
    public String toString() {
        return super.toString() +
                "AlumnoDeportistArtista{" +
                "idActiviExtra=" + idActiviExtra +
                ", deporte='" + deporte + '\'' +
                ", arte='" + arte + '\'' +
                '}';
    }

    @Override
    public int ensayar(String disciplina) {
        System.out.println("El alumno esta ensayando " + this.arte);
        return 2;
    }

    @Override
    public boolean presentarObra() {
        System.out.println(getNombre()+ " Esta presentando su obra...");
        return false;
    }

    @Override
    public int entrenar() {
        System.out.println(getNombre()+ " Esta entrenando el deporte "+ deporte);
        return 2;
    }

    @Override
    public boolean presentarCompetencia(String ubicacion) {
        System.out.println(getNombre()+ " Esta en competencia del deporte "+ deporte);
        return true;
    }
}
