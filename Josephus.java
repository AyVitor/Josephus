 import java.util.ArrayList;
    import java.util.List;
    import java.util.Random;
    
    class Pessoa {
        String nome;
        String telefone;
        String endereco;
        String cpf;
        int numero;
    
        Pessoa(String nome, String telefone, String endereco, String cpf, int numero) {
            this.nome = nome;
            this.telefone = telefone;
            this.endereco = endereco;
            this.cpf = cpf;
            this.numero = numero;
        }
    
        @Override
        public String toString() {
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    ", telefone='" + telefone + '\'' +
                    ", endereco='" + endereco + '\'' +
                    ", cpf='" + cpf + '\'' +
                    ", numero=" + numero +
                    '}';
        }
    }
    
    public class Josephus {
        public static void main(String[] args) {
            
            List<Pessoa> pessoas = new ArrayList<>();
            for (int i = 1; i <= 20; i++) {
                pessoas.add(new Pessoa("Pessoa " + i, "Telefone " + i, "Endereco " + i, "CPF " + i, i));
            }
    
            
            Random random = new Random();
            int m = random.nextInt(20) + 1;  
            System.out.println("Valor de m escolhido aleatoriamente: " + m);
    
            
            int index = 0;
            while (pessoas.size() > 1) {
                index = (index + m - 1) % pessoas.size();
                System.out.println("Eliminando: " + pessoas.remove(index));
            }
    
            
            System.out.println("A pessoa sobrevivente é: " + pessoas.get(0));
        }
    }