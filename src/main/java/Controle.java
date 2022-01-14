import java.util.Iterator;

public class Controle {

    public static Integer PacientesComLeito(Hospital hospital) {
        int quantidade = 0;
        for (Paciente paciente : hospital) {
            if (paciente.getLeito()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer TotalDePacientes(Hospital hospital) {
        int quantidade = 0;
        for (Iterator a = hospital.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}