package santander.bootcamp.projectapirest.service;

import lombok.AllArgsConstructor;
import santander.bootcamp.projectapirest.dto.request.PessoaDTO;
import santander.bootcamp.projectapirest.dto.response.MessageResponseDTO;
import santander.bootcamp.projectapirest.entity.Pessoa;
import santander.bootcamp.projectapirest.exception.ExcecaoPessoaNaoEncontrada;
import santander.bootcamp.projectapirest.mapper.PessoaMapper;
import santander.bootcamp.projectapirest.repository.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PessoaService {

    private PessoaRepository pessoaRepository;

    private final PessoaMapper pessoaMapper = PessoaMapper.INSTANCE;

    public MessageResponseDTO createPerson(PessoaDTO pessoaDTO) {
        Pessoa pessoaToSave = pessoaMapper.toModel(pessoaDTO);

        Pessoa savedPessoa = pessoaRepository.save(pessoaToSave);
        return createMessageResponse(savedPessoa.getId(), "Created person with ID ");
    }

    public List<PessoaDTO> listAll() {
        List<Pessoa> allPeople = pessoaRepository.findAll();
        return allPeople.stream()
                .map(pessoaMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PessoaDTO findById(Long id) throws ExcecaoPessoaNaoEncontrada {
        Pessoa pessoa = verifyIfExists(id);

        return pessoaMapper.toDTO(pessoa);
    }

    public void delete(Long id) throws ExcecaoPessoaNaoEncontrada {
        verifyIfExists(id);
        pessoaRepository.deleteById(id);
    }

    public MessageResponseDTO updateById(Long id, PessoaDTO pessoaDTO) throws ExcecaoPessoaNaoEncontrada {
        verifyIfExists(id);

        Pessoa pessoaToUpdate = pessoaMapper.toModel(pessoaDTO);

        Pessoa updatedPessoa = pessoaRepository.save(pessoaToUpdate);
        return createMessageResponse(updatedPessoa.getId(), "Updated person with ID ");
    }

    private Pessoa verifyIfExists(Long id) throws ExcecaoPessoaNaoEncontrada {
        return pessoaRepository.findById(id)
                .orElseThrow(() -> new ExcecaoPessoaNaoEncontrada(id));
    }

    private MessageResponseDTO createMessageResponse(Long id, String message) {
        return MessageResponseDTO
                .builder()
                .message(message + id)
                .build();
    }
}
