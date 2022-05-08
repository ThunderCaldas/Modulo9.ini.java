import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Teste{

    public static void main(String[] args){

        Cliente cli0 = new Cliente("Rosa", 25);
        Cliente cli1 = new Cliente("ANA", 27);
        Cliente cli2 = new Cliente("Marcia", 26);
        Cliente cli3 = new Cliente("ANA", 29);
        Cliente cli4 = new Cliente("Marcia", 30);
        Cliente cli5 = new Cliente("ANA", 39);
        Cliente cli6 = new Cliente("Marcia", 22);
        Cliente cli7 = new Cliente("ANA", 7);
        Cliente cli8 = new Cliente("Marcia", 2);
        Cliente cli9 = new Cliente("Marcia", 12);

        List<Cliente> listaCompras = Arrays.asList(cli0,cli1,cli2,cli3,cli4,cli5,cli6,cli7,cli8,cli9);
        Comparator<Cliente> listaMax = Comparator.comparing(Cliente::getCompras);
        Optional<Cliente> comprasMax = listaCompras.stream().max(listaMax);
        System.out.println(comprasMax);

        Comparator<Cliente> listaMin = Comparator.comparing(Cliente::getCompras);
        Optional<Cliente> comprasMin = listaCompras.stream().min(listaMin);
        System.out.println(comprasMin);

        Stream<Cliente> stream = listaCompras.stream();
        DoubleStream doubleStream = stream.mapToDouble(Cliente::getCompras);
        OptionalDouble media = doubleStream.average();
        System.out.println(media);

    }

}
