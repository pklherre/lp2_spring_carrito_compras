package pe.com.cibertec.lp2_carrito_compra.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pe.com.cibertec.lp2_carrito_compra.model.entity.PedidoEntity;
import pe.com.cibertec.lp2_carrito_compra.repository.PedidoRepository;
import pe.com.cibertec.lp2_carrito_compra.service.PedidoService;

@Service
@RequiredArgsConstructor
public class PedidoServiceImpl implements PedidoService{

	private final PedidoRepository pedidoRepository;
	
	@Override
	public void crearPedido(PedidoEntity pedidoEntity) {
		// TODO Auto-generated method stub
		pedidoRepository.save(pedidoEntity);
		
	}

}
