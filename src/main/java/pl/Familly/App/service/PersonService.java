package pl.Familly.App.service;

import pl.Familly.App.model.Person;

import java.util.List;

public interface PersonService {

    List<Person> getAll();

    void save(Person person);
}
