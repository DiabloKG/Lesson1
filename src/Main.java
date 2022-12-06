public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog(EnumColor.WHITE, new Shelter("Шевченко 123", "Вечный покой"),
                "Чарли","Хотдог");
        System.out.println(dog1.getInfo());
        Dog dog2 = new Dog(EnumColor.BLACK, new Shelter("Космическая 32", "Новый дом"));
        System.out.println(dog2.getInfo());
        Dog dog3 = new Dog(EnumColor.GRAY ,new Shelter("Рязанская 287", "Гав гав"),
        "Марс", "Овчарка", new String[]{"Сидеть ", " Голос "});
        System.out.println(dog3.getInfo());
    }
}