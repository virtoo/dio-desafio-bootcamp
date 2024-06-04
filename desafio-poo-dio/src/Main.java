import br.com.victor.dominio.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Cursos Back-End ----------------------------------------------
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Descrição Curso Java");
        cursoJava.setCargaHoraria(10);

        Curso cursoSpring = new Curso();
        cursoSpring.setTitulo("Curso Spring");
        cursoSpring.setDescricao("Descrição Curso Spring");
        cursoSpring.setCargaHoraria(8);

        Mentoria mentoriaBack = new Mentoria();
        mentoriaBack.setTitulo("Mentoria JAVA");
        mentoriaBack.setDescricao("Descrição Mentoria JAVA");
        mentoriaBack.setData(LocalDate.now());

        Bootcamp bootcampBack = new Bootcamp();
        bootcampBack.setNome("Bootcamp Java & Spring");
        bootcampBack.setDescricao("Descrição Bootcamp Java Back-end");
        bootcampBack.getConteudosSet().add(cursoJava);
        bootcampBack.getConteudosSet().add(cursoSpring);
        bootcampBack.getConteudosSet().add(mentoriaBack);

        // Cursos Front-End ----------------------------------------------
        Curso cursoJs = new Curso();
        cursoJs.setTitulo("Curso JavaScript");
        cursoJs.setDescricao("Descrição Curso JavaScript");
        cursoJs.setCargaHoraria(8);

        Curso cursoReact = new Curso();
        cursoReact.setTitulo("Curso React");
        cursoReact.setDescricao("Descrição Curso React");
        cursoReact.setCargaHoraria(9);

        Mentoria mentoriaFront = new Mentoria();
        mentoriaFront.setTitulo("Mentoria JS");
        mentoriaFront.setDescricao("Descrição Mentoria JS");
        mentoriaFront.setData(LocalDate.now());

        Bootcamp bootcampFront = new Bootcamp();
        bootcampFront.setNome("Bootcamp JavaScript & React");
        bootcampFront.setDescricao("Descrição Bootcamp JavaScript Front-end");
        bootcampFront.getConteudosSet().add(cursoJs);
        bootcampFront.getConteudosSet().add(cursoReact);
        bootcampFront.getConteudosSet().add(mentoriaFront);

        // Dev ------------------------------------------------------------
        Dev devVictor = new Dev();

        boolean sair = false;
        byte opcao;

        while (!sair) {
            System.out.println("=== Bootcamp Dev===");
            System.out.println("1 - Inscrever | 2 - Conteúdos Inscritos | 3 - Conteúdos Concluídos | 4 - Progredir | 0 - Sair");

            opcao = scan.nextByte();
            if (opcao == 1) {
                if (devVictor.getNome() == null){
                    System.out.println("Qual o seu nome?");
                    devVictor.setNome("Victor");

                    System.out.println("Qual Bootcamp quer se inscrever?");
                    System.out.println("1 - Front Js | 2 - Back Java");
                    opcao = scan.nextByte();

                    if (opcao == 1) {
                        devVictor.inscreverParaBootcamp(bootcampFront);
                        System.out.println("Você se inscreveu no Bootcamp Front!");
                    } else if (opcao == 2) {
                        devVictor.inscreverParaBootcamp(bootcampBack);
                        System.out.println("Você se inscreveu no Bootcamp Back!");
                    }
                } else {
                    System.out.println("Qual Bootcamp quer se inscrever?");
                    System.out.println("1 - Front Js | 2 - Back Java");
                    opcao = scan.nextByte();

                    if (opcao == 1) {
                        devVictor.inscreverParaBootcamp(bootcampFront);
                        System.out.println("Você se inscreveu no Bootcamp Front!");
                    } else if (opcao == 2) {
                        devVictor.inscreverParaBootcamp(bootcampBack);
                        System.out.println("Você se inscreveu no Bootcamp Back!");
                    }
                }
            } else if (opcao == 2) {
                System.out.println("Conteúdos Inscritos: " + devVictor.getConteudosInscritos());
            } else if (opcao == 3) {
                System.out.println("Conteúdos Concluidos: " + devVictor.getConteudosConcluidos());
                System.out.println("XP: " + devVictor.calcularTotalXp());
            } else if (opcao == 4) {
                devVictor.progredirAula();
            } else if (opcao == 0) {
                System.out.println("Saindo da Plataforma!");
                sair = true;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }

    // !!! Ainda Estudando !!!
//    public static void escolhaBootcamp(Dev dev, byte opcao){
//        if (opcao == 1) {
//            dev.inscreverParaBootcamp(bootcamp);
//            System.out.println("Você se inscreveu no Bootcamp Front!");
//        } else if (opcao == 2) {
//            dev.inscreverParaBootcamp(bootcamp);
//            System.out.println("Você se inscreveu no Bootcamp Back!");
//        }
//    }
}
