package com.TiendaM_1Q2023.controller;

import com.TiendaM_1Q2023.controller.domain.Cliente;
import com.TiendaM_1Q2023.dao.ClienteDao;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class IndexController {
    
    @Autowired
    ClienteDao clienteDao;
    
    @GetMapping("/")
    public String inicio(Model model) {
    //    log.info("Ahora desde MVC");
    //    model.addAttribute("Mensaje", "Hola desde el controlador");
        
    //   Cliente cliente = new Cliente("Steven", "Serrano Marchena", "steven.sm1508@gmail.com", "85858585");
    //   model.addAttribute("objetoCliente", cliente);
       
    //  Cliente cliente2 = new Cliente("Juan", "Serrano Marchena", "steven.sm1508@gmail.com", "85858585");
    //   Cliente cliente3 = new Cliente("Pedro", "Serrano Marchena", "steven.sm1508@gmail.com", "85858585");
       
    //   List<Cliente> clientes = Arrays.asList(cliente, cliente2, cliente3);
    
       var clientes = clienteDao.findAll();
       model.addAttribute("clientes", clientes);
       
       
        return "index";
    }
    
}
