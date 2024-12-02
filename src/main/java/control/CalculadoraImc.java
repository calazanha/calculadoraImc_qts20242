package control;

public class CalculadoraImc {

    public String calcularImc(double peso, double altura, int idade, String sexo) {
        if (peso <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Peso e altura devem ser maiores que zero.");
        }

        if (idade < 2 || idade > 120) {
            throw new IllegalArgumentException("Idade inválida. Deve ser entre 2 e 120 anos.");
        }

        if (!sexo.equalsIgnoreCase("masculino") && !sexo.equalsIgnoreCase("feminino")) {
            throw new IllegalArgumentException("Sexo inválido. Use 'masculino' ou 'feminino'.");
        }

        double imc = peso / (altura * altura);

        if (idade >= 20 && idade <= 65) { // Classificação para adultos
            if (imc < 16) return "Baixo peso muito grave";
            if (imc < 17) return "Baixo peso grave";
            if (imc < 18.5) return "Baixo peso";
            if (imc < 25) return "Peso normal";
            if (imc < 30) return "Sobrepeso";
            if (imc < 35) return "Obesidade Grau I";
            if (imc < 40) return "Obesidade Grau II";
            return "Obesidade Grau III";
        } else if (idade > 65) { // Classificação para idosos
            if (imc < 22) return "Baixo peso";
            if (imc <= 27) return "Peso normal";
            if (sexo.equalsIgnoreCase("feminino")) {
                if (imc <= 32) return "Sobrepeso";
                if (imc <= 37) return "Obesidade Grau I";
                if (imc <= 42) return "Obesidade Grau II";
                return "Obesidade Grau III";
            } else {
                if (imc <= 30) return "Sobrepeso";
                if (imc <= 35) return "Obesidade Grau I";
                if (imc <= 40) return "Obesidade Grau II";
                return "Obesidade Grau III";
            }
        } else { // Classificação para crianças
            if (sexo.equalsIgnoreCase("masculino")) {
                if (idade == 2) {
                    if (imc < 15) return "Baixo peso";
                    if (imc <= 18.2) return "Peso normal";
                    if (imc <= 19.2) return "Sobrepeso";
                    return "Obesidade";
                } else if (idade == 4) {
                    if (imc < 14.5) return "Baixo peso";
                    if (imc <= 16.8) return "Peso normal";
                    if (imc <= 17.8) return "Sobrepeso";
                    return "Obesidade";
                } else if (idade == 6) {
                    if (imc < 14) return "Baixo peso";
                    if (imc <= 17) return "Peso normal";
                    if (imc <= 18.3) return "Sobrepeso";
                    return "Obesidade";
                } else if (idade == 8) {
                    if (imc < 14.2) return "Baixo peso";
                    if (imc <= 17.8) return "Peso normal";
                    if (imc <= 20) return "Sobrepeso";
                    return "Obesidade";
                } else if (idade == 10) {
                    if (imc < 14.6) return "Baixo peso";
                    if (imc <= 19.4) return "Peso normal";
                    if (imc <= 22) return "Sobrepeso";
                    return "Obesidade";
                } else if (idade == 12) {
                    if (imc < 15.4) return "Baixo peso";
                    if (imc <= 20) return "Peso normal";
                    if (imc <= 24) return "Sobrepeso";
                    return "Obesidade";
                }
            } else { // Feminino
                if (idade == 2) {
                    if (imc < 14.2) return "Baixo peso";
                    if (imc <= 18) return "Peso normal";
                    if (imc <= 19) return "Sobrepeso";
                    return "Obesidade";
                } else if (idade == 4) {
                    if (imc < 14.2) return "Baixo peso";
                    if (imc <= 16.8) return "Peso normal";
                    if (imc <= 18) return "Sobrepeso";
                    return "Obesidade";
                } else if (idade == 6) {
                    if (imc < 13.8) return "Baixo peso";
                    if (imc <= 17) return "Peso normal";
                    if (imc <= 18.8) return "Sobrepeso";
                    return "Obesidade";
                } else if (idade == 8) {
                    if (imc < 14) return "Baixo peso";
                    if (imc <= 18.2) return "Peso normal";
                    if (imc <= 20.6) return "Sobrepeso";
                    return "Obesidade";
                } else if (idade == 10) {
                    if (imc < 14.6) return "Baixo peso";
                    if (imc <= 20) return "Peso normal";
                    if (imc <= 23) return "Sobrepeso";
                    return "Obesidade";
                } else if (idade == 12) {
                    if (imc < 15.4) return "Baixo peso";
                    if (imc <= 21.8) return "Peso normal";
                    if (imc <= 25) return "Sobrepeso";
                    return "Obesidade";
                }
            }
        }

        throw new IllegalArgumentException("Idade ou faixa não coberta.");
    }
}
