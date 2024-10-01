public class Aluno {
    private String nome, situacao;
    private double nota1, nota2, nota3, media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void calcularMedia() {
        media = (nota1 + nota2 + nota3) / 3;
    }

    public void verificarSituacaoAluno() {
        calcularMedia();
        if (media >= 7){
            situacao = "Aprovado";
        } else if (media <= 6.9 && media >= 4) {
            situacao = "Recuperaçao";
        } else {
            situacao = "Reprovado";
        }
    }

    public void exibirDetalhes() {
        verificarSituacaoAluno();
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Situaçao: " + situacao);
    }
}
