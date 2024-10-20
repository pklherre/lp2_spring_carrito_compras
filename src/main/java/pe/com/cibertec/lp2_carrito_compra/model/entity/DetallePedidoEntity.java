package pe.com.cibertec.lp2_carrito_compra.model.entity;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "detalle_pedido")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetallePedidoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "detalle_id")
	private Integer detalleId;
	
	@Column(name = "cantidad", nullable = false)
	private Integer cantidad;
	
	@ManyToOne
	@JoinColumn(name = "fk_producto", nullable = false)
	private ProductoEntity productoEntity;
	
	@ManyToOne
	@JoinColumn(name = "fk_pedido", nullable = false)
	private PedidoEntity pedidoEntity;
}
