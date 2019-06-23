package jichu.enumDemo;

public enum Test1 {
    ZENG("hensuia"),
    ZHOU("aaa"),
    WANG("11111"),
    LI("2222");
//    ZENG,
//    ZHOUU,
//    WANG,
//    LI;

    private String description;
    private Test1(String description){
      this.description=description;
    }

    public String getDescription(){
        return description;
    }

}
