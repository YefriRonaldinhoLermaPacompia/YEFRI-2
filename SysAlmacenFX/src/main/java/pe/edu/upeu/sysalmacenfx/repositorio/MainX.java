package pe.edu.upeu.sysalmacenfx.repositorio;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pe.edu.upeu.sysalmacenfx.modelo.Categoria;
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


}
