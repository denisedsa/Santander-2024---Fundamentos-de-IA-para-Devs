public class DaviNaBiblia {

    public static void main(String[] args) {
        // Origens e Juventude
        String nome = "Davi";
        String cidadeNatal = "Belém de Judá";
        String profissaoInicial = "pastor de ovelhas";
        String escolhaDivina = "Deus o escolheu como sucessor de Saul";

        System.out.println("1. Origens e Juventude:");
        System.out.println(nome + " era o filho mais novo de Jessé, de " + cidadeNatal + ".");
        System.out.println("Inicialmente, ele era um " + profissaoInicial + ", cuidando dos rebanhos de seu pai.");
        System.out.println(escolhaDivina + ", apesar de sua aparência humilde.");

        // Vitória sobre Golias
        String inimigo = "Golias";
        String arma = "funda e pedras";

        System.out.println("2. Vitória sobre " + inimigo + ":");
        System.out.println("A história mais famosa de " + nome + " é sua corajosa vitória sobre o gigante " + inimigo + ".");
        System.out.println("Armado apenas com uma " + arma + ", " + nome + " derrotou " + inimigo + ", demonstrando sua fé e confiança em Deus.");

        // Reinado e Legado
        String capital = "Jerusalém";
        String escritor = "muitos salmos";

        System.out.println("3. Reinado e Legado:");
        System.out.println(nome + " se tornou o segundo rei de Israel, sucedendo Saul.");
        System.out.println("Seu reinado foi marcado por guerras, vitórias e a organização dos serviços de adoração ao Senhor.");
        System.out.println("Ele consolidou o poder de Israel e estabeleceu " + capital + " como a capital.");
        System.out.println(nome + " também escreveu " + escritor + ", expressando seu amor, fé e humildade diante de Deus.");

        // Três Grandes Falhas
        String[] pecados = {"adulterou com Bate-Seba", "foi negligente como pai", "ordenou um censo imprudente"};

        System.out.println("4. Três Grandes Falhas:");
        System.out.println("Apesar de suas virtudes, " + nome + " também cometeu erros graves:");
        System.out.println("- " + pecados[0] + " e orquestrou a morte de Urias para encobrir o pecado.");
        System.out.println("- Sua falta de disciplina com os filhos causou problemas na família real.");
        System.out.println("- " + pecados[2] + ", desobedecendo a Deus e trazendo consequências para Israel.");

        System.out.println("Davi é lembrado como um homem segundo o coração de Deus, um líder, guerreiro, poeta e adorador. Sua história nos ensina sobre fé, arrependimento e a graça de Deus. 🙏📖");
    }

    @Override
    public String toString() {
        return "DaviNaBiblia []";
    }
}
