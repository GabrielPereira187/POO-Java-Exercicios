
import fatec.poo.model.PedidoCompra;
import fatec.poo.model.Pessoa;
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);

        //Definição da matriz de objetos 
        Pessoa[] cadPesFisJur = new Pessoa[20];
        PedidoCompra[] cadPedidos = new PedidoCompra[10];

        int opcao, cont = 0, cont1 = 0, anoInsc, anoAtual, pesqPes, numPed;
        double valBase, valCompra, txIncentivo, valPed;
        String nome, cpfcgc, tipoPes, dataPed;

        System.out.print("Digite o ano atual (aaaa) ===> ");
        anoAtual = entrada.nextInt();
        do {
            System.out.println("\n1 – Cadastrar Pessoa Física");
            System.out.println("2 – Cadastrar Pessoa Jurídica");
            System.out.println("3 – Emitir Pedido");
            System.out.println("4 – Listar Bonus");
            System.out.println("5 – Sair");
            System.out.print("\n\tDigite a opcao: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    //Verificação do limite da matriz de objetos
                    if (cont < cadPesFisJur.length) {
                        System.out.print("\nDigite o CPF: ");
                        cpfcgc = entrada.next();
                        System.out.print("Digite o nome: ");
                        nome = entrada.next();
                        System.out.print("Digite o ano de inscrição (aaaa): ");
                        anoInsc = entrada.nextInt();

                        //Instanciação de objetos da classe PessoaFisica
                        cadPesFisJur[cont] = new PessoaFisica(cpfcgc, nome, anoInsc);

                        System.out.print("Digite o valor base: ");
                        valBase = entrada.nextDouble();

                        //chamada do método setBase com downcasting
                        ((PessoaFisica) cadPesFisJur[cont]).setBase(valBase);

                        cont++;
                    } else {
                        System.out.println("\n\t\t-----------------------------------------");
                        System.out.println("\t\tQuantidade Maxima de Usuarios Cadastrados");
                        System.out.println("\t\t-----------------------------------------");
                    }
                    break;

                case 2:
                    //Verificação do limite da matriz de objetos
                    if (cont < cadPesFisJur.length) {
                        System.out.print("\nDigite o CGC: ");
                        cpfcgc = entrada.next();
                        System.out.print("Digite o nome: ");
                        nome = entrada.next();
                        System.out.print("Digite o ano de inscrição (aaaa): ");
                        anoInsc = entrada.nextInt();

                        //Instanciação de objetos da classe PessoaJuridica
                        cadPesFisJur[cont] = new PessoaJuridica(cpfcgc, nome, anoInsc);

                        System.out.print("Digite a taxa de incentivo(%): ");
                        txIncentivo = entrada.nextDouble();

                        //chamada do método setTaxaIncentivo com downcasting
                        ((PessoaJuridica) cadPesFisJur[cont]).setTaxaIncentivo(txIncentivo);

                        cont++;
                    } else {
                        System.out.println("\n\t\t-----------------------------------------");
                        System.out.println("\t\tQuantidade Maxima de Usuarios Cadastrados");
                        System.out.println("\t\t-----------------------------------------");
                    }
                    break;

                case 3:
                    //Verificação do limite da matriz de objetos
                    if (cont1 < cadPedidos.length) {
                        System.out.println("\n\nInforme o cpf/cgc: ");
                        cpfcgc = entrada.next();

                        if (pesqPessoa(cadPesFisJur, cpfcgc, cont) == -1) {
                            System.out.println("\n\t\t-------------------------------------");
                            System.out.println("\t\tPessoa Física/Jurídica não cadastrada");
                            System.out.println("\t\t-------------------------------------");
                        } else {
                            System.out.println("Digite o número do pedido: ");
                            numPed = entrada.nextInt();
                            System.out.println("Digite a data do pedido: ");
                            dataPed = entrada.next();
                            System.out.println("Digite o valor do Pedido: ");
                            valPed = entrada.nextDouble();

                            //Instanciação do objeto da classe PedidoCompra
                            cadPedidos[cont1] = new PedidoCompra(numPed);
                            cadPedidos[cont1].setDataPedido(dataPed);
                            cadPedidos[cont1].setValor(valPed);

                            //estabelecendo a associação binária bidirecional 
                            //entre PessoaFisica/PessoaJuridica e PedidoCompra
                            
                            
                            cadPesFisJur[pesqPessoa(cadPesFisJur, cpfcgc, cont)].addPedidoCompra(cadPedidos[cont1]);
                            
                            
                            
                            //associação
                            cadPedidos[cont1].setPessoa(cadPesFisJur[pesqPessoa(cadPesFisJur, cpfcgc, cont)]);

                            //adicionando o valor do pedido de compra em PessoaFisica
                            cadPesFisJur[pesqPessoa(cadPesFisJur, cpfcgc, cont)].addCompras(cadPedidos[cont1].getValor());
                            
                            cont1++;
                        }
                    } else {
                        System.out.println("\n\t\t-----------------------------------------");
                        System.out.println("\t\tQuantidade Maxima de Pedidos Cadastrados");
                        System.out.println("\t\t-----------------------------------------");
                    }
                    break;

                case 4:
                    if (cont > 0) {
                        System.out.printf("\n%-15s %-15s %-15s %-15s %10s\n", "Tipo", "CPF/CGC", "Nome", "Ano Inscrição", "Bonus");
                        for (int i = 0; i < cont; i++) {
                            if (cadPesFisJur[i] instanceof PessoaFisica) {
                                System.out.printf("%-15s %-15s %-15s %-15d %10s\n", "Pessoa Fisica",
                                        ((PessoaFisica) cadPesFisJur[i]).getCPF(),
                                        cadPesFisJur[i].getNome(),
                                        cadPesFisJur[i].getAnoInscricao(),
                                        df.format(cadPesFisJur[i].calcBonus(anoAtual)));

                            } else {
                                System.out.printf("%-15s %-15s %-15s %-15d %10s\n", "Pessoa Juridica",
                                        ((PessoaJuridica) cadPesFisJur[i]).getCGC(),
                                        cadPesFisJur[i].getNome(),
                                        cadPesFisJur[i].getAnoInscricao(),
                                        df.format(cadPesFisJur[i].calcBonus(anoAtual)));
                            }
                        }
                    } 
                    else {
                        System.out.println("\n\t\t----------------------------");
                        System.out.println("\t\tNão há cadastros para listar");
                        System.out.println("\t\t----------------------------");
                    }
                    break;
            }
        } while (opcao < 5);
    }

    public static int pesqPessoa(Pessoa[] cadastro, String cpfcgc, int qtdeFunc) {
        int cont, Resultado = -1;
        String valor;

        cont = 0;

        //utilizando o downcasting
        if (cadastro[cont] instanceof PessoaFisica) {
            valor = ((PessoaFisica)cadastro[cont]).getCPF();
        } else {
            valor = ((PessoaJuridica)cadastro[cont]).getCGC();
        }
        while (cont < qtdeFunc && !valor.equals(cpfcgc)) { 
            cont++; //posiciona no próximo

            if (cont < qtdeFunc && cadastro[cont] instanceof PessoaFisica) {
                valor = ((PessoaFisica)cadastro[cont]).getCPF();
            } else 
                if (cont < qtdeFunc && cadastro[cont] instanceof PessoaJuridica) {
                    valor = ((PessoaJuridica)cadastro[cont]).getCGC();
                }
        }
        if (cont < qtdeFunc) {
            Resultado = cont;
        }

        return (Resultado);
    }
}
