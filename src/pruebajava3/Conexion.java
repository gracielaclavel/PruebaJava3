/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava3;
import interfaces.Interfaz;
import javax.swing.JFrame;

/**
 * Autor:Graciela Clavel
 * Clase:Conexion.Java
 * fechas 10/11/2017
 * Responsabilidad:Es llamando a la ClaseJFrame y creando objeto
 *
 * @author LAB18
 */
public class Conexion 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      Interfaz w = new Interfaz();
      w.setVisible(true);
      w.setBounds(0,0,300,300);
      w.setTitle("Tercera Evaluacion Sumativa");
      w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
