public class Veiculo1{
public String marca;
public String modelo;
public int ano;
public boolean velocidadeAtual;
public boolean motorLigado;
publics double combustivel;


public Veiculo1(String marca, String modelo, int ano, double combustivel){
     this.marca = marca;
     this.modelo = modelo;
     this.ano = ano;
     this.VelocidadeAtual = 0;
     this.motorLiagado = false;
     this.combustivel = combustivel;
}
    public Veiculo1(){

    }


public void ligarMotor(){
 if(this.motorLigado){
    System.out.println("O motor já esta ligado");
 }else{
    this.motorLiagado = true;
    System.out.println("Motor ligado");
 }


}

public void desligarMotor(){
    if(this.motorLigado){
        this.motorLigado = false;
        System.out.println("motor desligado");
    }else{
        System.out.println("motor já esta desligado");

        }
    }
   public void acelerar(){
    if (!this.motorLigado){
        System.out.println("nn é possivela acelerar com o motor desligado");
    }else{
        if (this.combustivel > 0){
            System.out.println("Não ha combustivel");
        }else{
            this.velocidadeAtual = this.VelocidadeAtual + 10;
            this.combustivel -=0.5;
            System.out.println("Velocidade atual é" +this.velocidadeAtual);
       
        }


   } 
}
public void frear (){
  if (this.VelocidadeAtual > 0){
    this.velociadeAtual -= 10;
    if (this.VelocidadeAtual < 0){
        this.velocidadeAtual = 0;
    }
    System.out.println("A velocidade atual" + this.velocidadeAtual);
  }else{
    System.out.println("O carro já esta parado");
  }  
}
public void exibirInfo(){
    System.out.println("Informaçoes do veiculo: \n" + 
                       "Marca  " + this.marca + "\n" +
                       "Modelo"  + this.modelo + "\n" +
                       "Ano" + this.ano + "\n" +
                       "VelocidadeAtual" + this.VelocidadeAtual + "\n" +
                       "Motor Ligado"  + (this.motorLigado? "SIM" :"nAO") +
                       "Combustivel" + this.combustivel );

                       }
                       public void abastecer (double combustivel){
                        if(this.VelocidadeAtual<= 0) {
                            if (!motorLigado){
                                this.combustivel += combustivel;
                            }
                        }
                        this.combustivel += combustivel;
                        System.out.println("Abatecido com" + combustivel + "litros");
                        System.out.println("Combustivel atual" + this.combustivel + "litros");
                    
                    }


}




