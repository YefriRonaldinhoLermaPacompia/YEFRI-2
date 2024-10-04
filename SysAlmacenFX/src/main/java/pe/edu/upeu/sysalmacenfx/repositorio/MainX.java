package pe.edu.upeu.sysalmacenfx.repositorio;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pe.edu.upeu.sysalmacenfx.modelo.Categoria;

import java.util.List;
import java.util.Scanner;



@Component
public class MainX {

    @Autowired
    CategoriaRepository repository;
    public void registro(){
        System.out.println("MAIN CATEGORIA");
        Categoria ca= new Categoria();
        ca.setNombre("Verduras");
        Categoria dd= repository.save(ca);
        System.out.println("Reporte");
        System.out.println(dd.getIdCategoria()+ "  "+dd.getNombre());
    }

    public static void main(String[] args) {
        MainX dd=new MainX();
        dd.registro();
    }

    public void listar(){
        List<Categoria> datos=repository.findAll();
        System.out.println("ID/Nombre");
        for(Categoria ca: datos){
            System.out.println(ca.getIdCategoria()+"\t"+ca.getNombre());

        }
    }
    public void menu(){
        int opc=0;
        Scanner cs = new Scanner(System.in);
        String mensaje = "Seleccione una opcion: \n 1=Crear \n 2=Listar \n 3=Salir";
        System.out.println(mensaje);
        opc=Integer.parseInt(cs.next());

    }

}
