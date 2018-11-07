package negocio;

import classes.PessoaJuridica;
import persistencia.PessoaJuridicaPersistencia;

/**
 *
 * @author rafae
 */
public class PessoaJuridicaNE {
    public void cadastrar(PessoaJuridica p) throws Exception{
        if (p.getResponsavel() == null)
            throw new Exception("É necessário uma pessoa física responsável!");
        /*if (p.getCnpj().length() < 14) {
            throw new Exception("O campo CNPJ não foi preenchido correntamente \n"
                    + "Dica: um cnpj não tem menos que 14 digitos ou não pode ficar vazio");}*/
        if (p.getCnpj().length() > 14){
            throw new Exception("O campo CNPJ n foi preenchido corretamente");
        }
        new PessoaJuridicaPersistencia(p);
    }
    
    
}
