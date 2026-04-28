package colecciones.taller1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListt {
        List<String> tareas = new ArrayList<>();

        //! Agrando tareas
        public void agregarTarea(String tarea){
            tareas.add(tarea);
        }

        public void mostrarTareas(){
            for( String tarea : tareas){
                System.out.println("- " + tarea);
            }
        }

        public  void eliminarTareasPorNombre(String tarea){
            if(tareas.contains(tarea)){
                tareas.remove(tarea);
            } else {
                System.out.println("Tarea no encontrada");
            }
        }

        public  void eliminarTareasPorId(int indice){
            if (indice >= 0 && indice < tareas.size()) {
                System.out.println("Tarea completada: " + tareas.get(indice));
                tareas.remove(indice);
            } else {
                System.out.println("Índice inválido");
            }
        }

        public void mostrasPendiente(){
            System.out.println("Total pendientes: " + tareas.size());
        }

}
