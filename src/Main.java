import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1.Создать коллекцию, содержащюю объекты HeavyBox.
        // 2.Написать метод котрый перебирает элементы коллекции и проверяет вес коробок.
        // 3.Если вес коробки выше 300 гр, коробка перемещается в другую коллекцию.

        class HeavyBox {
            int weight;

            HeavyBox(int weight) {
                this.weight = weight;
            }

            @Override
            public String toString() {
                return weight + " гр";
            }

            public int getWeight() {
                return weight;
            }

            public void setWeight(int weight) {
                this.weight = weight;
            }
        }

        ArrayList<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(125));
        boxes.add(new HeavyBox(658));
        boxes.add(new HeavyBox(398));
        boxes.add(new HeavyBox(147));
        boxes.add(new HeavyBox(222));
        boxes.add(new HeavyBox(493));
        boxes.add(new HeavyBox(29));
        boxes.add(new HeavyBox(357));
        boxes.add(new HeavyBox(299));

        System.out.println(boxes);
        ArrayList<HeavyBox> boX = new ArrayList<>();
        // перебрать коллекцию
        for (HeavyBox heavyBox : boxes) {
            if (heavyBox.getWeight() >= 300) {
                boX.add(heavyBox);
            }
        }
        System.out.println("<--------New collection-------->");
        System.out.println(boX);
    }
}
