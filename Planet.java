class Planet{

  String name; 
  int size;

  public Planet(String name, int size){
    this.name = name;
    this.size = size; 
  }

  public String getName(){
    return this.name;
  }

  public int getSize(){
    return this.size;
  }

  public String explode(){
    String sentence = String.format("Boom! %s has exploded.", this.name);
    return sentence; 
  }


}