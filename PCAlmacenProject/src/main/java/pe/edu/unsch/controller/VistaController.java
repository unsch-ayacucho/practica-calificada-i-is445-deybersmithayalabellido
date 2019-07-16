package pe.edu.unsch.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.unsch.dao.RetrieveProducto;
import pe.edu.unsch.entities.Producto;
import pe.edu.unsch.entities.Proveedor;
import pe.edu.unsch.service.ProductoServicioImpl;

@Controller
@RequestMapping("/producto")
public class VistaController {

	@Autowired
	private ProductoServicioImpl service;
	
    @GetMapping("/listar")
    public String lista(Model model) {
    	
    	List<Producto> productos = service.listarProductoProveedor();
    	
    	/*Proveedor chinaPro = new Proveedor(1, "juan", "ayacucho", "peru");
    		
    	productos.add(new Producto(1, producto, "azucar", 10.4f, 3));*/
    	
        model.addAttribute("productos", productos);
    	
    	return "/index";
    }
}
