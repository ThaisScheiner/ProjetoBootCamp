package santander.bootcamp.projectapirest.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FoneTipo {

    HOME("Pessoal"),
    MOBILE("Celular"),
    COMMERCIAL("Comercial");

    private final String descricao;
}
