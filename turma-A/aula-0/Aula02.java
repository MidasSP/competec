import java.util.Scanner;
public class Aula02{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();
    
        int accumulator = 1;

            if(num % 2 != 0){
                while(accumulator != num){
                    accumulator = num;
                    System.out.println(accumulator);
                }
            }
        

        input.close();
        
        //TABUADA
        /*System.out.print("Digite o número desejado: ");
        int num = input.nextInt();
        int result;
        for(int tabuada = 0; tabuada <= 10;tabuada++){
            result = num * tabuada;
            System.out.println(num+ " X " + tabuada + " = " + result);
        }*/
        
        //SABER SE A SENHA É VALIDA
        /* int senha = 0;
        while(senha != 12345){
            System.out.print("(Use apenas números) Digite a senha: ");
            senha = input.nextInt();
            if(senha != 12345){
                System.out.println("Senha ínvalida");
            } 
        }
        System.out.println("Senha valida"); */

        // SOMA 1 ATÉ 100
        /*int i = 0;
        int accumulator = 0;
        while(i < 100){
            System.out.println(i);
             accumulator += i;
            i++;
        }
        System.out.println(accumulator);*/
        
        //CODIGO IMPAR E PAR
        /*System.out.print("Digite um número para saber se ele é par ou impar: ");
        int num1 = input.nextInt();
        if(num1 % 2 == 0){
            System.out.println("É par");
        }else{
            System.out.println("É impar");
        }*/

        //CODIGO DDD 
        /* int ddd = input.nextInt();
        System.out.print("Digite o DDD: ");
        
        //----------------------------------------------------------------------
        // Sudeste
        if(ddd == 11||ddd == 2||ddd ==13||ddd == 14||ddd == 15||ddd == 16||ddd == 17||ddd == 18||ddd == 19){
            System.out.println("São Paulo");
            System.out.print("PÔo mano \n");
        }else if(ddd == 21 || ddd == 22 || ddd == 24){
            System.out.println("Rio de Janeiro");
            System.out.print("Pegou a visão mermão? \n");
        }else if(ddd == 31 || ddd == 32 ||ddd == 33 || ddd == 34 || ddd == 35 ||ddd == 37 ||ddd == 38){
            System.out.println("Minas Gerais");
            System.out.print("Alguma frase xenofobica (:\n");
        }else if(ddd == 27 || ddd == 28 ){
            System.out.println("Espírito Santo");
            System.out.print("Alguma frase xenofobica (:\n");
        }
        
        //----------------------------------------------------------------------
        //Sul
        else if(ddd == 41 || ddd == 42 || ddd == 43 || ddd == 44 || ddd == 45 || ddd == 46){
            System.out.println("Paraná");
            System.out.print("PAlguma frase xenofobica (:\n");
        }
        else if(ddd == 51 || ddd == 52 || ddd == 53 || ddd == 54 || ddd == 55){
            System.out.println("Rio Grande do Sul");
            System.out.print("Alguma frase xenofobica (:\n");
        }
        else if(ddd == 47 || ddd == 48 || ddd == 49){
            System.out.println("Santa Catarina");
            System.out.print("Alguma frase xenofobica (: \n");
        }

        //----------------------------------------------------------------------
        //Norte
        else if(ddd == 68){
            System.out.println("Acre");
            System.out.print("Alguma frase xenofobica (: \n");
        }
        else if(ddd == 96){
            System.out.println("Amapá");
            System.out.print("Alguma frase xenofobica (: \n");
        }
        else if(ddd == 92 || ddd == 97){
            System.out.println("Amazonas");
            System.out.print("Alguma frase xenofobica (: \n");
        }
        else if(ddd == 91 || ddd == 93 || ddd == 94){
            System.out.println("Pará");
            System.out.print("Alguma frase xenofobica (: \n");
        }
        else if(ddd == 69){
            System.out.println("Rondonia");
            System.out.print("Alguma frase xenofobica (: \n");
        }
        else if(ddd == 95){
            System.out.println("Roraima");
            System.out.print("Alguma frase xenofobica (: \n");
        }
        else if(ddd == 63){
            System.out.println("Tocantins");
            System.out.print("Alguma frase xenofobica (: \n");
        }
        
        //----------------------------------------------------------------------
        //Nordeste
        else if(ddd == 82){
            System.out.println("Alagoas");
            System.out.print("Alguma frase xenofobica (: \n");
        }
        else if(ddd == 71 || ddd == 73 || ddd == 74 || ddd == 75|| ddd == 77){
            System.out.println("Bahia");
            System.out.print("Alguma frase xenofobica (: \n");
        }
        else if(ddd == 85 || ddd == 88){
            System.out.println("Ceará");
            System.out.print("Alguma frase xenofobica (: \n");
        }
        else if(ddd == 98 || ddd == 99){
            System.out.println("Maranhão");
            System.out.print("Alguma frase xenofobica (: \n");
        }
        else if(ddd == 83){
            System.out.println("Paraíba");
            System.out.print("Alguma frase xenofobica (: \n");
        }
        else if(ddd == 81 || ddd == 87){
            System.out.println("Pernambuco");
            System.out.print("Alguma frase xenofobica (: \n");
        }
        else if(ddd == 86 || ddd == 89){
            System.out.println("Piauí");
            System.out.print("Alguma frase xenofobica (: \n");
        }
        else if(ddd == 84){
            System.out.println("Rio Grande do Norte");
            System.out.print("Alguma frase xenofobica (: \n");
        }
        else if(ddd == 79){
            System.out.println("Sergipe");
            System.out.print("Alguma frase xenofobica (: \n");
        }

        //----------------------------------------------------------------------
        //Centro-Oeste
        else if(ddd == 61){
            System.out.println("Distrito Federal");
            System.out.print("Alguma frase xenofobica (: \n");
        }
        else if(ddd == 62 || ddd == 64){
            System.out.println("Goiás");
            System.out.print("Alguma frase xenofobica (: \n");
        }
        else if(ddd == 65 || ddd == 66){
            System.out.println("Mato Grosso");
            System.out.print("Alguma frase xenofobica (: \n");
        }
        else if(ddd == 67){
            System.out.println("Mato Grosso do Sul");
            System.out.print("Alguma frase xenofobica (: \n");
        }else{
            System.out.println("ERRO DE SINTAXE!!!");
            System.out.print("Dica: Escreve o bagulho direito! \n");
        } */
    }
}