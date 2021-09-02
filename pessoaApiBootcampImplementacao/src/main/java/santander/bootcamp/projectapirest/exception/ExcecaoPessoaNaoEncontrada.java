package santander.bootcamp.projectapirest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExcecaoPessoaNaoEncontrada extends Exception {

    public ExcecaoPessoaNaoEncontrada(Long id) {
        super("Pessoa nao encontrada com esse ID " + id);
    }
}
