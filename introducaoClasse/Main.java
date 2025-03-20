package introducaoClasse;

class Main {
    public static void main(String[] args) {
        pessoa individuo1 = new pessoa ();
        pessoa individuo2 = new pessoa ();
        individuo1.nome ="jose";
        for (int i=0; i<=50; i++) {
            individuo1.setPeso(i*5);
    
            individuo1.setPeso(5); 
        }
       
     

       individuo2.nome ="maria";
     
       // individuo2.setPeso (90);


        System.out.println("individuo1" + individuo1.nome + "peso" + individuo1.getPeso() );
        System.out.println("individuo2" +  individuo2.nome + "peso" + individuo2.getPeso());
        



}
}


    

