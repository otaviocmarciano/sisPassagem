/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema;

/**
 *
 * @author Otávio Camargo Marciano - 201900244
 */
public class PassagemInteira extends Passagem{
    
    public PassagemInteira( Pessoa titular, Assento assento) {
        super( titular, assento);
    }

    @Override
    public void defineValor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
