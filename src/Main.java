public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog(EnumColor.WHITE, new Shelter("Шевченко 123", "Вечный покой"),
                "Чарли","Хотдог");
        System.out.println(dog1.getInfo1());
        Dog dog2 = new Dog(EnumColor.BLACK, new Shelter("Космическая 32", "Новый дом"));
        System.out.println(dog2.getInfo1());
        Dog dog3 = new Dog(EnumColor.GRAY ,new Shelter("Рязанская 287", "Гав гав"),
        "Марс", "Овчарка", new String[]{"Сидеть ", " Голос "});
        System.out.println(dog3.getInfo1());
        dog1.makeVoice();
        dog2.makeVoice("Гав");
        dog3.makeVoice("Аууу", 7);
    }
}