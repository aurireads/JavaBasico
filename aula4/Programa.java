package aula4;

public class Programa {
    public static void main(String[] args){

        Carro van = new Carro();
        van.marca = "Toyota";
        van.modelo = "Hiace";
        van.capCombustivel = 76;
        van.numPassageiro = 10;
        van.consCombustivel = 10.2;

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.capCombustivel = 42;
        fusca.numPassageiro = 4;
        fusca.consCombustivel = 8.6;

        System.out.println("--- impressão de objeto [fisico]");
        System.out.println(van);
        System.out.println("modelo: "+van.modelo+" | automonia: "+van.calculaAutonomia());
        System.out.println("eco taxa: " +van.verificarEcoDesempenho());
        if(van.validaEcoDesempenho(105) == true){
            System.out.println("eco eficiente.");
        }else{
            System.out.println("não é eco eficiente");
        }
        System.out.println(fusca);
        System.out.println("modelo: "+fusca.modelo+" | autonomia: "+fusca.calculaAutonomia());
        System.out.println("eco taxa: " +fusca.verificarEcoDesempenho());
        if(fusca.validaEcoDesempenho(106) == true){
            System.out.println("eco eficiente");
        }else{
            System.out.println("não é eco eficiente");
        }
    }
}
