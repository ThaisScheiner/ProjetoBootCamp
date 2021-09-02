package santander.bootcamp.projectapirest.controller;

import lombok.AllArgsConstructor;
import santander.bootcamp.projectapirest.dto.request.PessoaDTO;
import santander.bootcamp.projectapirest.dto.response.MessageResponseDTO;
import santander.bootcamp.projectapirest.exception.ExcecaoPessoaNaoEncontrada;
import santander.bootcamp.projectapirest.service.PessoaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class PessoaController {

    private PessoaService pessoaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PessoaDTO pessoaDTO) {
        return pessoaService.createPerson(pessoaDTO);
    }

    @GetMapping
    public List<PessoaDTO> listAll() {
        return pessoaService.listAll();
    }

    @GetMapping("/{id}")
    public PessoaDTO findById(@PathVariable Long id) throws ExcecaoPessoaNaoEncontrada {
        return pessoaService.findById(id);
    }

    @PutMapping("/{id}")
    public MessageResponseDTO updateById(@PathVariable Long id, @RequestBody @Valid PessoaDTO pessoaDTO) throws ExcecaoPessoaNaoEncontrada {
        return pessoaService.updateById(id, pessoaDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws ExcecaoPessoaNaoEncontrada {
        pessoaService.delete(id);
    }
}
