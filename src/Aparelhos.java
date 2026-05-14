import java.io.*;
import java.text.DecimalFormat;
public class Aparelhos
{
    private int codigo;
    private String smart;
    private int polegadas;
    private float preco;
    private DecimalFormat mt;

    // Construtor
    public Aparelhos(int codigo, String smart, int polegadas, float preco)
    {
        this.codigo = codigo;
        this.smart = smart;
        this.polegadas = polegadas;
        this.preco = preco;
        mt = new DecimalFormat("###,###.00MT");
    }

    // Getters
    public int getCodigo()
    {
        return codigo;
    }

    public String getSmart()
    {
        return smart;
    }

    public int getPolegadas()
    {
        return polegadas;
    }

    public float getPreco()
    {
        return preco;
    }

    public String toString()
    {
        return "Codigo "+codigo+
                " Smart "+smart+
                " Polegadas "+polegadas+
                " Preco "+mt.format(preco);
    }
}
