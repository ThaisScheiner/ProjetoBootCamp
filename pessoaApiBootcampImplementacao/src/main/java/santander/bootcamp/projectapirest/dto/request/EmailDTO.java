package santander.bootcamp.projectapirest.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import santander.bootcamp.projectapirest.enums.EmailTipo;
import santander.bootcamp.projectapirest.enums.FoneTipo;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmailDTO
{
    private Long id;

    @Enumerated(EnumType.STRING)
    private EmailTipo tipo;

    @NotEmpty
    @Size(min = 13, max = 100)
    private String email;
}
