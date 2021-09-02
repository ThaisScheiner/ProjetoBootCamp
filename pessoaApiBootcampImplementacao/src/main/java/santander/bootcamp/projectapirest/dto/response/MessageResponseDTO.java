package santander.bootcamp.projectapirest.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageResponseDTO {

    private String message;
}
