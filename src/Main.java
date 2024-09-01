import ao.com.dio.desafio.dominio.Bootcamp;
import ao.com.dio.desafio.dominio.Curso;
import ao.com.dio.desafio.dominio.Dev;
import ao.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Git e github");
        curso1.setDescricao("Aprenda os pricipios de VCS");
        curso1.setCargaHoraria(2);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java Collections");
        curso2.setDescricao("Aprenda collections na pratica");
        curso2.setCargaHoraria(3);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("O mundo de APIs na Claro");
        mentoria1.setDescricao("Aprenda na pratica como a claro desenvolve apis");
        mentoria1.setData(LocalDate.now());

        Bootcamp javaClaro = new Bootcamp();
        javaClaro.setNome("Java Claro com spring boot");
        javaClaro.setDescricao("Desenvolvendo habilidades para se tornar num bom javeiro");
        javaClaro.getConteudos().add(mentoria1);
        javaClaro.getConteudos().add(curso2);
        javaClaro.getConteudos().add(curso1);

        Dev quixindo = new Dev();
        quixindo.setNome("Eufrasio QUixindo");
        quixindo.inscreverBootcamp(javaClaro);
        System.out.println("Conteudos inscritos"+quixindo.getConteudosInscritos());

        quixindo.progredir();

        System.out.println("-");
        System.out.println("Conteudos inscritos"+quixindo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos"+quixindo.getConteudosConcluidos());

        System.out.println("--------------------------------");

        Dev fabio = new Dev();
        fabio.setNome("Fabio FErnandes");
        fabio.inscreverBootcamp(javaClaro);
        System.out.println("Conteudos inscritos"+fabio.getConteudosInscritos());

        fabio.progredir();

        System.out.println("-");
        System.out.println("Conteudos inscritos"+fabio.getConteudosInscritos());
        System.out.println("Conteudos Concluidos"+quixindo.getConteudosConcluidos());
    }
}
