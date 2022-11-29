/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ribesacre;

import java.util.Calendar;

/**
 *
 * @author mohammed
 */
public class Reserva {
    
    String idReserva = "";
    String tipoReserva = "";
    String fechaReserva = "";
    String horaReserva = "";
    String nombre = "";
    String apellidos = "";
    String documentoIdentidad = "";
    String telefono = "";
    String prefijo = "";
    String correoElectronico = "";
    int numeroAdultos;
    int numeroNinos;
    int numeroAdultosFamiliaNumerosa;
    int numeroNinosFamiliaNumerosa;
    int numeroPasajerosDiscapacidad;
    int radioButtonSeleccionado;
    
    int numeroPasajeros;
    String tamanoBarco = "";
    
    public Reserva(String idReserva, String tipoReserva, String fechaReserva, String horaReserva, int numeroPasajeros){
        this.idReserva = idReserva;
        this.tipoReserva = tipoReserva;
        this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
        this.numeroPasajeros = numeroPasajeros;
    }
    
    public Reserva(String idReserva, String tipoReserva, String fechaReserva, String horaReserva, String tamanoBarco){
        this.idReserva = idReserva;
        this.tipoReserva = tipoReserva;
        this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
        this.tamanoBarco = tamanoBarco;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public String getTipoReserva() {
        return tipoReserva;
    }

    public void setTipoReserva(String tipoReserva) {
        this.tipoReserva = tipoReserva;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(String horaReserva) {
        this.horaReserva = horaReserva;
    }

    public String getTamanoBarco() {
        return tamanoBarco;
    }

    public void setTamanoBarco(String tamanoBarco) {
        this.tamanoBarco = tamanoBarco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getNumeroAdultos() {
        return numeroAdultos;
    }

    public void setNumeroAdultos(int numeroAdultos) {
        this.numeroAdultos = numeroAdultos;
    }

    public int getNumeroNinos() {
        return numeroNinos;
    }

    public void setNumeroNinos(int numeroNinos) {
        this.numeroNinos = numeroNinos;
    }

    public int getNumeroAdultosFamiliaNumerosa() {
        return numeroAdultosFamiliaNumerosa;
    }

    public void setNumeroAdultosFamiliaNumerosa(int numeroAdultosFamiliaNumerosa) {
        this.numeroAdultosFamiliaNumerosa = numeroAdultosFamiliaNumerosa;
    }

    public int getNumeroNinosFamiliaNumerosa() {
        return numeroNinosFamiliaNumerosa;
    }

    public void setNumeroNinosFamiliaNumerosa(int numeroNinosFamiliaNumerosa) {
        this.numeroNinosFamiliaNumerosa = numeroNinosFamiliaNumerosa;
    }

    public int getNumeroPasajerosDiscapacidad() {
        return numeroPasajerosDiscapacidad;
    }

    public void setNumeroPasajerosDiscapacidad(int numeroPasajerosDiscapacidad) {
        this.numeroPasajerosDiscapacidad = numeroPasajerosDiscapacidad;
    }

    public int getRadioButtonSeleccionado() {
        return radioButtonSeleccionado;
    }

    public void setRadioButtonSeleccionado(int radioButtonSeleccionado) {
        this.radioButtonSeleccionado = radioButtonSeleccionado;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }
    
    
    
}
