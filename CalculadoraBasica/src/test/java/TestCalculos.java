/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import daniel.itszn.edu.mx.calculadorabasica.Calculos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Darre
 */
public class TestCalculos {
    
    public TestCalculos() {
    }
    
    Calculos instancia=new Calculos();
    
    @Test
    public void pruebaSuma1(){
        int x=4;
        int y=2;
        int esperado=6;
        int obtenido=instancia.suma(x, y);
        assertEquals(esperado, obtenido);
    }
    @Test
    public void pruebaSuma2(){
        int x=6;
        int y=8;
        int esperado=14; 
        int obtenido=instancia.suma(x, y);
        assertEquals(esperado, obtenido);
    }
}
