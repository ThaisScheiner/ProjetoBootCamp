package santander.bootcamp.projectapirest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import santander.bootcamp.projectapirest.dto.request.PessoaDTO;
import santander.bootcamp.projectapirest.entity.Pessoa;

@Mapper
public interface PessoaMapper {

    PessoaMapper INSTANCE = Mappers.getMapper(PessoaMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Pessoa toModel(PessoaDTO pessoaDTO);

    PessoaDTO toDTO(Pessoa pessoa);
}
