package com.treinamentoapi.forumestudos.controller;

import br.com.alura.forum.dto.TopicoDto;
import com.treinamentoapi.forumestudos.models.Curso;
import com.treinamentoapi.forumestudos.models.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController //funciona como o @RequestBody
public class TopicosController {

    @RequestMapping("/topicos")
  //  @ResponseBody //se não tiver essa anotação, o spring direciona para uma pagina em html
    public List<TopicoDto> lista(){
        Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "Programacao"));
        return TopicoDto.converter(Arrays.asList(topico, topico, topico));
    }
}
