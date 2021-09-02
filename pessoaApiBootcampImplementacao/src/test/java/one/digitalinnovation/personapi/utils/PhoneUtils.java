package one.digitalinnovation.personapi.utils;

import santander.bootcamp.projectapirest.dto.request.TelefoneDTO;
import santander.bootcamp.projectapirest.entity.Telefone;
import santander.bootcamp.projectapirest.enums.FoneTipo;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "1199999-9999";
    private static final FoneTipo PHONE_TYPE = FoneTipo.MOBILE;
    private static final long PHONE_ID = 1L;

    public static TelefoneDTO createFakeDTO() {
        return TelefoneDTO.builder()
                .numero(PHONE_NUMBER)
                .tipo(PHONE_TYPE)
                .build();
    }

    public static Telefone createFakeEntity() {
        return Telefone.builder()
                .id(PHONE_ID)
                .numero(PHONE_NUMBER)
                .foneTipo(PHONE_TYPE)
                .build();
    }
}
