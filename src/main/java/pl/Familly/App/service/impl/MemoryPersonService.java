package pl.Familly.App.service.impl;

import org.springframework.stereotype.Service;
import pl.Familly.App.model.Person;
import pl.Familly.App.service.PersonService;

import java.util.ArrayList;
import java.util.List;
@Service
public class MemoryPersonService implements PersonService {


    private List<Person> persons;

    private static int counter;

    public MemoryPersonService(){
       persons =  new ArrayList<>();
    }


    @Override
    public List<Person> getAll() {
        return persons;
    }


    @Override
    public void save(Person person) {
        person.setId(++counter);
        persons.add(person);
    }
}
