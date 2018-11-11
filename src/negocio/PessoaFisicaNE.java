package negocio;

import classes.PessoaFisica;
import persistencia.PessoaFisicaPersistencia;

/**
 *
 * @author rafae
 */
public class PessoaFisicaNE {
    public void cadastrar(PessoaFisica p) throws Exception {
        if (p.getNome() == null || p.getNome().length() < 1)
            throw new Exception("É necessário que você preencha o campo NOME");
        if (p.getCpf().length() > 14 || p.getCpf().length() < 14)
            throw new Exception("O campo CPF não foi preenchido correntamente \n"
                    + "Dica: um cpf não tem mais que 11 dígitos\n"
                    + "Dica: um cpf não tem menos que 11 digitos ou não pode ficar vazio");
        new PessoaFisicaPersistencia(p);
    }
}
