package Teste;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Faturamento {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("faturamento.json"));

            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double somaFaturamento = 0;
            int diasComFaturamento = 0;

            for (Object o : jsonArray) {
                JSONObject jsonObject = (JSONObject) o;
                double valor = (double) jsonObject.get("faturamento");

                if (valor > 0) {
                    if (valor < menorFaturamento) {
                        menorFaturamento = valor;
                    }
                    if (valor > maiorFaturamento) {
                        maiorFaturamento = valor;
                    }
                    somaFaturamento += valor;
                    diasComFaturamento++;
                }
            }

            double mediaFaturamento = somaFaturamento / diasComFaturamento;
            int diasAcimaDaMedia = 0;

            for (Object o : jsonArray) {
                JSONObject jsonObject = (JSONObject) o;
                double valor = (double) jsonObject.get("faturamento");

                if (valor > mediaFaturamento) {
                    diasAcimaDaMedia++;
                }
            }

            System.out.println("Menor faturamento: " + menorFaturamento);
            System.out.println("Maior faturamento: " + maiorFaturamento);
            System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}
