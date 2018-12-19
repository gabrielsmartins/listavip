package br.com.listavip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.listavip.entity.Convidado;
import br.com.listavip.repository.ConvidadoRepository;

@Controller
public class ConvidadoController {
	
	@Autowired
	private ConvidadoRepository repository;
	

    @RequestMapping("/")
    public String index(){
        return "index";
    }
    
    @RequestMapping("/listaconvidados")
    public ModelAndView listaconvidados(){
    	ModelAndView modelAndView = new ModelAndView("listaconvidados");
    	List<Convidado> convidados = repository.findAll();
    	modelAndView.addObject("convidados", convidados);
        return modelAndView;
    }

}