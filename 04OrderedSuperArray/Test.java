import java.util.Random;
import java.util.Arrays;

public class Test {
    // because it takes too long to write :P
    public static void sop(Object o) {
	System.out.println(o);
    }

    public static void main(String[] args) {
	/*
	 * OrderedSuperArray<String> osa = new OrderedSuperArray<String>();
	 * osa.add("hello"); sop(osa); osa.add("jello"); sop(osa);
	 * osa.add("interrogate"); sop(osa); osa.add("abacus"); sop(osa);
	 * osa.add("cancer"); sop(osa);
	 * 
	 * OrderedSuperArray<Integer> osai = new OrderedSuperArray<Integer>();
	 * osai.add(new Integer(3)); osai.add(new Integer(7)); osai.add(new
	 * Integer(1)); osai.add(new Integer(3)); sop(osai);
	 * 
	 * //osai.add("ERROR");
	 * 
	 * 
	 * SuperArray<String> sa = new SuperArray<String>(); sa.add("alpha");
	 * sa.add("charlie"); sa.add("delta"); sa.add("bravo"); sa.add("echo");
	 * sa.add("foxtrot"); sop(sa); sa.insertionSort(); sop(sa);
	 */

	int length = 10;
	sop(">> Sorting lists of length: " + length);

	Random randy = new Random();
	SuperArray<String> saa = new SuperArray<String>();
	SuperArray<String> sab = new SuperArray<String>();
	String[] ia = new String[length];
	String t;

	sop(">> Constructing lists...");
	for (int i = 0; i < length; i++) {
	    t = (new Integer(randy.nextInt(51))).toString();
	    ia[i] = t;
	    saa.add(t);
	    sab.add(t);
	}

	sop(">> Sorting array...");
	Arrays.sort(ia); //
	//sop(Arrays.toString(ia));

	sop(">> Insertion sorting SuperArray...");
	saa.insertionSort(); //
	//sop(saa);

	sop(">> Selection sorting SuperArray...");
	sab.selectionSort(); //
	//sop(sab);

	sop(">> iS .equals()?");
	sop(Arrays.toString(ia).equals(saa.toString()));

	sop(">> sS .equals()?");
	sop(Arrays.toString(ia).equals(sab.toString()));

	/*
	 * SuperArray<String> arraySupreme = new SuperArray<String>();
	 * arraySupreme.add("zero"); arraySupreme.add("one");
	 * arraySupreme.add("two"); arraySupreme.add("three");
	 * arraySupreme.add("four"); arraySupreme.add("five");
	 * sop(arraySupreme); sop(arraySupreme.find("zero"));
	 * sop(arraySupreme.find("five"));
	 * sop(arraySupreme.find("negative one")); System.out.println();
	 * 
	 * OrderedSuperArray<String> spicyArray = new
	 * OrderedSuperArray<String>(); String[] s = { "alpha", "bravo",
	 * "delta", "charlie", "echo", "foxtrot", "golf", "hotel", "india",
	 * "juliet", "kilo", "lima", "mike", "november", "oscar", "papa",
	 * "quebec", "romeo", "sierra", "tango", "uniform", "victor", "whiskey",
	 * "x-ray", "yankee", "zulu" }; spicyArray.add(s); sop(spicyArray);
	 * sop(spicyArray.find("alpha")); sop(spicyArray.find("hotel"));
	 * sop(spicyArray.find("yankee"));
	 */
    }
}
