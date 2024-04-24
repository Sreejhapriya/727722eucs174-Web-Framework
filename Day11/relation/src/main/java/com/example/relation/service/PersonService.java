package com.example.relation.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.relation.model.Person;
import com.example.relation.repository.PersonRepository;

@Service
public class PersonService {
    public PersonRepository perepo;
    public PersonService(PersonRepository perepo)
    {
        this.perepo = perepo;
    }
    public Person saveStudent(Person student)
    {
        return perepo.save(student);
    }
    public List<Person> getStudents()
    {
        return perepo.findAll();
    }
}
