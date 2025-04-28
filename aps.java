import java.util.Scanner;

public class aps {
        public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        char repetir = '1';
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Seja bem vindo(a), " + nome );
        System.out.println();
        while(repetir == '1' ) { 
        System.out.println("---SAIBA MAIS SOBRE A LUTA FEMININA!!---");
        System.out.println();
        System.out.println("Digite um número receberá uma informação relevante! " + '\n' + " [1] " + '\n' + " [2] " + '\n' + " [3] " + '\n' + " [4] ");
        char num = sc.next().charAt(0);
        sc.nextLine();
        System.out.println();
        String borda = "+----------------------------------------------------------------------------+";
        
        switch (num) {
            case '1':
            System.out.println(borda);
            System.out.println("            INFORMAÇÕES SOBRE O LIGUE 180📞         ");
            System.out.println("Em relação ao assédio no ambiente de trabalho, o Ligue 180 também pode ser acionado.");
            System.out.println("O serviço orienta sobre os direitos da mulher em situações de assédio,");
            System.out.println("discriminação e outras formas de violência no contexto laboral.");
            System.out.println();
            System.out.println("Além disso, pode fornecer informações sobre como buscar apoio jurídico");
            System.out.println("e psicológico, e encaminhar a vítima para os serviços especializados da rede de atendimento.");
            System.out.println(borda);
            break;
            case '2':
            System.out.println(borda);
            System.out.println("           PRINCÍPIO DA ISONOMIA SALARIAL💡           ");
            System.out.println("A Constituição Federal (art. 5º e art. 7º, inciso XXX)");
            System.out.println("garante igualdade de remuneração para trabalho de igual valor,");
            System.out.println("sem distinção de sexo, idade, cor ou estado civil.");
            System.out.println(borda);
            break;
            case '3':
            System.out.println(borda);
            System.out.println("           POLÍTICAS DE EQUIDADE DE GÊNERO⚖️             ");
            System.out.println("Empresas públicas e privadas estão adotando");
            System.out.println("políticas de cotas e ações afirmativas para");
            System.out.println("promover a presença feminina em cargos de");
            System.out.println("liderança e ampliar a equidade de gênero.");
            System.out.println(borda);
            break;
            case '4':
            System.out.println(borda);
            System.out.println("           ORGÃOS QUE OFERECEM AJUDA🤝             ");
            System.out.println("CAPS(Centros de Atenção Psicossocial) Para transtornos mentais ou sofrimento pós-trauma");
            System.out.println("CRAS e CREAS:Apoio social, auxílio emergencial, encaminhamentos.");
            System.out.println("ONGs e coletivos feministas:Oferecem acolhimento, psicólogas voluntárias, orientação jurídica");
            System.out.println(borda);
            break;
            default:
            System.out.println("Não identificado!");
                break;
        }
        
        System.out.println("Deseja receber uma mensagem de motivação?");
        String mensagem = sc.nextLine();

        if(mensagem.equalsIgnoreCase("Sim")){
        System.out.println();   
        System.out.println("   'Eu sou um ser humano e, como tal, mereço todos os direitos");
        System.out.println("     e liberdades de qualquer outro ser humano.'");
        System.out.println("                     – Malala Yousafzai");
        }else if(mensagem.equalsIgnoreCase("Talvez")) {
            System.out.println(); 
            System.out.println("As informações acima são importantes e merecem ser divulgadas!");
            System.out.println("A luta feminina é constante e desafiadora, mas é através dessa jornada diária");
            System.out.println("que nos fortalecemos e conquistamos nossos espaços.");
            System.out.println("Que possamos sempre buscar nossos sonhos, ocupar lugares de relevância");
            System.out.println("e, assim, transformar a realidade, quebrando estigmas e preconceitos.");
            System.out.println("Juntas, podemos mudar o mundo e construir um futuro mais justo");
            System.out.println("e igualitário para todas.");
        }else{
            System.out.println("ok!");
        }
        
        System.out.println();  
        System.out.println("Deseja repetir o processo ? " + '\n' + "[1- continuar] " + '\n' + "[2- não obrigado] ");
        repetir = sc.next().charAt(0);
        sc.nextLine();
    }
    System.out.println("OBRIGADA POR PARTICIPAR! ");
   
    }
    }
