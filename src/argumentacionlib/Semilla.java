/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argumentacionlib;

import java.util.Random;

/**
 *
 * @author AMDA
 */
public final class Semilla 
{
    private static Random rand = new Random();
    
    private Semilla()
    {
        
    }
    
    public static int valorAleatorio()
    {
        int result = rand.nextInt() % 100;
        
        return ( result < 0 )? ( result * (-1) ) : ( result < 2 )? valorAleatorio(): result;
        
    }
}
