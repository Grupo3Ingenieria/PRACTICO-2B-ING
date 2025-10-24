package com.is1.proyecto.models;

public class Person extends User{
    private String mail;
    private int dni;
    private int tel;
    private String nombre;
    private String apellido;
    private String direccion;

    public Person(String m, int t, int d, String n, String a, String dir){
        this.mail = m;
        this.dni = d;
        this.tel = t;
        this.nombre = n;
        this.apellido = a;
        this.direccion = dir;
    }

    public String getMail(){
        return mail;
    }

    public void setMail(String s){
        this.mail = s;
    }

    public int getDni(){
        return this.dni;
    }

    public void setDni(int d){
        this.dni = d;
    }

    public int getTel(){
        return this.tel;
    }

    public void setTel(int t){
        this.tel = t;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String n){
        this.nombre = n;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String a){
        this.apellido = a;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public void setDireccion(String d){
        this.direccion = d;
    }
}
