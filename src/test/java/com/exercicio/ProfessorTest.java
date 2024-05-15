package com.exercicio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    public void deveRetornarEscolaridadeProfessor() {
        Professor professor = new Professor();
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Doutorado");
        professor.setEscolaridade(escolaridade);

        String resultado = professor.getNomeEscolaridade();
        System.out.println("Escolaridade do professor: " + resultado);
        assertEquals("Doutorado", resultado);
    }

    @Test
    public void deveRetornarEscolaridadeProfessorOpcional() {
        Professor professor = new Professor();
        String resultado = professor.getNomeEscolaridade();
        System.out.println("Escolaridade do professor (opcional): " + resultado);
        assertEquals("Professor sem escolaridade", resultado);
    }

    @Test
    public void deveRetornarEscolaridadeCoordenador() {
        Professor coordenador = new Professor();
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Mestrado");
        coordenador.setEscolaridade(escolaridade);

        Curso curso = new Curso();
        curso.setCoordenador(coordenador);

        Professor professor = new Professor();
        professor.setCoordenacao(curso);

        String resultado = professor.getEscolaridadeCoordenador();
        System.out.println("Escolaridade do coordenador: " + resultado);
        assertEquals("Mestrado", resultado);
    }

    @Test
    public void deveRetornarEscolaridadeDiretor() {
        Professor diretor = new Professor();
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Doutorado");
        diretor.setEscolaridade(escolaridade);

        Escola escola = new Escola();
        escola.setDiretor(diretor);

        Professor professor = new Professor();
        professor.setDirecao(escola);

        String resultado = professor.getEscolaridadeDiretor();
        System.out.println("Escolaridade do diretor: " + resultado);
        assertEquals("Doutorado", resultado);
    }

    @Test
    public void deveRetornarNomeCoordenador() {
        Professor coordenador = new Professor();
        coordenador.setNome("Coordenador A");

        Curso curso = new Curso();
        curso.setCoordenador(coordenador);

        Professor professor = new Professor();
        professor.setCoordenacao(curso);

        String resultado = professor.getNomeCoordenador();
        System.out.println("Nome do coordenador: " + resultado);
        assertEquals("Coordenador A", resultado);
    }

    @Test
    public void deveRetornarNomeDiretor() {
        Professor diretor = new Professor();
        diretor.setNome("Diretor B");

        Escola escola = new Escola();
        escola.setDiretor(diretor);

        Professor professor = new Professor();
        professor.setDirecao(escola);

        String resultado = professor.getNomeDiretor();
        System.out.println("Nome do diretor: " + resultado);
        assertEquals("Diretor B", resultado);
    }
}
