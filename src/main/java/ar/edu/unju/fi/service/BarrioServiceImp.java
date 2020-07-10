/**
 * 
 */
package ar.edu.unju.fi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Barrio;
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.repository.IBarrioDAO;

/**
 * @author Diego
 *
 */
@Service
public class BarrioServiceImp implements IBarrioService {

	@Autowired
	private IBarrioDAO barrioDAO;
	@Override
	public List<Barrio> obtenerBarrios() {
		// TODO Auto-generated method stub
		return barrioDAO.findAll();
	}
	@Override
	public void crearBarrio(Barrio barrio) {
		barrioDAO.save(barrio);
	}
	@Override
	public void borrarBarrio(long id) {
		barrioDAO.deleteById(id);
	}
	@Override
	public Barrio buscarBarrio(Long id) throws Exception {
		return barrioDAO.findById(id).orElseThrow(()-> new Exception("El Barrio no Existe"));
	}
	@Override
	public Barrio modificar(Barrio barrio) throws Exception {
		Barrio encontrado = barrioDAO.findById(barrio.getId()).orElse(null);
        encontrado.setNombre(barrio.getNombre());
        return barrioDAO.save(encontrado);
	}
}
