/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argumentacionlib;

import elements.*;
import java.util.ArrayList;

/**
 *
 * @author AMDA
 */
public class MarcoArgumentativo 
{
    int numArgs;
    
    private ArrayList<Argumento> args;
    private ArrayList<Ataque> attacks;
    
    public MarcoArgumentativo(int num)
    {
        this.numArgs = num;
        args = new ArrayList<>();
        attacks = new ArrayList<>();
    }
    
    public void inicializa() throws NumeroArgumentosException
    {
        if( this.numArgs == 0 )
        {
            throw new NumeroArgumentosException();
        }
        else
        {
            inicializaArgumentos();
        }
    }
    
    private void inicializaArgumentos()
    {
        String abece = "abcdefghijklmnopqrstuvwxyz";
        int indexAbc = -1;
            
        int indexNum = 0;
            
        for( int i = 0; i < numArgs; i++ )
        {
            indexAbc = ( (indexAbc + 1) >= 26 )?0:(indexAbc + 1);
            
            indexNum = ( indexAbc == 0 )?(indexNum + 1):indexNum;
            
            args.add( new Argumento( abece.charAt(indexAbc) + "" + indexNum ) );
        }
    }
    
    private void declara_ataques( ArrayList<Argumento> arg_subconjuntos )
    {
        if( arg_subconjuntos.isEmpty() )
        {
            return;
        }
        else
        {
            //Obtener tamaño actual del arreglo
            int tam = arg_subconjuntos.size();
            
            //Obtener el valor primero del arreglo
            Argumento valorPrimero = arg_subconjuntos.get(0);
        }
    }
    
    @Override
    public String toString()
    {
        StringBuilder res1 = new StringBuilder("(");
        
        for( Argumento ar : this.args )
        {
            res1.append( ar.toString() + "," );
        }
        
        String argumentos = res1.substring(0, res1.length() - 1);
        
        argumentos += ")";
        
        return argumentos;
    }
}
