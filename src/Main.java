import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descrição curso java");
        curso2.setCargaHoraria(35);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEster = new Dev();
        devEster.setNome("Ester");
        devEster.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ester:" + devEster.getConteudosInscritos());
        devEster.progredir();
        devEster.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ester:" + devEster.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ester:" + devEster.getConteudosConcluidos());
        System.out.println("XP:" + devEster.calcularTotalXp());

        System.out.println("-------");

        Dev devJack = new Dev();
        devJack.setNome("Jack");
        devJack.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jack:" + devJack.getConteudosInscritos());
        devJack.progredir();
        devJack.progredir();
        devJack.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jack:" + devJack.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Jack:" + devJack.getConteudosConcluidos());
        System.out.println("XP:" + devJack.calcularTotalXp());

    }

}
