package com.think.datajpa.controllers;

import java.util.Map;

import com.think.datajpa.models.entity.Cliente;
import com.think.datajpa.models.entity.Factura;
import com.think.datajpa.models.service.IClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/factura")
@SessionAttributes("factura")
public class FacturaController {

    @Autowired
    IClienteService clienteService;

    @GetMapping(value = "/form/{clienteId}")
    public String crear(@PathVariable(value = "clienteId") Long clienteId,
    Map<String,Object> model, RedirectAttributes flash){
        Cliente cliente = clienteService.findOne(clienteId);
        if (cliente == null) {
            flash.addFlashAttribute("error", "El cliente no existe en la base de datos");
            return "redirect:/listar";
        }

        Factura factura = new Factura();
        factura.setCliente(cliente);
        model.put("factura", factura);
        model.put("titulo", "Crear factura");
        return "factura/form";
    }
}