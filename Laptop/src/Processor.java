class Processor {

    int generation;
    float gHz;


     public int getGeneration() {
         return generation;
     }

     public void setGeneration(int generation) {
         this.generation = generation;
     }

     public float getgHz() {
         return gHz;
     }

     public void setgHz(float gHz) {
         this.gHz = gHz;
     }

     @Override
     public String toString(){
         return "Processor { Generation : "+generation+", gHz : "+gHz + " }";
     }
 }
