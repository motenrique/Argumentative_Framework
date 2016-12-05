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
public class Ataque 
{
    Argumento a;
    Argumento b;
    
    public Ataque( Argumento a, Argumento b )
    {
        this.setArgumentoA(a);
        this.setArgumentoB(b);
    }
    
    public void setArgumentoA( Argumento a )
    {
        if( a != null )
        {
            this.a = a;
        }
    }
    
    public void setArgumentoB( Argumento b )
    {
        if( b != null )
        {
            this.b = b;
        }
    }
    
    public Argumento getArgumentoA()
    {
        return a;
    }
    
    public Argumento getArgumentoB()
    {
        return b;
    }
    
    @Override
    public String toString()
    {
        return "( " + this.a.getNombre() + ", " + this.b.getNombre() + " )";
    }
    
    @Override
    public boolean equals( Object obj )
    {
        if( obj == this )
        {
            return true;
        }
        else if( obj instanceof Ataque )
        {
            if( !this.getArgumentoA().equals( ((Ataque) obj).getArgumentoA() ) || 
                    !this.getArgumentoB().equals( ((Ataque) obj).getArgumentoB() ) )
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else
        {
            return false;
        }
    }
}
