import java.util.Arrays;
import java.util.List;

public class Main {
  // Fundamentos Java, primeiros códigos. Hello World!
  public static void main(String[] args) {
    List<String> nomes = Arrays.asList("Simão Pedro", "Aline Kelly", "Isabel Mendes", "Isadora Tereza");
    nomes.forEach(System.out::println);
  }
}