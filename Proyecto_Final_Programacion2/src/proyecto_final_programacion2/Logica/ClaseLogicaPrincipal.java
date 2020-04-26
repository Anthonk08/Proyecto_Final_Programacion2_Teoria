
package proyecto_final_programacion2.Logica;

import java.util.ArrayList;

public class ClaseLogicaPrincipal {
    
    private ArrayList<Clientes> misClientes;
    private static ClaseLogicaPrincipal principal = null;
    
    public ClaseLogicaPrincipal(){
        super();
        misClientes = new ArrayList<>();
    }
    
    public static ClaseLogicaPrincipal getInstance() {
        if (principal == null) {
            principal = new ClaseLogicaPrincipal();
        }
        return principal;

    }
    
    public ArrayList<Clientes> getMisClientes(){
        return misClientes;
    }
    
    public void setMisClientes(ArrayList<Clientes> misClientes){
        this.misClientes = misClientes;
    }
    
    public void insertClientes(Clientes aux) {
        misClientes.add(aux);
    }
    
    public Clientes clienteByID(String id) {
        Clientes c = null;
        boolean encontrado = false;
        int i = 0;
        while (!encontrado && i < misClientes.size()) {
            for (Clientes aux : misClientes) {
                if (aux.getCodcli().equals(id)) {
                    c = aux;
                    encontrado = true;
                }
                i++;
            }
        }
        return c;
    }
}
