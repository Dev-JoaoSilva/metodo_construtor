public class Principal {
    public static void main(String[] args) {
        
        Carro car = new Carro();
        Carro carAro = new Carro(17);
        Carro carTresParametros = new Carro(17,"GTR","G4ERT5");
        Carro carQuatroParametros = new Carro(17,"GTR","G4ERT5","PRETO");

        System.out.println(carAro.getAro());
        System.out.println(carTresParametros.getAro()+" " +carTresParametros.getModelo()+" " +carTresParametros.getPlaca());
        System.out.println(carQuatroParametros.getAro()+" " +carQuatroParametros.getModelo()+" " +carQuatroParametros.getPlaca()+" " +carQuatroParametros.getCor());
    }
    
}
