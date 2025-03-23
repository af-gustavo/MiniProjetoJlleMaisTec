package main;

import java.util.Scanner;
import models.AreaVerde;
import models.Avaliacao;
import models.Localizacao;
import repositories.AreaVerdeRepository;
import repositories.AvaliacaoRepository;
import repositories.LocalizacaoRepository;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean exec = false;
        int option;

        AreaVerdeRepository areaVerdeRepository = new AreaVerdeRepository();
        AvaliacaoRepository avaliacaoRepository = new AvaliacaoRepository();
        LocalizacaoRepository localizacaoRepository = new LocalizacaoRepository();

        while (exec == false) {
            System.out.println("O que você deseja fazer?\n");
            System.out.println("1 - Listar áreas verdes");
            System.out.println("2 - Avaliar área verde");
            System.out.println("3 - Ver detalhe de uma área verde");
            System.out.println("4 - Cadastrar uma nova área verde");
            System.out.println("5 - Sair do programa\n");
            System.out.print("Digite a opção desejada: ");
            option = Integer.parseInt(input.nextLine());
            System.out.println();

            switch (option) {
                case 1 ->
                    listarAreasVerdes(areaVerdeRepository, avaliacaoRepository);
                case 2 ->
                    avaliarAreaVerde(input, avaliacaoRepository);
                case 3 ->
                    verDetalheAreaVerde(input, areaVerdeRepository, avaliacaoRepository); //verDetalheAreaVerde;
                case 4 ->
                    cadastrarAreaVerde(input, areaVerdeRepository, localizacaoRepository);
                case 5 ->
                    exec = true;
                default ->
                    System.out.println("Selecione uma opção válida.");
            }
        }
    }

    private static void listarAreasVerdes(AreaVerdeRepository areaVerdeRepository, AvaliacaoRepository avaliacaoRepository) {
        if (areaVerdeRepository.size() == 0) {
            System.out.println("\nNenhuma área verde cadastrada.\nCadastre uma nova área verde.\n");
        } else {
            for (int i = 0; i < areaVerdeRepository.size(); i++) {
                System.out.println(areaVerdeRepository.buscar(i).toStringListagem(avaliacaoRepository));
            }
        }
    }

    private static void avaliarAreaVerde(Scanner input, AvaliacaoRepository avaliacaoRepository) {
        Avaliacao novaAvaliacao = new Avaliacao();

        System.out.print("Digite o id da área verde que deseja avaliar:");
        int id = Integer.parseInt(input.nextLine());
        System.out.println();

        novaAvaliacao.setIdentificador(id);

        System.out.print("Digite a nota para a quantidade de árvores da área verde: ");
        int quantidadeArvores = Integer.parseInt(input.nextLine());
        novaAvaliacao.setQtdArvores(quantidadeArvores);

        System.out.print("Digite a nota para a qualidade do ar da área verde: ");
        int qualidadeAr = Integer.parseInt(input.nextLine());
        novaAvaliacao.setQualiAr(qualidadeAr);

        System.out.print("Digite a nota para a poluição sonora da área verde: ");
        int poluicaoSonora = Integer.parseInt(input.nextLine());
        novaAvaliacao.setPoluicaoSonora(poluicaoSonora);

        System.out.print("Digite a nota para a coleta de resíduos da área verde: ");
        int coletaResiduos = Integer.parseInt(input.nextLine());
        novaAvaliacao.setColetaResiduos(coletaResiduos);

        System.out.print("Digite a nota para o transporte público da área verde: ");
        int transPublico = Integer.parseInt(input.nextLine());
        novaAvaliacao.setTransPublico(transPublico);

        avaliacaoRepository.salvar(novaAvaliacao);

        System.out.println();
    }

    private static void verDetalheAreaVerde(Scanner input, AreaVerdeRepository areaVerdeRepository, AvaliacaoRepository avaliacaoRepository) {

        System.out.print("Digite o id da área verde que deseja ver detalhes: ");
        int id = Integer.parseInt(input.nextLine());

        System.out.println(areaVerdeRepository.buscar(id - 1).toStringDetalhes(avaliacaoRepository));
    }

    private static void cadastrarAreaVerde(Scanner input, AreaVerdeRepository areaVerdeRepository, LocalizacaoRepository localizacaoRepository) {
        AreaVerde novaAreaVerde = new AreaVerde();

        System.out.print("Digite o nome da área verde:");
        String nome = input.nextLine();
        novaAreaVerde.setNome(nome);

        System.out.print("Digite o tipo de vegetação da área verde:");
        String tipoVegetacao = input.nextLine();
        novaAreaVerde.setTipoVegetacao(tipoVegetacao);

        System.out.print("Digite o horário de funcionamento da área verde:");
        String horario = input.nextLine();
        novaAreaVerde.setHorario(horario);

        System.out.print("Digite as atividades da área verde:");
        String atividades = input.nextLine();
        novaAreaVerde.setAtividades(atividades);

        areaVerdeRepository.salvar(novaAreaVerde);

        Localizacao novaLocalizacao = new Localizacao();

        System.out.print("Digite a latitude da área verde: ");
        double latitude = Double.parseDouble(input.nextLine());
        System.out.print("Digite a longitude da área verde: ");
        double longitude = Double.parseDouble(input.nextLine());
        novaLocalizacao.setCoordenadas(latitude, longitude);
        novaAreaVerde.setLocalizacao(novaLocalizacao);

        localizacaoRepository.salvar(novaLocalizacao);

        System.out.printf("\nNova área verde cadastrada com sucesso! Número da área verde: %d.%n\n", novaAreaVerde.getId());
    }

}
