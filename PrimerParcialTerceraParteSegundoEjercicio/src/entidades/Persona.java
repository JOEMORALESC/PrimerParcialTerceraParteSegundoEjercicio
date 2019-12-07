/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Jherom Chacon
 */
public class Persona {
    public String nombre;
    public String apellido;
    public String sexo;
    public int edad;
    public Persona(){
    }
    public Persona(String nombre){
    this.nombre=nombre;
    }
    public Persona(String nombre, String sexo){
    this.nombre=nombre;
    this.sexo=sexo;
    }
    
    public Persona(String nombre, String apellido,String sexo){
    this.nombre=nombre;
    this.apellido=apellido;
    this.sexo=sexo;    
    }
    public Persona(String nombre, String apellido,String sexo, int edad){
    this.nombre=nombre;
    this.apellido=apellido;
    this.sexo=sexo;
    this.edad=edad;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
        }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    public void setEdad(int edad){
        this.edad=edad;
        }
    
    public int getEdad(){
        return this.edad;
    }
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String sexo){
        this.sexo=sexo;
    }
}
