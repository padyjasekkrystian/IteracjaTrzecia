package metody;

public class Main {

	public static void main(String[] args) {

		wyswietlTekst();
		System.out.println(pokazTekst());
		
		String a = pokazTekst();
		System.out.println(a);
		
		System.out.println(pokazTekst().length());
		
		System.out.println("Jeden parametr: " + pokazLiczbe(3));
		System.out.println("Dwa parametry: " + pokazLiczbe(3, 2));
		System.out.println(dzienDobry("Maciek"));
		System.out.println("suma = " + suma(2, 3));
		System.out.println("roznica = " + roznica(2, 3));
		System.out.println("iloczyn = " + iloczyn(2, 3));
		System.out.println("iloraz = " + iloraz(2, 3));
		System.out.println(licznik(1, 2, 4));
		System.out.println("dlugosc stringa: " + dlugoscStringa("adam"));
		System.out.println("dluzszy wyraz: " + dluzszy("Bartek", "Ola"));
		System.out.println("wieksza liczba: " + wieksza(3, 25));
		System.out.println("suma liczb = " + sumaLiczb(20, 24));
		System.out.println(pierwszaLitera("zameky"));
		System.out.println("czy bad " + bad("xxbadkkkk"));
		System.out.println("czy wieksza od 10: " + wiekszaOd10(12));
		System.out.println("Czy stringi takie same: " + takieSame("Maciek", "Maciek"));
		System.out.println("czy zawiera: " + czyZawiera("Maciek", 'w'));
		System.out.println("potegowanie: " + potegowanie(2, 3));
		System.out.println("silnia: " + silnia(3));
		System.out.println("Parzysta: " + czyParzysta(6));
		System.out.println("licznik: " + ileRazy("Ania", 'a'));
		System.out.println("jednosci wieksza: " + ktoraWieksza(82));
		System.out.println("suma cyfr = " + sumaCyfr(1234));
		System.out.println("czy kwadrat: " + czyKwadrat(15));
		dzielniki(27);
	}

	// metoda typu void nic nie zwraca
	public static void wyswietlTekst() {
		System.out.println("Hejo co tam?");
	}

	// metoda ktora MUSI cos zwracac,np String, int, int[], boolean itp
	public static String pokazTekst() {
		return "Ala ma kota";
	}
	
	//parametry metod
	public static int pokazLiczbe(int a) {
		return a + 5;
	}
	
	//przeciazenie metod, tak samo nazywajaca sie metoda, ale z inna liczba parametrow, badz innym typem parametru
	public static int pokazLiczbe(int a, int b) {
		return a + b + 2;
	}
	
	// Napisz metode, ktora dodaje do Stringa podanego jako parametr napis "dzien dobry"
	
	public static String dzienDobry(String slowo) {
		return "dzien dobry " + slowo;
	}
	
	// Stworz metode ktora liczy sume dwoch liczb ktore sa podane jako parametr
	
	public static double suma(double a, double b) {
		return a + b;
	}
	
	public static double roznica(double a, double b) {
		return a - b;
	}
	
	public static double iloczyn(double a, double b) {
		return a * b;
	}
	
	public static double iloraz(double a, double b) {
		return a/b;
	}
	
	// Napisz metode ktora jako argument (parametr) przyjmuje
	// 3 zmienne typu int i liczy sume pierwszej i drugiej i mnozy przez trzecia
	
	public static int licznik(int a, int b, int c) {
		return (a + b) * c;
	}
	
	// Stwórz metode ktora zwraca dlugosc Stringa podanego jako parametr
	
	public static int dlugoscStringa(String wyraz) {
		return wyraz.length();
	}
	
	// Stworz metode ktora zwraca dluszzy z dwoch podanych jako parametr Stringow
	
	public static String dluzszy(String wyraz1, String wyraz2) {
		if(wyraz1.length() > wyraz2.length()) {
			return wyraz1;
		}else {
			return wyraz2;
		}
	}
	

	// Stworz metode ktora zwraca wieksza z dwoch podanych liczb typu double jako
	// parametr
	
	public static double wieksza(double a, double b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}
	
	// Napisz metode ktora zwraca sume dwoch liczb ale z uwaga ze jesli ktoras z podanych liczb jest z przedzialu [13,19] 
	// to zwrocona wartosc to zawsze 19
	
	public static double sumaLiczb(double a, double b) {
		if((a >= 13 && a <= 19) || (b >= 13 && b <=19)) {
			return 19;
		}else {
			return a + b;
		}
	}
	
	//Napisz metode ktora przyjmuje jako parametr Stringa, jesli String zaczyna sie na z zwroc napis zzz, jesli konczy sie na y zwroc napis yyy
		// jesli zaczyna sie na z i konczy na y zwroc zzyy, w kazdym innym przypadku zwroc stringa niezmienionego
	//startsWith("xxx") - zwraca true jesli String zaczyan sie od xxx
	//endsWith("xxx") - zwraca true jesli String konczy sie na xxx
	
	public static String pierwszaLitera(String wyraz) {
		if(wyraz.startsWith("z") && wyraz.endsWith("y")) {
			return "zzzyyy";
		}else if(wyraz.startsWith("z")) {
			return "zzz";
		}else if(wyraz.endsWith("y")) {
			return "yyy";
		}else {
			return wyraz;
		}	
	}
	
	
	//Sprawdz czy poday String jako parametr zaczynajac od 0 lub 1 indeksu ma w sobie slowo bad
	//xbadxxx - true
	//badxxx - true
	//xxbadxx - false
	//substring(x,y) zwraca Stringa od x do y (uwzgedlaniac x, nieuwzgledniajac y)
	
	public static boolean bad(String wyraz) {
		if (wyraz.length() <= 3 && !wyraz.startsWith("bad")) {
			return false;
		}else if (wyraz.startsWith("bad") || wyraz.substring(1).startsWith("bad")) {
				return true;
		}
		return false;
	}
	
	//1) Napisz metodê, która przyjmuje jako argument liczbê i sprawdza czy jest to liczba wiêksza od 10.
	
	public static boolean wiekszaOd10(double a) {
		return a > 10;
	}
	
	//2) Napisz metodê, która przyjmuje jako parametr 2 Stringi i sprawdza czy s¹ takie same.

	public static boolean takieSame(String wyraz1, String wyraz2) {
		return wyraz1.equals(wyraz2);
	}
	
	//3) Napisz metode, która przyjmuje jako parametr Stringa i char, zwraca true jeœli char zawier¹ siê w
	//Stringu. Np metoda(„witam”, ‘w’) powinna zwróciæ true bo w jest w s³owie witam.
	
	public static boolean czyZawiera(String wyraz, char znak) {
		for(int i = 0; i < wyraz.length(); i++) {
			if(znak == wyraz.charAt(i)) {
				return true;
				
			}
		}
		return false;
	}
	
	//4) Napisz metode, która jako argument przyjmuje dwie liczby a i b i zwraca a do potegi b
	
	public static double potegowanie(double a, double b) {
		return Math.pow(a, b);
	}
	
	//5) Napisz metodê, która przyjmuje jako parametr liczbê i oblicza jej silnie.
	
	public static int silnia(int a) {
		if(a < 1) {
			return 1;
		}else {
			return a * silnia(a - 1);
		}
		
	}
	
	// Napisz metode ktora przyjmuje jako argument liczbe i sprawdza czy jest to
	// liczba parzysta
	
	public static boolean czyParzysta(int a) {
		return a%2 == 0;
	}
	
	// Napisz metode ktora liczy ile razy podany znak wystepuje w podanym Stringu.
	
	public static int ileRazy(String wyraz, char znak) {
		int licznik = 0;
		for(int i = 0; i < wyraz.length(); i++) {
			if(wyraz.toLowerCase().charAt(i) == znak) {
				licznik++;
			}
		}
		return licznik;
	}

	// napisz metoda ktora sprawdza czy podana liczba dwucyfrowa ma wieksza cyfre
	// jednosci od cyfry dziesiatek,  28-> true, 73->false
	
	public static boolean ktoraWieksza(int a) {
		return a/10 < a%10;
	}
	
	// Napisz funkcjê, która wyznacza sumê cyfr podanej liczby ca³kowitej.
	// czyli np dla 1843, wynik to 16
	
	public static int sumaCyfr(int a) {
		int suma = 0;
		while(a != 0) {
			suma += a % 10;
			a /= 10;
		}
		
		return suma;
	}
	
	// Napisz metode ktora jako argument przyjmuje dwie liczby i liczy ich potegi,
	// dla argumentow 3^4 ma obliczyc 3*3*3*3 = 81
	// uwzglednic ze a^0 = 1
	// uwzglednic ze a^-b = 1/(a^b)
	
	public static double potegowanie2(double a, double b) {
		double wynik = 1;

		// Math.abs(x) - wartosc bezwzgledan z x
		for (int i = 1; i < Math.abs(b); i++) {
			wynik *= a;
		}

		if (b == 0) {
			return 1;
		} else if (b < 0) {
			return 1 / wynik;
		} else {
			return wynik;
		}
	}
	
	// Napisz funkcje, ktora stwierdza, czy zadana jako parametr liczba calkowita
	// jest kwadratem
	// pewnej liczby calkowitej. Liczby bedace kwadratami liczb calkowitych to 1, 4,
	// 9, 16 itd.
	// Wartosci funkcji ma byc prawda, jesli liczba spelnia warunek oraz falsz w
	// przeciwnym wypadku. Math.sqrt(x) zwraca pierwiastek z x
	//sqrt 16 = 4
	//sqrt 17 = 4.2
	
	public static boolean czyKwadrat(int a) {		
		return Math.sqrt(a)%1 == 0;		
	}
	
	// Wypisz dzielniki liczby naturalnej podanej jako parametr
	
	public static void dzielniki(int a) {
		
		for(int i = 1; i <= a; i++) {
			if(a%i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
