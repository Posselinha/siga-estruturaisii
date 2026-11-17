package siga;

public class ComMarcaDagua extends DecoradorRelatorio {

    public ComMarcaDagua(Relatorio interno) {
        super(interno);
    }

    @Override
    public String gerar() {
        return interno.gerar()
             + "\n*** RASCUNHO — NAO E DOCUMENTO OFICIAL ***";
    }
}