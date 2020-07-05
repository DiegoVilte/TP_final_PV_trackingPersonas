/**
 * 
 */
package ar.edu.unju.fi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Barrio;
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

}