/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.doñajuana.doñajuana.datos;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Rodrigo
 */
public class Producto {

    public static final String TABLA = "productos";
    public static final String[] FIELDS
            = {"id", "descripcion", "precio", "clasificacion","existencia"
                ,"existencia_minima","existencia_maxima"};

    private Integer id;
    private String descripcion;
    private Double precio;
    private String clasificacion;
    private Integer existencia;
    private Integer existenciaMinima;
    private Integer existenciaMaxima;

    /*public Producto(Integer id, String descripcion, Double precio, 
     String clasificacion, Integer existencia, Integer existenciaMinima, 
     Integer existenciaMaxima) {
     this.id = id;
     this.descripcion = descripcion;
     this.precio = precio;
     this.clasificacion = clasificacion;
     this.existencia = existencia;
     this.existenciaMinima = existenciaMinima;
     this.existenciaMaxima = existenciaMaxima;
     }*/
    
    public static String fieldsToString(){
        String fieldsStr = "";
        List<String> fieldsToConvert = Arrays.asList(FIELDS);//el metodo aslist convierte de arreglos a listas
        for (String field : fieldsToConvert) {
            fieldsStr=String.format("%s, %s", fieldsStr, field);
        }
        return fieldsStr.replaceFirst(",", fieldsStr);
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s %s", this.id, this.descripcion, 
                                this.precio, this.existencia);
    }
}
