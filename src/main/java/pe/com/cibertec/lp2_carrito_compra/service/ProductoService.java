package pe.com.cibertec.lp2_carrito_compra.service;

import pe.com.cibertec.lp2_carrito_compra.model.entity.ProductoEntity;

import java.util.List;

public interface ProductoService {
    List<ProductoEntity> buscarTodosProductos();
    ProductoEntity buscarProductoPorId(Integer id);
}
