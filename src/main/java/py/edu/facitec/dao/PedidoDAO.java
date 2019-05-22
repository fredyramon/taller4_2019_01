package py.edu.facitec.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.model.Cliente;
import py.edu.facitec.model.Pedido;

@Repository //Indicamos a Spring conección con bd
                           //completamos el objeto con q trabajara
                           //el DAOGenerico
public class PedidoDAO extends DAOGenerico<Pedido> {
	
	public PedidoDAO() {
		//completamos la clase con q trabaja el DAOGenerico
		super(Pedido.class);
	
	}

	//Unidad de Persistencia
	@PersistenceContext
	//Administrador de Entidades
	private EntityManager em;
	

	@Override
	protected EntityManager getEntityManager() {
		
		return em;
	}
	

}
