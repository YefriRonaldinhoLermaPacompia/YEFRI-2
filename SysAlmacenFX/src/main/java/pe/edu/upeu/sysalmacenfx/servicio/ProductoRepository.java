package pe.edu.upeu.sysalmacenfx.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysalmacenfx.dto.ComboBoxOption;
import pe.edu.upeu.sysalmacenfx.modelo.Categoria;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoRepository {
    @Autowired
    ProductoRepository repo;
    public Categoria save(Categoria to){
        return repo.save(to);
    }

    public List<Categoria> list(){
        return repo.findAll();
    }

    public Categoria update(Categoria to, Long id){
        try{
            Categoria toe=repo.findById(id).get();
            if (toe!=null){
                toe.setNombre(to.getNombre());
            }
            return repo.save(toe);

        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
        return  null;
    }

    public void delete (Long id){
        repo.deleteById(id);
    }

    public  Categoria search(Long id){
        return  repo.findById(id).get();
    }


}
