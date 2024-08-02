package br.edu.infnet.apptalesauto;

import br.edu.infnet.apptalesauto.model.domain.Carro;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;


@Component
public class CarroLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        FileReader arquivo = new FileReader("files/carro.txt");
        BufferedReader leitor = new BufferedReader(arquivo);

        String linha = leitor.readLine();
        String[] campos;

        while (linha != null) {
            campos = linha.split(";");
            Carro carro = new Carro(campos[0], campos[1], Integer.valueOf(campos[2]), Double.valueOf(campos[3]), Boolean.valueOf(campos[4]));
            System.out.println(carro);
            linha = leitor.readLine();

        }

    }
}
