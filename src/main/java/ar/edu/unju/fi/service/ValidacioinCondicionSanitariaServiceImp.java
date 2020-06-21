/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.model.ValidadorCondicionSanitaria;
import ar.edu.unju.fi.repository.IValidadorCondicionSanitariaDAO;

/**
 * @author Diego
 *
 */
@Repository
public class ValidacioinCondicionSanitariaServiceImp implements IValidadorCondicionSanitariaService {
	
	
	@Autowired
	@Qualifier("validacionCondicionSanitariaDAOImpMySQL")
	private IValidadorCondicionSanitariaDAO ivcs;
	

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		ivcs.guardar();

	}

	@Override
	public ValidadorCondicionSanitaria modificar() {
		// TODO Auto-generated method stub
		ValidadorCondicionSanitaria vcs =ivcs.modificar();
		return vcs;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		ivcs.eliminar();

	}

	@Override
	public ValidadorCondicionSanitaria mostrar() {
		// TODO Auto-generated method stub
		ValidadorCondicionSanitaria vcs =ivcs.mostrar();
		return vcs;
	}

}
