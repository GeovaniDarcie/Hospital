import java.io.Serializable;

public class Paciente implements Serializable  {
    
    private static final long serialVersionUID = 1L;
    private String codigo;
    private String nome;
    private int idade;
    private float altura, pressao, peso;

    public Paciente(String codigo, String nome, int idade, float altura, 
                    float pressao, float peso) {
        
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.pressao = pressao;
        this.peso = peso;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public String getCodigo() {
        return this.codigo;
    }
    
    public float getPressao() {
        return this.pressao;
    }
    
    public float getPeso() {
        return this.peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPressao(float pressao) {
        this.pressao = pressao;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
