import java.util.Arrays;

public final class  Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;
    public Dog(EnumColor color, Shelter shelter) {
        super(color, shelter);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public Dog(EnumColor color, Shelter shelter, String name, String breed, String[] commands) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public Dog(EnumColor color, Shelter shelter, String name, String breed) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;
    }
    public void makeVoice(String voice){
        for (int i = 0; i < voice.length(); i++) {
            System.out.println(voice);
        }
    }
    public void makeVoice(String voice, Integer count){
        for (int i = 0; i < count; i++) {
            System.out.println(voice);
        }
    }
    public void makeVoice(){
        System.out.println("Шум");
    }
    public String getInfo1(){
        return  super.getInfo() +
                "\n Name: " + name +
                "\n Breed: " + breed +
                "\n Commands: " + Arrays.toString(commands);
    }
}

