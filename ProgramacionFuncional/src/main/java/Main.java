import expresiones_lambda.*;
import interfaz_funcional.ISaludar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        //interfazFuncional();

        //expresionesLambda();

        //ejemplosStream();

        //ejerciciosStream();

    }

    private static void interfazFuncional() {
        ISaludar saludar = nombre -> System.out.println("Hola " + nombre);
        saludar.saluda("Andres");
    }

    private static void expresionesLambda(){
        //Ejercicio 1: Crear una función anónima que nos permita calcular el promedio de un arreglo de números enteros.
        int[] numeros = {5,4,3,2,4,15,1,3};
        IEjercicio1 promedio = arreglo -> {
            double resultado = 0;
            for(int numero: arreglo) resultado += numero;
            return resultado / arreglo.length;
        };
        System.out.println("El promedio es: " + promedio.getPromedio(numeros));

        //Ejercicio 2: Crear una función anónima que calcule el factorial dado un número entero.
        IEjercicio2 factorial = numero -> {
            if(numero < 0){
                System.out.println("Introduce un número positivo");
                return -1;
            }
            int suma = 1;
            for(int i = 1; i < numero + 1; i++){
                suma *= i;
            }
            return suma;
        };
        int resultadoFactorial = factorial.getFactorial(5);
        if(resultadoFactorial != -1) System.out.println("El factorial es: " + resultadoFactorial);

        //Ejercicio 3: Crear una función anónima que permita conocer si un número es par.
        IEjercicio3 numeroPar = numero -> {
            if(numero % 2 == 0) return "El número es par";
            else return "El número es impar";
        };
        System.out.println(numeroPar.esPar(16));

        //Ejercicio 4: Dado un arreglo de números enteros, crear una función anónima que retorne el número mayor.
        IEjercicio4 numeroMayor = arreglo -> {
            int mayor = 0;
            for(int numero: arreglo){
                if(numero > mayor) mayor = numero;
            }
            return mayor;
        };
        System.out.println("El número mayor del arreglo es: " + numeroMayor.getMayor(numeros));

        //Ejercicio 5: Dado un arreglo de números enteros, crear una función anónima que retorne el número menor.
        IEjercicio5 numeroMenor = arreglo -> {
            int menor = arreglo[0];
            for(int numero: arreglo){
                if(numero < menor) menor = numero;
            }
            return menor;
        };
        System.out.println("El número menor del arreglo es: " + numeroMenor.getMenor(numeros));

        //Ejercicio 6: Dado un arreglo de números enteros, crear una función anónima que retorne el número que más se repite.
        IEjercicio6 masRepetido = arreglo -> {
            String cadena = "";
            int bandera = 0;
            for(int i = 0; i < arreglo.length; i++){
                int repetido = -1;
                for(int j = 0; j < arreglo.length; j++){
                    if(arreglo[i] == arreglo[j]) repetido++;
                }
                if(repetido > bandera){
                    cadena = String.valueOf(arreglo[i]);
                    bandera = repetido;
                }else if(repetido == bandera){
                    if(!cadena.contains(String.valueOf(arreglo[i]))){
                        cadena += ", " + String.valueOf(arreglo[i]);
                        bandera = repetido;
                    }
                }
            }
            return cadena;
        };
        System.out.println("Los números mas repetidos son: " + masRepetido.getMasRepetidos(numeros));

        //Ejercicio 7: Crear una función anónima que reciba como parámetro 3 numeros enteros. La función retorna el número mayor.
        IEjercicio7 mayorDeTres = (numero1, numero2, numero3) -> {
            if(numero1 >= numero2 && numero1 >= numero3) return numero1;
            else if(numero2 >= numero1 && numero2 >= numero3) return numero2;
            else return numero3;
        };
        System.out.println("El número mayor entre los 3 es: " + mayorDeTres.getMayor(7, 7, 8));

        //Ejercicio 8: Crear una función anónima que reciba dos parámetros, un string y un numero entero. La función retorna un
        //string el cual será el resultado de multiplicar ambos parámetros.
        IEjercicio8 repetir = (cadena, repeticiones) -> {
            String cadenaFinal = "";
            for(int i = 0; i < repeticiones; i++){
                cadenaFinal += cadena;
            }
            return cadenaFinal;
        };
        System.out.println(repetir.repetirCadena("Hola", 5));
    }

    private static void ejemplosStream() {

        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(5, 7, 3, 6, 9));

        ArrayList<Book> libros = new ArrayList<>();
        libros.add(new Book("El hobbit", 55));
        libros.add(new Book("El Quijote", 155));
        libros.add(new Book("El pingüino feliz", 350));
        libros.add(new Book("El señor de los anillos", 500));
        libros.add(new Book("El Principito", 120));

        //Ejercicios con tipos de datos
        List<String> resultado = numeros.stream().map(n -> n >= 6 ? "Aprovado" : "Reprobado").collect(Collectors.toList());

        int sumaNotas = numeros.stream().mapToInt(n -> n).sum();

        double promedio = numeros.stream().mapToInt(n -> n).average().orElse(0);

        int menor = numeros.stream().mapToInt(n -> n).min().orElse(0);

        String cadena = Stream.of("Java", "C", "Python", "Ruby")
                .reduce("", (acumula, lenguaje) -> acumula.equals("") ? lenguaje : acumula + " | " + lenguaje);

        List<Integer> ordenadosAsc = numeros.stream().sorted().collect(Collectors.toList());

        List<Integer> ordenadosDesc = numeros.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        //Para ordenar la lista con objetos mas complejos debemos crear un comparador
        List<Book> ordenadosPaginas = libros.stream().sorted(Comparator.comparing(book -> book.getPaginas())).collect(Collectors.toList());

        List<Book> ordenadosPaginasReversa = libros.stream().sorted(Comparator.comparing(Book::getPaginas).reversed()).collect(Collectors.toList());

        List<Book> ordenadosConLimite = libros.stream().sorted(Comparator.comparing(Book::getPaginas)).limit(3).collect(Collectors.toList());

        System.out.println(resultado);
        System.out.println(sumaNotas);
        System.out.println(promedio);
        System.out.println(menor);
        System.out.println(cadena);
        System.out.println(ordenadosAsc);
        System.out.println(ordenadosDesc);
        System.out.println(ordenadosPaginas);
        System.out.println(ordenadosPaginasReversa);
        System.out.println(ordenadosConLimite);
    }

    private static void ejerciciosStream(){
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300 ));

        //Ejercicio 1: Obtener la cantidad de cursos con una duración mayor a 5 horas.
        int mayorCincoHoras = (int) cursos.stream().filter(curso -> curso.getDuracion() > 5).count();
        System.out.println("Cursos con duración mayor a 5 horas: " + mayorCincoHoras + "\n");

        //Ejercicio 2: Obtener la cantidad de cursos con una duración menor a 2 horas.
        int menorDosHoras = (int) cursos.stream().filter(curso -> curso.getDuracion() < 2).count();
        System.out.println("Cursos con duración menor a 2 horas: " + menorDosHoras + "\n");

        //Ejercicio 3: Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50.
        System.out.println("Título de cursos con mas de 50 videos:");
        cursos.stream().filter(curso -> curso.getVideos() > 50).forEach(curso -> {
            System.out.println(curso.getTitulo());
        });

        //Ejercicio 4: Mostrar en consola el título de los 3 cursos con mayor duración.
        Comparator<Curso> comparadorDuración = Comparator.comparing(Curso::getDuracion);

        System.out.println("\nTítulo de los 3 cursos con mayor duración:");
        cursos.stream().sorted(comparadorDuración.reversed()).limit(3).forEach(curso -> {
            System.out.println(curso.getTitulo());
        });

        //Ejercicio 5: Mostrar en consola la duración total de todos los cursos.
        double duracionTotal = cursos.stream().mapToDouble(Curso::getDuracion).sum();
        System.out.println("\nLa duración total de todos los cursos es: " + duracionTotal);

        //Ejercicio 6: Mostrar en consola todos aquellos libros que superen el promedio en cuanto a duración se refiere.
        double promedioDuracion = cursos.stream().mapToDouble(Curso::getDuracion).average().orElse(0);
        System.out.println("\nCursos que superan el promedio de duracion: ");
        cursos.stream().filter(curso -> curso.getDuracion() > promedioDuracion).forEach(System.out::println);

        //Ejercicio 7: Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500.
        System.out.println("\nDuración de cursos con menos de 500 alumnos");
        cursos.stream().filter(curso -> curso.getAlumnos() < 500).forEach(curso -> System.out.println(curso.getDuracion()));

        //Ejercicio 8: Obtener el curso con mayor duración.
        Curso cursoMayorDuracion = cursos.stream().max(comparadorDuración).orElse(null);
        System.out.println("\nCurso con mayor duración: " + cursoMayorDuracion);

        //Ejercicio 9: Crear una lista de Strings con todos los titulos de los cursos.
        System.out.println("\nTítulo de todos los cursos: ");
        List<String> titulos = cursos.stream().map(Curso::getTitulo).collect(Collectors.toList());
        titulos.forEach(System.out::println);
    }

}
