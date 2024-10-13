package pe.com.cibertec.lp2_carrito_compra.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.com.cibertec.lp2_carrito_compra.model.entity.ProductoEntity;
import pe.com.cibertec.lp2_carrito_compra.service.ProductoService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ProductoController {

    private final ProductoService productoService;

    @GetMapping("/menu")
    public String mostrarMenu(Model model, HttpSession session) {
        if(session.getAttribute("usuario") == null) {
            return "redirect:/";
        }

        List<ProductoEntity> listaProductos = productoService.buscarTodosProductos();
        model.addAttribute("productos", listaProductos);

        return "menu";
    }
}
