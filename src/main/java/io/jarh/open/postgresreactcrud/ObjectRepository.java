package io.jarh.open.postgresreactcrud;

import org.springframework.data.jpa.repository.JpaRepository;

//All needed interface methods are declared inside JpaRepository

//The purpose of creating this class is to bind the types Object for each object and its identifier's type
//in this case Long for Id.

//<Object, ...> is Domain Class and <..., Long> the type for it's Id
public interface ObjectRepository extends JpaRepository<Object, Long> {

}