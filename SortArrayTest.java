package IndividualGithubExcercise;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Before;

public class SortArrayTest {
    SortArray obj;
	
	@Before
	void createObject() {
		obj = new SortArray();
	}
	
	@Test
	void testIntArray() {
		int[] expected = {10,20,30,40,50,60};
		int[] unsorted = {20,40,60,30,10,50};
		int[] returned = obj.sortInt(unsorted);
		assertArrayEquals(expected,returned);
	}

    //test for negative numbers
    @Test
	void testIntArrayNegativeNumbers() {
		int[] expected = {-9,-5,0,5,8,10};
		int[] unsorted = {-5,-9,5,10,0,8};
		int[] returned = obj.sortInt(unsorted);
		assertArrayEquals(expected,returned);
	}
	
    //test for empty array
	@Test
	void testIntArrayEmpty() {
		int[] expected = {};
		int[] unsorted = {};
		int[] returned = obj.sortInt(unsorted);
		assertArrayEquals(expected,returned);
	}
	
    //test for array containing odd number of elements
	@Test
	void testIntArrayOddLength() {
		int[] expected = {3,6,8,9,12,15,18};
		int[] unsorted = {15,18,9,8,12,6,3};
		int[] returned = obj.sortInt(unsorted);
		assertArrayEquals(expected,returned);
	}
	
    //test to check if sorting happens correctly when there are duplicates
	@Test
	void testIntArrayDuplicates() {
		int[] expected = {5,7,9,9,9,15};
		int[] unsorted = {7,9,5,9,9,15};
		int[] returned = obj.sortInt(unsorted);
		assertArrayEquals(expected,returned);
	}

    //test for any effects that case might have on the sorting
    @Test
	void testStringArrayCase() {
		String[] expected = {"August","December","juLy","June","MaY"};
		String[] unsorted = {"MaY","August","juLy","June","December"};
		String[] returned = obj.sortString(unsorted);
		assertArrayEquals(expected,returned);	
	}
	
    //test to check if sorting happens correctly when there are duplicates
	@Test
	void testStringArrayDuplicates() {
		String[] expected = {"Catch","Fall","Fall","Jump","Run","Stand"};
		String[] unsorted = {"Fall","Stand","Catch","Run","Jump","Fall"};
		String[] returned = obj.sortString(unsorted);
		assertArrayEquals(expected,returned);	
	}
}


