package one.digitalinnovation.personapi.service;

import santander.bootcamp.projectapirest.dto.request.PessoaDTO;
import santander.bootcamp.projectapirest.dto.response.MessageResponseDTO;
import santander.bootcamp.projectapirest.entity.Pessoa;
import santander.bootcamp.projectapirest.repository.PessoaRepository;
import santander.bootcamp.projectapirest.service.PessoaService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static one.digitalinnovation.personapi.utils.PersonUtils.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PessoaServiceTest {

    @Mock
    private PessoaRepository pessoaRepository;

    @InjectMocks
    private PessoaService pessoaService;

    @Test
    void testGivenPersonDTOThenReturnSavedMessage() {
        PessoaDTO pessoaDTO = createFakeDTO();
        Pessoa expectedSavedPessoa = createFakeEntity();

        when(pessoaRepository.save(any(Pessoa.class))).thenReturn(expectedSavedPessoa);

        MessageResponseDTO expectedSuccessMessage = createExpectedMessageResponse(expectedSavedPessoa.getId());
        MessageResponseDTO succesMessage = pessoaService.createPerson(pessoaDTO);

        assertEquals(expectedSuccessMessage, succesMessage);
    }

    private MessageResponseDTO createExpectedMessageResponse(Long id) {
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + id)
                .build();
    }
}
