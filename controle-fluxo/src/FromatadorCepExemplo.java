public class FromatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("69308240");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8)
            throw new CepInvalidoException();

//            Simulando um cep formatado
        return "69.308-240";

    }
}
