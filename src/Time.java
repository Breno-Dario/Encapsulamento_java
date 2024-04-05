    public class Time {
        private String tecnico;
        private String goleiro;
        private String artilheiro;

        public void setTecnico(String tecnico) {
            this.tecnico = tecnico;
        }

        public  String getTecnico() {
                return  tecnico;
        }

        public void setGoleiro(String goleiro){
                this.goleiro = goleiro;
        }

        public String getGoleiro() {
                return goleiro;
        }

        public void setArtilheiro (String artilheiro){
                this.artilheiro = artilheiro;
        }

        public String getArtilheiro (){
                return artilheiro;
        }
}
        class TesteTime {
        public static void main(String[] args){

            Time time = new Time();

              time.setTecnico("Gustavo Reis \n");
              time.setGoleiro("Luiz Felipe, (Camiseta 12) \n");
              time.setArtilheiro("Gabriel Pontes, (Camiseta 6) \n");

                System.out.println("Técnico: " + time.getTecnico());
                System.out.println("Goleiro: " + time.getGoleiro());
                System.out.println("Artilheiro: " + time.getArtilheiro());
                }
        }