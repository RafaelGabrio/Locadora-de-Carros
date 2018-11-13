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
        if (p.getIdade() == 0 || p.getIdade() < 0)
            throw new Exception("Idade informada é inválida. Por favor entre com um dado válido!!");
        if (p.getIdade() < 18 && (p.getCnh().equalsIgnoreCase("A") || p.getCnh().equalsIgnoreCase("B") || p.getCnh().equalsIgnoreCase("C")))
            throw new Exception("Menor de idade não possui CNH. Selecione a opção correta!");
        new PessoaFisicaPersistencia(p);
    }
}
