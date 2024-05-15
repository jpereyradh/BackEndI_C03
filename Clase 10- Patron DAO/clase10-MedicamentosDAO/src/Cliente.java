import dao.BD;
import model.Medicamento;
import service.MedicamentoService;

public class Cliente {
    public static void main(String[] args) {
        Medicamento medicamento= new Medicamento(1,2292929,"Ibuprofeno","Bago",1000,24.5);
        BD.crearTablas();
        MedicamentoService medicamentoService= new MedicamentoService();
        medicamentoService.guardarMedicamento(medicamento);

    }
}
