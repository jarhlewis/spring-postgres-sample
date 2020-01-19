package io.jarh.open.postgresreactcrud;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Object {

    private int Id;
    private String Name;
    private String Material;
    private String Location; 

    protected Object(){
        super();
    }

    //Getters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId (){
        return Id;
    } 
    public String getName (){
        return Name;
    } 
    public String getMaterial (){
        return Material;
    } 
    public String getLocation (){
        return Location;
    }

    //Setters
    public void setId (int Id){
        this.Id = Id;
    } 
    public void setName (String Name){
        this.Name = Name;
    } 
    public void setMaterial (String Material){
        this.Material = Material;
    } 
    public void setLocation (String Location){
        this.Location = Location;
    } 

}
