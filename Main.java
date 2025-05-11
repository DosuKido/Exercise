public class Main {
    public static void main(String[] args) {
        Character character = CharacterManagement.deserializeCharacter("character.ser");
        if (character != null) {
            System.out.println(character);
            CharacterManagement.action(character);
            System.out.println(character);
            CharacterManagement.serializeCharacter(character, "hero.ser");
            Character finalCharacter = CharacterManagement.deserializeCharacter("hero.ser");
            System.out.println(finalCharacter);
        } else {
            System.err.println("Loi character.ser.");
        }
    }
}
