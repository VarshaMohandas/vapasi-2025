class HardDisk {

    String size;
    String type;


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

     @Override
     public String toString(){
         return "HardDisk { Size : "+size+", Type : "+type + " }";
     }
}
