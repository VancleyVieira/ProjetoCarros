public class TestaCarros {
    public static void main(String[] args){
        Carros carro = new Carros(2013, "Gol", 30000.0);
        Carros outroCarro = new Carros("Civic", 66000.0);

        outroCarro.setAno(2014);

        System.out.println("Dados do primeiro carro: ");
        System.out.println("Ano: "+carro.getAno());
        System.out.println("Modelo: "+carro.getModelo());
        System.out.println("Preço: "+carro.getPreco());

        System.out.println("\nDados do segundo carro: ");
        System.out.println("Ano: "+outroCarro.getAno());
        System.out.println("Modelo: "+outroCarro.getModelo());
        System.out.println("Preco: "+outroCarro.getPreco());

    }
}
