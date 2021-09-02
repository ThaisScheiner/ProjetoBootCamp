package one.digitalinnovation.personapi.utils;

import java.time.LocalDate;
import java.util.Collections;

import santander.bootcamp.projectapirest.dto.request.PessoaDTO;
import santander.bootcamp.projectapirest.entity.Pessoa;

public class PersonUtils {

    private static final String FIRST_NAME = "Rodrigo";
    private static final String LAST_NAME = "Peleias";
    private static final String CPF_NUMBER = "369.333.878-79";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(2010, 10, 1);

    public static PessoaDTO createFakeDTO() {
        return PessoaDTO.builder()
                .nome(FIRST_NAME)
                .sobrenome(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("04-04-2010")
                .telefones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Pessoa createFakeEntity() {
        return Pessoa.builder()
                .id(PERSON_ID)
                .nome(FIRST_NAME)
                .sobrenome(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate(BIRTH_DATE)
                .telefones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }
}
