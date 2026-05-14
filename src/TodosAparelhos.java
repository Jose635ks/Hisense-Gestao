import java.util.StringTokenizer;
import java.io.*;
import java.text.DecimalFormat;

public class TodosAparelhos
{
    private float total;
    private int contSmart50;
    private DecimalFormat mt;

    // Construtor
    public TodosAparelhos()
    {
        total = 0;
        contSmart50 = 0;
        mt = new DecimalFormat("###,###.00MT");
    }

    public void processarFicheiro(String nf)
    {
        StringTokenizer str;
        String umaLinha = "", smart = "";
        int codigo;
        int polegadas = 0;
        float preco = 0;

        try
        {
            FileReader fr = new FileReader(nf);
            BufferedReader br = new BufferedReader(fr);
            umaLinha = br.readLine();

            System.out.println("Lista de Tvs");

            while (umaLinha != null)
            {
                str = new StringTokenizer(umaLinha, " ");
                smart = str.nextToken();
                codigo = Integer.parseInt(str.nextToken());
                polegadas = Integer.parseInt(str.nextToken());
                preco = Float.parseFloat(str.nextToken());

                Aparelhos ap = new Aparelhos(codigo,smart,polegadas,preco);

                // Mostrar dados da TV
                System.out.println(ap);

                // Aplicar aumento se for smart
                if (smart.equalsIgnoreCase("sim"))
                {
                    preco = preco * 20 / 100f;
                }
                total += preco;

                //Contar smart acima de 50
                if (smart.equalsIgnoreCase("sim") && polegadas > 50)
                {
                    contSmart50++;
                }

                umaLinha = br.readLine(); // Salta para a proxima Linha
            }
            br.close();

        } catch (FileNotFoundException a)
        {
            System.out.println("Ficheiro " + nf + "nao encontrado!");
        } catch (NumberFormatException nb)
        {
            System.out.println(nb.getMessage());
        } catch (IOException b)
        {
            System.out.println(b.getMessage());
        }
    }

    public void mostrarResultados()
    {
        System.out.println("Valor total (com Acrescimo nas smart): " + mt.format(total));
        System.out.println("Numero de smart TVs acima de 50 polegadas:  " + contSmart50);
    }
}
