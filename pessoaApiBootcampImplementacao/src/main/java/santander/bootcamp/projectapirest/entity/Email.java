package santander.bootcamp.projectapirest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import santander.bootcamp.projectapirest.enums.EmailTipo;
import santander.bootcamp.projectapirest.enums.FoneTipo;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Email
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EmailTipo emailTipo;

    @Column(nullable = false)
    private String email;
}
