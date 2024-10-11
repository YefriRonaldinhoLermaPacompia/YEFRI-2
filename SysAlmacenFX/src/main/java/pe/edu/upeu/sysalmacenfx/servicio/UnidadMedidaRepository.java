package pe.edu.upeu.sysalmacenfx.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysalmacenfx.dto.ComboBoxOption;
import pe.edu.upeu.sysalmacenfx.modelo.Categoria;
import pe.edu.upeu.sysalmacenfx.modelo.UnidadMedida;
import pe.edu.upeu.sysalmacenfx.repositorio.CategoriaRepository;

import java.util.ArrayList;
import java.util.List;

@Service

public class UnidadMedidaRepository {
    @Autowired
    UnidadMedidaRepository repo;

    public UnidadMedida save(UnidadMedida to){
        return repo.save(to);
    }

    public List<UnidadMedida> list(){
        return repo.findAll();
    }

    public UnidadMedida update(UnidadMedida to, Long id){
        try{
            UnidadMedida toe=repo.findById(id).get();
            if (toe!=null){
                toe.setIdUnidad(to.getIdUnidad());
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

    public  UnidadMedida search(Long id){
        return  repo.findById(id).get();
    }

    public List<ComboBoxOption> listarCombobox(){
        List<ComboBoxOption> listar =new ArrayList<>();
        for
        (Categoria cate : repo.findAll()) {
            listar.add(new ComboBoxOption(String.valueOf(cate.getIdCategoria()),cate.getNombre()));

        }
        return listar;

    }
}
