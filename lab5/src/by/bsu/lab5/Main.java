package by.bsu.lab5;

public class Main {
    public static void main(String[] args) {
        ArtExhibition exhibition = new ArtExhibition("Выставка картин", "09.04.2019 - 17.04.2019");

//        ArtExhibition.ArtObject pic1 = new ArtExhibition.ArtObject("Восход солнца", "Айвазовский", "10.04.2019 - 15.04.2019");
//        ArtExhibition.ArtObject pic2 = new ArtExhibition.ArtObject("Пик солнца", "Шагал", "12.04.2019 - 17.04.2019");
//        ArtExhibition.ArtObject pic3 = new ArtExhibition.ArtObject("Закат солнца", "Пикассо", "09.04.2019 - 11.04.2019");

        exhibition.show();
        exhibition.init();
//        pic1.show();
//        pic2.show();
//        pic3.show();

        ArtExhibition exc = new ArtExhibition("Выставка", "01.01.2000 - 17.01.2000") {
            @Override
            public void show() {
                System.out.println("Это не та выставвка");
            }

        };
        exc.show();
    }


}
