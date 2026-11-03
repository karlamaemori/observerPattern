public class NewsApp {
    public static void main(String[] args) {
        Subscriber kei = new Subscriber("Kei", NewsCategory.ALL);
        Subscriber cae = new Subscriber("Cae", NewsCategory.SPORTS);
        Subscriber bosse = new Subscriber("Bosse", NewsCategory.TECHNOLOGY);

        NewsAgency agency = new NewsAgency("GMA News");
        agency.attach(kei);
        agency.attach(cae);
        agency.attach(bosse);

        System.out.println("Updates!");
        System.out.println(agency.publishNews("Eala talks 'intimidating' Nadal, fan frenzy in breakthrough year", NewsCategory.SPORTS));

        agency.detach(cae);
        Subscriber jean = new Subscriber("Jean", NewsCategory.ALL);
        agency.attach(jean);

        System.out.println("Updates recently:");
        System.out.println(agency.publishNews("New CEO unveils Apple's first foldable iPhone", NewsCategory.TECHNOLOGY));

        bosse.setPreference(NewsCategory.POLITICS);

        System.out.println("Updates after Bosse changed his preference!");
        System.out.println(agency.publishNews("House prosecution panel member denies 'shoot-to-kill claim vs Bato", NewsCategory.POLITICS));
    }
}