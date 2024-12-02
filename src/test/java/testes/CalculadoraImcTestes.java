package testes;

import control.CalculadoraImc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraImcTestes {

    CalculadoraImc calcImc;

    @Before
    public void setup() {
        calcImc = new CalculadoraImc();
    }

    //ADULTOS

    @Test
    public void testeAdultoBaixoPesoMuitoGrave() {
        Assert.assertEquals("Baixo peso muito grave", calcImc.calcularImc(46.0, 1.70, 20, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveLimiteInferior() {
        Assert.assertEquals("Baixo peso grave", calcImc.calcularImc(46.0, 1.66, 20, "feminino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveLimiteSuperior() {
        Assert.assertEquals("Baixo peso grave", calcImc.calcularImc(74.9, 2.10, 65, "feminino"));
    }

    @Test
    public void testeAdultoBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(46.0, 1.58, 20, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoLimiteSuperior() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(81.5, 2.10, 65, "masculino"));
    }

    @Test
    public void testeAdultoPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(46.0, 1.46, 20, "masculino"));
    }

    @Test
    public void testeAdultoPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(110.2, 2.10, 65, "masculino"));
    }

    @Test
    public void testeAdultoSobrepesoLimiteInferior() {//
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(53.3, 1.46, 20, "masculino"));
    }

    @Test
    public void testeAdultoSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(129.7, 2.08, 65, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauI_LimiteInferior() {
        Assert.assertEquals("Obesidade Grau I", calcImc.calcularImc(64.0, 1.46, 20, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauI_LimiteSuperior() {
        Assert.assertEquals("Obesidade Grau I", calcImc.calcularImc(126.3, 1.90, 65, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauII_LimiteInferior() {
        Assert.assertEquals("Obesidade Grau II", calcImc.calcularImc(74.7, 1.46, 20, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauII_LimiteSuperior() {
        Assert.assertEquals("Obesidade Grau II", calcImc.calcularImc(123.9, 1.76, 65, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauIII() {
        Assert.assertEquals("Obesidade Grau III", calcImc.calcularImc(85.3, 1.46, 40, "feminino"));
    }

    //IDOSOS
    //partes em comum do masculino e feminino

    @Test
    public void testeIdosoBaixoPesoLimite() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(63.5, 1.70, 66, "feminino"));
    }

    @Test
    public void testeIdosoPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(63.6, 1.70, 66, "masculino"));
    }

    @Test
    public void testeIdosoPesoNormalLimiteSuperior() { //mexer aqui
        Assert.assertEquals("Peso normal", calcImc.calcularImc(78.0, 1.70, 66, "feminino"));
    }

    //IDOSOS - idoso

    @Test
    public void testeIdosoMasculinoSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(87.5, 1.80, 66, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(97.2, 1.80, 66, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauI_LimiteInferior() {
        Assert.assertEquals("Obesidade Grau I", calcImc.calcularImc(97.3, 1.80, 66, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauI_LimiteSuperior() {
        Assert.assertEquals("Obesidade Grau I", calcImc.calcularImc(113.4, 1.80, 66, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauII_LimiteInferior() {
        Assert.assertEquals("Obesidade Grau II", calcImc.calcularImc(113.5, 1.80, 66, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauII_LimiteSuperior() {
        Assert.assertEquals("Obesidade Grau II", calcImc.calcularImc(129.6, 1.80, 66, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauIII() {
        Assert.assertEquals("Obesidade Grau III", calcImc.calcularImc(130.0, 1.80, 66, "masculino"));
    }

    //IDOSO - idosa

    @Test
    public void testeIdosaFemininaSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(69.2, 1.60, 66, "feminino"));
    }

    @Test
    public void testeIdosaFemininaSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(81.9, 1.60, 66, "feminino"));
    }

    @Test
    public void testeIdosaFemininaObesidadeGrauI_LimiteInferior() {
        Assert.assertEquals("Obesidade Grau I", calcImc.calcularImc(82.0, 1.60, 66, "feminino"));
    }

    @Test
    public void testeIdosaFemininaObesidadeGrauI_LimiteSuperior() {
        Assert.assertEquals("Obesidade Grau I", calcImc.calcularImc(94.7, 1.60, 66, "feminino"));
    }

    @Test
    public void testeIdosaFemininaObesidadeGrauII_LimiteInferior() {
        Assert.assertEquals("Obesidade Grau II", calcImc.calcularImc(94.8, 1.60, 66, "feminino"));
    }

    @Test
    public void testeIdosaFemininaObesidadeGrauII_LimiteSuperior() {
        Assert.assertEquals("Obesidade Grau II", calcImc.calcularImc(107.5, 1.60, 66, "feminino"));
    }

    @Test
    public void testeIdosaFemininaObesidadeGrauIII() {
        Assert.assertEquals("Obesidade Grau III", calcImc.calcularImc(107.6, 1.60, 66, "feminino"));
    }


    //Crianças
    // Testes para crianças masculinas de 2 anos
    @Test
    public void testeCriancaMasculina2AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(9.5, 0.89, 2, "masculino"));
    }

    @Test
    public void testeCriancaMasculina2AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(12.5, 0.89, 2, "masculino"));
    }

    @Test
    public void testeCriancaMasculina2AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(15.0, 0.89, 2, "masculino"));
    }

    @Test
    public void testeCriancaMasculina2AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(16.0, 0.89, 2, "masculino"));
    }

    // Testes para crianças femininas de 2 anos
    @Test
    public void testeCriancaFeminina2AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(9.0, 0.89, 2, "feminino"));
    }

    @Test
    public void testeCriancaFeminina2AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(12.5, 0.89, 2, "feminino"));
    }

    @Test
    public void testeCriancaFeminina2AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(15.0, 0.89, 2, "feminino"));
    }

    @Test
    public void testeCriancaFeminina2AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(16.0, 0.89, 2, "feminino"));
    }

    // Testes para crianças masculinas de 4 anos
    @Test
    public void testeCriancaMasculina4AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(12.0, 1.01, 4, "masculino"));
    }

    @Test
    public void testeCriancaMasculina4AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(15.5, 1.01, 4, "masculino"));
    }

    @Test
    public void testeCriancaMasculina4AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(18.0, 1.01, 4, "masculino"));
    }

    @Test
    public void testeCriancaMasculina4AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(20.0, 1.01, 4, "masculino"));
    }

    // Testes para crianças femininas de 4 anos
    @Test
    public void testeCriancaFeminina4AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(11.5, 1.01, 4, "feminino"));
    }

    @Test
    public void testeCriancaFeminina4AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(16.0, 1.01, 4, "feminino"));
    }

    @Test
    public void testeCriancaFeminina4AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(18.0, 1.01, 4, "feminino"));
    }

    @Test
    public void testeCriancaFeminina4AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(19.5, 1.01, 4, "feminino"));
    }

    // Testes para crianças masculinas de 6 anos
    @Test
    public void testeCriancaMasculina6AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(14.0, 1.10, 6, "masculino"));
    }

    @Test
    public void testeCriancaMasculina6AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(18.5, 1.10, 6, "masculino"));
    }

    @Test
    public void testeCriancaMasculina6AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(21.5, 1.10, 6, "masculino"));
    }

    @Test
    public void testeCriancaMasculina6AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(22.5, 1.10, 6, "masculino"));
    }

    // Testes para crianças femininas de 6 anos
    @Test
    public void testeCriancaFeminina6AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(13.5, 1.10, 6, "feminino"));
    }

    @Test
    public void testeCriancaFeminina6AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(17.5, 1.10, 6, "feminino"));
    }

    @Test
    public void testeCriancaFeminina6AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(21.5, 1.10, 6, "feminino"));
    }

    @Test
    public void testeCriancaFeminina6AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(23.5, 1.10, 6, "feminino"));
    }

    // Testes para crianças masculinas de 8 anos
    @Test
    public void testeCriancaMasculina8AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(16.0, 1.19, 8, "masculino"));
    }

    @Test
    public void testeCriancaMasculina8AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(20.5, 1.19, 8, "masculino"));
    }

    @Test
    public void testeCriancaMasculina8AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(25.5, 1.19, 8, "masculino"));
    }

    @Test
    public void testeCriancaMasculina8AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(28.5, 1.19, 8, "masculino"));
    }

    // Testes para crianças femininas de 8 anos
    @Test
    public void testeCriancaFeminina8AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(15.5,  1.17, 8, "feminino"));
    }

    @Test
    public void testeCriancaFeminina8AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(19.5,  1.17, 8, "feminino"));
    }

    @Test
    public void testeCriancaFeminina8AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(25.5,  1.17, 8, "feminino"));
    }

    @Test
    public void testeCriancaFeminina8AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(28.5,  1.17, 8, "feminino"));
    }

    // Testes para crianças masculinas de 10 anos
    @Test
    public void testeCriancaMasculina10AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(21.0,  1.40, 10, "masculino"));
    }

    @Test
    public void testeCriancaMasculina10AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(29.5,  1.40, 10, "masculino"));
    }

    @Test
    public void testeCriancaMasculina10AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(38.5, 1.40, 10, "masculino"));
    }

    @Test
    public void testeCriancaMasculina10AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(46.0, 1.40, 10, "masculino"));
    }

    // Testes para crianças femininas de 10 anos
    @Test
    public void testeCriancaFeminina10AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(24.5, 1.40, 10, "feminino"));
    }

    @Test
    public void testeCriancaFeminina10AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(29.5, 1.40, 10, "feminino"));
    }

    @Test
    public void testeCriancaFeminina10AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(41.0, 1.40, 10, "feminino"));
    }

    @Test
    public void testeCriancaFeminina10AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(48.6, 1.40, 10, "feminino"));
    }

    // Testes para crianças masculinas de 12 anos
    @Test
    public void testeCriancaMasculina12AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(32.0, 1.50, 12, "masculino"));
    }

    @Test
    public void testeCriancaMasculina12AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(43.5, 1.50, 12, "masculino"));
    }

    @Test
    public void testeCriancaMasculina12AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(57.5, 1.50, 28, "masculino"));
    }

    @Test
    public void testeCriancaMasculina12AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(67.5, 1.50, 12, "masculino"));
    }

    // Testes para crianças femininas de 12 anos
    @Test
    public void testeCriancaFeminina12AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(31.5, 1.50, 12, "feminino"));
    }

    @Test
    public void testeCriancaFeminina12AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(42.0, 1.50, 12, "feminino"));
    }

    @Test
    public void testeCriancaFeminina12AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(50.0, 1.50, 12, "feminino"));
    }

    @Test
    public void testeCriancaFeminina12AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(61.7, 1.50, 12, "feminino"));
    }
}
