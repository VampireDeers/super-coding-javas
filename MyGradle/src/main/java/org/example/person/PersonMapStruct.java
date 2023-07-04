package org.example.person;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapStruct {
    PersonMapStruct INSTANCE = Mappers.getMapper(PersonMapStruct.class);

    @Mapping(source = "name", target = "fullName")
    @Mapping(source = "age", target = "years")
    Person personDtoToPerson(PersonDto personDto);
}
