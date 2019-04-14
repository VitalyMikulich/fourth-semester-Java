package by.bsu.lab5;

public class ArtExhibition {

    private String nameOfExhibition;
    private String durOfExhibition;
    private ArtObject allArtObjects;

    private ArtObject pic1;
    private ArtObject pic2;
    private ArtObject pic3;

    public ArtExhibition(String nameOfExhibition, String durOfExhibition) {
        this.nameOfExhibition = nameOfExhibition;
        this.durOfExhibition = durOfExhibition;
    }

    public String getNameOfExhibition() {
        return this.nameOfExhibition;
    }

    public String getDurOfExhibition() {
        return this.durOfExhibition;
    }

    public void show() {
        System.out.println("Название выставки: " + getNameOfExhibition() + "|" + "Время проведения: " + getDurOfExhibition());
    }

    public static class  ArtObject {
        private String name;
        private String author;
        private String date;

        public ArtObject(String name, String author, String date) {
            this.name = name;
            this.author = author;
            this.date = date;
        }

        public String getName() {
            return this.name;
        }

        public String getAuthor() {
            return this.author;
        }

        public String getDate() {
            return this.date;
        }

        public void show() {
            System.out.println("Картина " + getName()+ "|" + "Автор: " + getAuthor()+ "|" + "Дата показа: " + getDate());
        }
    }


//    public final void init() {
//        pic1 = new ArtObject("Восход солнца", "Айвазовский", "10.04.2019 - 15.04.2019");
//        pic2 = new ArtObject("Пик солнца", "Шагал", "12.04.2019 - 17.04.2019");
//        pic3 = new ArtObject("Закат солнца", "Пикассо", "09.04.2019 - 11.04.2019");
//
//        pic1.show();
//        pic2.show();
//        pic3.show();
//    }
}
