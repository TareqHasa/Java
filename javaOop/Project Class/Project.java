public class Project{
    private String name;
    private String description;

    public String elevatorPitch(){
        return String.format("%s : %s",name,description);
    }

    public Project() {
        name="my name";
        description="my description";
    }

    public Project(String name) {
        this.name=name;
        description="my description";
    }

    public Project(String name, String description) {
        this.name=name;
        this.description=description;
    }

    public String getName(){
        return name;
    }
    public String getDescriotion(){
        return description;
    }
    public void  setName(String name){
        this.name=name;
    }
    public void  setDescriotion(String description){
        this.description=description;
    }

}