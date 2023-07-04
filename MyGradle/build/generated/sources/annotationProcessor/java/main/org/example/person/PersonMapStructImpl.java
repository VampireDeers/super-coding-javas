package org.example.person;

import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-02T19:31:50+0900",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 11.0.10 (AdoptOpenJDK)"
)
public class PersonMapStructImpl implements PersonMapStruct {

    @Override
    public Person personDtoToPerson(PersonDto personDto) {
        if ( personDto == null ) {
            return null;
        }

        Person person = new Person();

        person.setFullName( personDto.getName() );
        person.setYears( personDto.getAge() );

        return person;
    }
}
