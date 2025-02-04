# Projekt_Testiranje

Ovaj projekt automatski testira web stranicu PolleoSport koristeći Selenium WebDriver i TestNG. Testovi provode različite akcije na stranici, kao što su pretraga, prijava, registracija, dodavanje proizvoda u košaricu i završavanje kupovine.

## Tehnologije

1. Java - Programsko okruženje za pisanje testova.
2. Selenium WebDriver - Koristi se za automatizaciju interakcije sa web stranicama.
3. TestNG - Okvir za testiranje koji se koristi za izvršavanje testova.
4. Maven - Alat za upravljanje ovisnostima i izgradnjom projekta.
5. ChromeDriver - Omogućava Selenium-u da kontrolira Google Chrome preglednik.

## Preduvjeti

Prije nego što pokrenete ovaj projekt, potrebno je da instalirate:

1. Java JDK - Preporučuje se JDK 17. Instalaciju možete pronaći na [Oracle JDK stranici](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html).
2. Maven - Instalirajte Maven sa [Maven stranice](https://maven.apache.org/download.cgi).
3. ChromeDriver - Preuzmite odgovarajući ChromeDriver za vaš Google Chrome preglednik s [ChromeDriver stranice](https://sites.google.com/a/chromium.org/chromedriver/).

## Instalacija

1. Klonirajte projekt:

   ```bash
   git clone https://github.com/your-username/polleosport-automation.git
   cd polleosport-automation

2. Instalirajte Maven ovisnosti: Otvorite terminal u root direktoriju projekta i pokrenite:
mvn install

3. Pokrenite testove: Da biste pokrenuli testove, koristite:
mvn test

Maven će preuzeti sve potrebne ovisnosti, a TestNG će automatski pokrenuti testove.

4. Struktura Projekta
   
polleosport-automation/
│
├── src/
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── PolleoSportTest.java  # Glavna testna klasa
│
├── pom.xml                        # Maven konfiguracija
├── README.md                      # Ovaj dokument
└── .gitignore                     # Git konfiguracija


5. Objašnjenje Koda
   
PolleoSportTest.java

TestNG Anotacije: Anotacije poput @Test, @BeforeClass, @AfterClass koriste se za definisanje testova, pokretanje setup-a prije testova i čišćenje nakon njih.

Selenium WebDriver: Upotrijebljen za otvaranje web stranica, pronalaženje elemenata pomoću By klasa i interakciju s njima (klik, unos teksta, odabir opcije iz padajućeg menija, itd.).

Assertions: TestNG assertTrue i assertEquals metode koriste se za provjeru ispravnosti svake operacije.

6. Testovi:
   
Test1: testGoogleSearchAndClickAd: Pretraga za Polleo Sport na Google-u i klik na oglas.

Test2: testDeclineCookiePopupAndVisitHomepage: Odbacivanje kolačića i provjera početne stranice.

Test3: testNavigateToLoginAndRegisterPage: Navigacija prema prijavi i registraciji.

Test4: testAddItemToCartAndSelectOption: Dodavanje proizvoda u košaricu i odabir opcije.

Test5: testSearchAndCompletePurchase: Pretraga, ispunjavanje podataka za narudžbu i završavanje kupovine.
