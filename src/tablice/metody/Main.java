package tablice.metody;

import java.util.Arrays;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		int[] tablica = {4,-2,-5,-1,-8,3,0};	
		double[] tablica2 = {2.3, 6.7, 8.0, 4.5, 5.1};
		String[] tablica3 = {"Ola", "Alicja", "Tomek", "Agata"};
		wyswietlTablice(tablica);
		
		System.out.println();
		
		for(int element : zwrocTablice(tablica)) {
			System.out.print(element + " ");
		}
		
		System.out.println("suma liczb: " + sumaLiczb(new int[] {4,2,5,1,6,}));
		wiekszeOd5(tablica2);
		System.out.println();
		wiekszeOd7(tablica);
		System.out.println();
		System.out.println(dlugosciStringow(tablica3));
		System.out.println(najdluzszyString(tablica3));
		System.out.println(srednia(tablica2));
		for(int element: zwracanieTablicy(tablica)) {
			System.out.print(element + " ");
		}
		System.out.println();
		
		for(int element: zwracanieTablicy2(tablica)) {
			System.out.print(element + " ");
		}
		System.out.println();
		
		String[] tablica4 = {"Ola", "Alicja", "Magdalena", "Tomek", "Agata"};
		
		minDwaZnaki(tablica4, 'a');
		
		System.out.println();
		System.out.println(liczbaUjemnychWieksza(tablica));
		
		for(int element: losowe(12)) {
			System.out.print(element + " ");
		}
		System.out.println();
		int[] array = {3, 1, 0, 8, 5, 2, 10, 9};
		for(int num: sort(array)) {
			System.out.print(num + " ");
		}
		System.out.println();
		for(int num: array) {
			System.out.print(num + " ");
		}
		
	}
	
	public static int[] sort(int[] array) {
		int[] sorted = Arrays.copyOf(array, array.length);
		Arrays.sort(sorted);
		return sorted;
	}

	public static void wyswietlTablice(int[] tablica) {
		
		//petla for each
		for(int element : tablica) {
			System.out.print(element + " ");
		}
	}
	
	public static int[] zwrocTablice(int[] tablica) {
		return tablica;
	}
	
	// Napisz metode ktora za swoj parametr przyjmuje tablice intow a nastepnie
		// zwraca sume wszystkich liczb ktore sa umieszczone w tej tablicy.
	
	public static int sumaLiczb(int[] tablica) {
		int suma = 0;
		for(int element : tablica) {
			suma += element;
		}
		
		return suma;
	}
	
	// Napisz metode ktora za swoj parametr przyjmuje tablice doubli, a nastepnie
	// wypisuje wszystkie liczby wieksze od 5.
	
	public static void wiekszeOd5(double[] tablica) {
		for(double element : tablica) {
			if(element > 5) {
				System.out.print(element + " ");
			}
		}
	}
	
	// Napisz metode ktora za swoj parametr przyjmuje tablice intow, a nastepnie
	// wypisuje wszystkie liczby podzielne przez 2 ktore sa wieksze niz 7
	
	public static void wiekszeOd7(int[] tablica) {
		for(int element: tablica) {
			if(element % 2 == 0 && element > 7) {
				System.out.print(element + " ");
			}
		}
	}
	
	// Napisz metode ktora za swoj parametr przyjmuje tablice stringow, a nastepnie
	// zwraca sume dlugosci tych stringów
	
	public static int dlugosciStringow(String[] tablica) {
		int suma = 0;
		for(String element: tablica) {
			suma += element.length();
		}
		return suma;
	}
	
	// Napisz metode ktora za swoj parametr przyjmuje tablice stringow, a nastepnie
		// wypisuje najdluzszy ze stringow
	
	public static String najdluzszyString(String[] tablica) {
		String max = tablica[0];
		for(int i = 0; i < tablica.length; i++) {
			if(tablica[i].length() > max.length()) {
				max = tablica[i];
			}
		}
		return max;
	}
	
	// dla podanej tablicy doubli oblicz srednia jej elementów
	
	public static double srednia(double[] tablica) {
		double suma = 0;
		for(int i = 0; i < tablica.length; i++) {
			suma += tablica[i];
		}
		return suma/tablica.length;
	}
	
	/*
	 * Napisz metode ktora jako parametr przyjmuje tablice intow, a nastepnie zwraca
	 * tablice intow ktora zawiera wartosci: dla liczb nieparzystych dodaje do nich
	 * 3 dla liczb parzystych odejmuje od nich 1
	 * 
	 * Przyklad: dla tablicy {2,3,4,5} nasza metoda powinna zwrocic tablice
	 * {1,6,3,8}
	 */
	
	public static int[] zwracanieTablicy(int[] tablica){
		for(int i = 0; i < tablica.length; i++) {
			if(tablica[i] % 2 == 0) {
				tablica[i] -= 1;
			}else {
				tablica[i] += 3;
			}
		}
		return tablica;
	}
	
	/*
	 * Napisz metode, ktora jako parametr przyjmuje tablice intow i zwraca rowniez
	 * tablice intow zmieniona w nastepujacy sposob: -liczby podzielne przez 3
	 * zamienia na -1 -liczby niepodzielne przez 3 podnosi do kwadratu Dla tablicy =
	 * {2,3,4,5,6} wynik to {4,-1,16,25,-1}
	 */
	
	public static int[] zwracanieTablicy2(int[] tablica) {
		for(int i = 0; i < tablica.length; i++) {
			if(tablica[i] % 3 == 0) {
				tablica[i] = -1;
			}else {
				tablica[i] *= tablica[i];
			}
		}
		return tablica;
	}
	
	// napisz metode ktora przyjmuje jako parametr tablice Stringow i wypisuje te
		// ktore maja przynajmniej 2 znaki podane jako parametr.
	// input: pies, agata, kot, ryba, magda
	// char : a
	//output agata, magda
	public static void minDwaZnaki(String[] tablica, char znak) {
	
		for(String element: tablica) {
			int licznik = 0;
			for(int i = 0; i < element.length(); i++) {
				if(element.toLowerCase().charAt(i) == znak) {
					licznik++;
				}
			}
			if(licznik >= 2) {
				System.out.print(element + " ");
			}
		}
	}
	// dla podanej tablicy intów sprawdz czy liczba elementów ujemnych jest wiêksza
	// od liczby elementow nieujemnych
	
	public static boolean liczbaUjemnychWieksza(int[] tablica) {
		int zmienna = 0;
		for(int element: tablica) {
			if(element < 0) {
				zmienna++;
			}else {
				zmienna--;
			}
		}
		
		return zmienna > 0;
	}
	
	// Napisz metode ktora wypelnia tablice losowymi (ilosc elementow podana jako parametr) wartosciami z przedzialu 1-9 i
		// zwraca tablice posortowana w kolejnosci rosnacej
	
	public static int[] losowe(int iloscElementow) {
		int[] tab = new int [iloscElementow];
		Random losowanie = new Random();
		for(int i = 0; i < tab.length; i++) {
			tab[i] = losowanie.nextInt(9) + 1;
		}
		
		Arrays.sort(tab);
		
		return tab;
		
	}
	
}
