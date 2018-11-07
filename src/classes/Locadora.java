/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Meire
 */
public class Locadora {
    private final static int CARRO = 0;
    private final static int CAMINHAO = 1;
    private final static int MOTO = 2;
    private final static int BIKE = 3;
    private final static int PATINS = 4;
    private final static int SKATE = 5;
    private Locacao[] locacoes = new Locacao[10];
    private int qnt;

    public void add(Locacao locacao) {
        if (qnt < locacoes.length) {
            locacoes[qnt++] = locacao;
        }
    }

    public int getQuantidade() {
        return qnt;
    }

    public int getQuanitadeNaoFinalizadas() {
        int cont = 0;
        for (int i = 0; i < qnt; i++) {
            Locacao loc = locacoes[i];
            if (!loc.isFinalizado()) {
                cont++;
            }
        }
        return cont;
    }

    public String getQntTipoVeiculoNaoFinalizado() {
        int[] qnts = new int[6];
        for (int i = 0; i < qnt; i++) {
            Locacao loc = locacoes[i];
            if (!loc.isFinalizado()) {
                Veiculo veiculo = loc.getVeiculo();
                if (veiculo instanceof Carro) {
                    qnts[CARRO]++;
                } else if (veiculo instanceof Caminhao) {
                    qnts[CAMINHAO]++;
                } else if (veiculo instanceof Moto) {
                    qnts[MOTO]++;
                } else if (veiculo instanceof Bike) {
                    qnts[BIKE]++;
                } else if (veiculo instanceof Patins) {
                    qnts[PATINS]++;
                } else {
                    qnts[SKATE]++;
                }
            }
        }

        String tipo = "Carro";
        int cont = qnts[0];
        for (int i = 1; i < qnts.length; i++) {
            if (cont < qnts[i]) {
                cont = qnts[i];
                switch (i) {
                    case CAMINHAO:
                        tipo = "Caminhao";
                        break;
                    case MOTO:
                        tipo = "Moto";
                        break;
                    case BIKE:
                        tipo = "Bike";
                        break;
                    case SKATE:
                        tipo = "Skate";
                        break;
                    case PATINS:
                        tipo = "Patins";
                        break;
                }
            }
        }
        return tipo;
    }

    public String quantidadeLocacoesPorVeiculo() {
        int[] qnts = new int[6];
        for (int i = 0; i < qnt; i++) {
            Locacao loc = locacoes[i];
            if (!loc.isFinalizado()) {
                Veiculo veiculo = loc.getVeiculo();
                if (veiculo instanceof Carro) {
                    qnts[CARRO]++;
                } else if (veiculo instanceof Caminhao) {
                    qnts[CAMINHAO]++;
                } else if (veiculo instanceof Moto) {
                    qnts[MOTO]++;
                } else if (veiculo instanceof Bike) {
                    qnts[BIKE]++;
                } else if (veiculo instanceof Patins) {
                    qnts[PATINS]++;
                } else {
                    qnts[SKATE]++;
                }
            }
        }

        for (int i = 0; i < qnts.length; i++) {

            switch (i) {
                case CARRO:
                    System.out.println("Carro:" + qnts[CARRO]);
                    break;
                case CAMINHAO:
                    System.out.println("Caminhão:" + qnts[CAMINHAO]);
                    break;
                case MOTO:
                    System.out.println("Moto:" + qnts[MOTO]);
                    break;
                case BIKE:
                    System.out.println("Bike:" + qnts[BIKE]);
                    break;
                case SKATE:
                    System.out.println("Skate:" + qnts[SKATE]);
                    break;
                case PATINS:
                    System.out.println("Patins:" + qnts[PATINS]);
                    break;
            }
        }
        return null;
    }
}
