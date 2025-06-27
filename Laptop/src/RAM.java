class RAM {

    String size;
    float ramGen;



    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public float getRamGen() {
        return ramGen;
    }

    public void setRamGen(float ramGen) {
        this.ramGen = ramGen;
    }

     @Override
     public String toString(){
         return "RAM { Size : "+size+", Generation : "+ramGen + " }";
     }
}
