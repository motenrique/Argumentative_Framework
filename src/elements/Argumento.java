/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elements;

/**
 *
 * @author AMDA
 */
public class Argumento 
{
    String nombre;
    String content;
    
    public Argumento( String n, String c )
    {
        this.nombre = n;
        this.content = c;
    }
    
    public Argumento( String n )
    {
        this.nombre = n;
        this.content = "";
    }
    
    public Argumento()
    {
        this.nombre = "";
        this.content = "";
    }
    
    public void setNombre( String nom )
    {
        this.nombre = nom;
    }
    
    public void setContent( String con )
    {
        this.content = con;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getContent()
    {
        return this.content;
    }
    
    @Override
    public String toString()
    {
        return this.nombre;
    }
    
    @Override
    public boolean equals( Object obj )
    {
        if( obj == this )
        {
            return true;
        }
        else if( obj instanceof Argumento )
        {
            if( this.content.equals( ((Argumento) obj).content ) && this.nombre.equals( ((Argumento) obj).nombre ) )
                return true;
            else
                return false;
        }
        else
        {
            return false;
        }
    }
}
