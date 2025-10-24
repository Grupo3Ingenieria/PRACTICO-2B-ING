package com.is1.proyecto.models;


import org.javalite.activejdbc.annotations.Table;

@Table("professors") // Esta anotación asocia explícitamente el modelo 'User' con la tabla 'users' en la DB.
public class Professor extends Person {

    // ActiveJDBC mapea automáticamente las columnas de la tabla 'users'
    // (como 'id', 'name', 'password', etc.) a los atributos de esta clase.
    // No necesitas declarar los campos (id, name, password) aquí como variables de instancia,
    // ya que la clase Model base se encarga de la interacción con la base de datos.

    // Opcional: Puedes agregar métodos getters y setters si prefieres un acceso más tipado,
    // aunque los métodos genéricos de Model (getString(), set(), getInteger(), etc.) ya funcionan.

    private int legajo;
    private String cargo;

    public Professor(String m, int t, int d, String n, String a, String dir, int s, String c){
        super(m, t, d, n, a, dir);
        this.legajo = s;
        this.cargo = c;
    }

    public String getName() {
        return getString("name"); // Obtiene el valor de la columna 'name'
    }

    public void setName(String name) {
        set("name", name); // Establece el valor para la columna 'name'
    }

    public void setLegajo(int s){
        this.legajo = s;
    }

    public void setCargo(String s){
        this.cargo = s;
    }

    public int getLegajo(){
        return legajo;
    }

    public String getCargo(){
        return cargo;
    }

}
