/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author usuario
 */
public class Jugador {
    public String nombre , apellido , id , pocision ;
    public int Num_camisa;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String id, String pocision, int Num_camisa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.pocision = pocision;
        this.Num_camisa = Num_camisa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPocision() {
        return pocision;
    }

    public void setPocision(String pocision) {
        this.pocision = pocision;
    }

    public int getNum_camisa() {
        return Num_camisa;
    }

    public void setNum_camisa(int Num_camisa) {
        this.Num_camisa = Num_camisa;
    }

    public String getPosicion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNum_Camisa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
