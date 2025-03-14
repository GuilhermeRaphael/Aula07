import br.com.etechas.enums.TipoCapaEnum;
import br.com.etechas.models.Editora;
import br.com.etechas.models.Livro;

public class TesteConstrutor {
    Editora editora = new Editora();

    Livro livro1 = new Livro();

    Livro livro2 = new Livro("Romeu Julieta");

    Livro livro3 = new Livro("Algoritmo" , editora);

    Livro l4 = new Livro("titulo","autor", 54, editora,
            89, "Resumo", TipoCapaEnum.DURA );
}
