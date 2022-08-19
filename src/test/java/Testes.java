import br.com.itbeta.ClassificadorFuncionarios;
import br.com.itbeta.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Testes {

    private static final List<Funcionario> funcionarios = Arrays.asList(
            new Funcionario("José Almeida",1000D, Funcionario.Categoria.DESENVOLVEDOR),
            new Funcionario("José Dias",10000D, Funcionario.Categoria.GERENCIAL),
            new Funcionario("José Oliveira",3000D, Funcionario.Categoria.DESENVOLVEDOR),
            new Funcionario("José Alves",5000D, Funcionario.Categoria.ANALISTA),
            new Funcionario("José Barros",3000D, Funcionario.Categoria.DESENVOLVEDOR),
            new Funcionario("José Souza",10000D, Funcionario.Categoria.GERENCIAL),
            new Funcionario("José Bruno",10000D, Funcionario.Categoria.GERENCIAL),
            new Funcionario("José Gonçalves",10000D, Funcionario.Categoria.GERENCIAL),
            new Funcionario("José Ferreira",2000D, Funcionario.Categoria.DESENVOLVEDOR),
            new Funcionario("José Silva",3000D, Funcionario.Categoria.DESENVOLVEDOR),
            new Funcionario("José Alcântara",10000D, Funcionario.Categoria.GERENCIAL)
    );

    private static Map<Funcionario.Categoria,List<Funcionario>> resultado;

    @BeforeAll
    static void executaFuncaoAlvo(){
        ClassificadorFuncionarios classificador = new ClassificadorFuncionarios();
        resultado = classificador.classificaFuncionarios(funcionarios);
    }

    @Test
    @DisplayName("Categoria Desenvolvedor só deve ter desenvolvedores")
    public void desenvolvedoresCategoria(){
        List<Funcionario> devs = resultado.get(Funcionario.Categoria.DESENVOLVEDOR);
        devs.forEach(funcionario -> {
            Assertions.assertEquals(funcionario.categoria, Funcionario.Categoria.DESENVOLVEDOR);
        });
    }
    @Test
    @DisplayName("Categoria Gerencial só deve ter gerentes")
    public void gerencialCategoria(){
        List<Funcionario> devs = resultado.get(Funcionario.Categoria.GERENCIAL);
        devs.forEach(funcionario -> {
            Assertions.assertEquals(funcionario.categoria, Funcionario.Categoria.GERENCIAL);
        });
    }
    @Test
    @DisplayName("Categoria Analista só deve ter analistas")
    public void analistaCategoria(){
        List<Funcionario> devs = resultado.get(Funcionario.Categoria.ANALISTA);
        devs.forEach(funcionario -> {
            Assertions.assertEquals(funcionario.categoria, Funcionario.Categoria.ANALISTA);
        });
    }
}
