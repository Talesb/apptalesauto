package br.edu.infnet.apptalesauto;

import br.edu.infnet.apptalesauto.model.domain.Vendedor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Component
public class VendedorLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        FileReader arquivo = new FileReader("files/vendedor.txt");
        BufferedReader leitor = new BufferedReader(arquivo);

        String linha = leitor.readLine();
        String[] campos;

        while (linha != null) {
            campos = linha.split(";");
            Vendedor vendedor = new Vendedor(campos[0], Integer.valueOf(campos[1]), Double.valueOf(campos[2]));
            System.out.println(vendedor);
            linha = leitor.readLine();
        }

    }
}
