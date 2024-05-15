package com.exercicio;

public class Professor extends Pessoa {
    private Escolaridade escolaridade;
    private Curso coordenacao;
    private Escola direcao;

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Curso getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(Curso coordenacao) {
        this.coordenacao = coordenacao;
    }

    public Escola getDirecao() {
        return direcao;
    }

    public void setDirecao(Escola direcao) {
        this.direcao = direcao;
    }

    public String getNomeEscolaridade() {
        if (this.escolaridade == null) {
            return "Professor sem escolaridade";
        } else {
            return this.escolaridade.getNome();
        }
    }

    public String getEscolaridadeCoordenador() {
        if (this.coordenacao != null && this.coordenacao.getCoordenador() != null) {
            return this.coordenacao.getCoordenador().getNomeEscolaridade();
        }
        return "Coordenador não encontrado";
    }

    public String getEscolaridadeDiretor() {
        if (this.direcao != null && this.direcao.getDiretor() != null) {
            return this.direcao.getDiretor().getNomeEscolaridade();
        }
        return "Diretor não encontrado";
    }

    public String getNomeCoordenador() {
        if (this.coordenacao != null && this.coordenacao.getCoordenador() != null) {
            return this.coordenacao.getCoordenador().getNome();
        }
        return "Coordenador não encontrado";
    }

    // Método para obter o nome do diretor da escola
    public String getNomeDiretor() {
        if (this.direcao != null && this.direcao.getDiretor() != null) {
            return this.direcao.getDiretor().getNome();
        }
        return "Diretor não encontrado";
    }
}

