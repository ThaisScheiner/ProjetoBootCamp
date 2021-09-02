package santander.bootcamp.projectapirest.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EmailTipo
{
    HOME("Pessoal"),
    COMMERCIAL("Comercial");

    private final String descricao;

}
