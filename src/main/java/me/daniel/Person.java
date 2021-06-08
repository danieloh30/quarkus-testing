package me.daniel;

import javax.persistence.Cacheable;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Cacheable
public class Person extends PanacheEntity{

    public String name;
    public String address;

    public Person() {}
    
}
